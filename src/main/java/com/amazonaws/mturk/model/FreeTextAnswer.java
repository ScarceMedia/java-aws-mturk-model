/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jeremy Custenborder
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "FreeTextAnswer", namespace = QuestionForm.NS)
public class FreeTextAnswer extends Answer {

  @XmlElements({
    @XmlElement(name = "IsNumeric", type = IsNumericConstraint.class, namespace = QuestionForm.NS),
    @XmlElement(name = "Length", type = LengthConstraint.class, namespace = QuestionForm.NS),
    @XmlElement(name = "AnswerFormatRegex", type = AnswerFormatRegexConstraint.class, namespace = QuestionForm.NS),})
  @XmlElementWrapper(name = "Constraints", namespace = QuestionForm.NS)
  List<Constraint> constraints = new ArrayList<Constraint>();

  @XmlElement(name = "DefaultText", namespace = QuestionForm.NS)
  String defaultText;
  @XmlElement(name = "NumberOfLinesSuggestion", namespace = QuestionForm.NS)
  Integer numberOfLinesSuggestion;

  public String getDefaultText() {
    return defaultText;
  }

  public void setDefaultText(String defaultText) {
    this.defaultText = defaultText;
  }

  public Integer getNumberOfLinesSuggestion() {
    return numberOfLinesSuggestion;
  }

  public void setNumberOfLinesSuggestion(Integer numberOfLinesSuggestion) {
    this.numberOfLinesSuggestion = numberOfLinesSuggestion;
  }

}
