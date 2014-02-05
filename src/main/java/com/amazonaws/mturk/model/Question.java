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
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jeremy Custenborder
 */
public class Question {

  @XmlElement(name = "QuestionIdentifier", namespace = QuestionForm.NS)
  String questionIdentifier;
  @XmlElement(name = "DisplayName", namespace = QuestionForm.NS)
  String displayName;
  @XmlElement(name = "IsRequired", namespace = QuestionForm.NS)
  Boolean isRequired;

  @XmlElementWrapper(name = "QuestionContent", namespace = QuestionForm.NS)
  @XmlElements({
    @XmlElement(name = "Text", namespace = QuestionForm.NS, type = TextContent.class),
    @XmlElement(name = "Title", namespace = QuestionForm.NS, type = TitleContent.class),
    @XmlElement(name = "Binary", namespace = QuestionForm.NS, type = BinaryContent.class),
    @XmlElement(name = "List", namespace = QuestionForm.NS, type = ListContent.class),
    @XmlElement(name = "FormattedContent", namespace = QuestionForm.NS, type = FormattedContent.class),
    @XmlElement(name = "Application", namespace = QuestionForm.NS, type = ApplicationContent.class),
    @XmlElement(name = "EmbeddedBinary", namespace = QuestionForm.NS, type = EmbeddedBinaryContent.class),}
  )
  List<Content> questionContent = new ArrayList<Content>();

  @XmlElement(name = "AnswerSpecification", namespace = QuestionForm.NS)
  AnswerSpecification answerSpecification;

  @XmlTransient
  public String getQuestionIdentifier() {
    return questionIdentifier;
  }

  public void setQuestionIdentifier(String questionIdentifier) {
    this.questionIdentifier = questionIdentifier;
  }

  @XmlTransient
  public List<Content> getQuestionContent() {
    return questionContent;
  }

  public void setQuestionContent(List<Content> questionContent) {
    this.questionContent = questionContent;
  }

  @XmlTransient
  public AnswerSpecification getAnswerSpecification() {
    return answerSpecification;
  }

  public void setAnswerSpecification(AnswerSpecification answerSpecification) {
    this.answerSpecification = answerSpecification;
  }

  @XmlTransient
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

}
