/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jeremy Custenborder
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "AnswerSpecification", namespace = QuestionForm.NS)
public class AnswerSpecification {

  @XmlElements({
    @XmlElement(name = "FreeTextAnswer", type = FreeTextAnswer.class, namespace = QuestionForm.NS),
    @XmlElement(name = "SelectionAnswer", type = SelectionAnswer.class, namespace = QuestionForm.NS),
    @XmlElement(name = "FileUploadAnswer", type = FileUploadAnswer.class, namespace = QuestionForm.NS)

  })
  Answer answer;

  public Answer getAnswer() {
    return answer;
  }

  public void setAnswer(Answer answer) {
    this.answer = answer;
  }

}
