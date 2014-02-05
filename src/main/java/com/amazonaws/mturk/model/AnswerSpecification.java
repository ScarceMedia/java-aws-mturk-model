/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jeremy Custenborder
 */
@XmlRootElement(name = "AnswerSpecification", namespace = QuestionForm.NS)
public class AnswerSpecification {

  @XmlElements({
    @XmlElement(name = "FreeTextAnswer", type = FreeTextAnswer.class, namespace = QuestionForm.NS),
    @XmlElement(name = "SelectionAnswer", type = SelectionAnswer.class, namespace = QuestionForm.NS),
    @XmlElement(name = "FileUploadAnswer", type = FileUploadAnswer.class, namespace = QuestionForm.NS)

  })
  Answer answer;

  @XmlTransient
  public Answer getAnswer() {
    return answer;
  }

  public void setAnswer(Answer answer) {
    this.answer = answer;
  }

  
}
