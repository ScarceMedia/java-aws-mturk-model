/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jeremy Custenborder
 */
public class Answer {

  @XmlElement(name = "QuestionIdentifier", namespace = QuestionFormAnswers.NS)
  String questionIdentifier;
  @XmlElement(name = "SelectionIdentifier", namespace = QuestionFormAnswers.NS)
  String selectionIdentifier;
  @XmlElement(name = "OtherSelectionText", namespace = QuestionFormAnswers.NS)
  String otherSelectionText;
  @XmlElement(name = "FreeText", namespace = QuestionFormAnswers.NS)
  String freeText;
  @XmlElement(name = "UploadedFileSizeInBytes", namespace = QuestionFormAnswers.NS)
  Integer uploadedFileSizeInBytes;
  @XmlElement(name = "UploadedFileKey", namespace = QuestionFormAnswers.NS)
  String uploadedFileKey;

  @XmlTransient
  public String getQuestionIdentifier() {
    return questionIdentifier;
  }

  public void setQuestionIdentifier(String questionIdentifier) {
    this.questionIdentifier = questionIdentifier;
  }

  @XmlTransient
  public String getSelectionIdentifier() {
    return selectionIdentifier;
  }

  public void setSelectionIdentifier(String selectionIdentifier) {
    this.selectionIdentifier = selectionIdentifier;
  }

  @XmlTransient
  public String getOtherSelectionText() {
    return otherSelectionText;
  }

  public void setOtherSelectionText(String otherSelectionText) {
    this.otherSelectionText = otherSelectionText;
  }

  @XmlTransient
  public String getFreeText() {
    return freeText;
  }

  public void setFreeText(String freeText) {
    this.freeText = freeText;
  }

  @XmlTransient
  public String getUploadedFileKey() {
    return uploadedFileKey;
  }

  public void setUploadedFileKey(String uploadedFileKey) {
    this.uploadedFileKey = uploadedFileKey;
  }

  @XmlTransient
  public Integer getUploadedFileSizeInBytes() {
    return uploadedFileSizeInBytes;
  }

  public void setUploadedFileSizeInBytes(Integer uploadedFileSizeInBytes) {
    this.uploadedFileSizeInBytes = uploadedFileSizeInBytes;
  }
  
  
  

  
  
  
  
}
