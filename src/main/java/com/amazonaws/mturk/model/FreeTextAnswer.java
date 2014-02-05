/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jeremy
 */
@XmlRootElement(name = "FreeTextAnswer", namespace = QuestionForm.NS)
public class FreeTextAnswer extends Answer {

  @XmlElements({
    @XmlElement(name = "IsNumeric", type = IsNumericConstraint.class, namespace = QuestionForm.NS),
    @XmlElement(name = "Length", type = LengthConstraint.class, namespace = QuestionForm.NS),
    @XmlElement(name = "AnswerFormatRegex", type = AnswerFormatRegexConstraint.class, namespace = QuestionForm.NS),})
  @XmlElementWrapper(name = "Constraints", namespace=QuestionForm.NS)
  List<Constraint> constraints = new ArrayList<Constraint>();

  @XmlElement(name = "DefaultText", namespace = QuestionForm.NS)
  String defaultText;
  @XmlElement(name = "NumberOfLinesSuggestion", namespace = QuestionForm.NS)
  Integer numberOfLinesSuggestion;
}
