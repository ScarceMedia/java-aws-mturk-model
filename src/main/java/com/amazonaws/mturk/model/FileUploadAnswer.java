/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jeremy Custenborder
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "FileUploadAnswer", namespace = QuestionForm.NS)
public class FileUploadAnswer extends Answer {

  @XmlElement(name = "MaxFileSizeInBytes", namespace = QuestionForm.NS)
  Integer maxFileSizeInBytes;
  @XmlElement(name = "MinFileSizeInBytes", namespace = QuestionForm.NS)
  Integer minFileSizeInBytes;

  public Integer getMaxFileSizeInBytes() {
    return maxFileSizeInBytes;
  }

  public void setMaxFileSizeInBytes(Integer maxFileSizeInBytes) {
    this.maxFileSizeInBytes = maxFileSizeInBytes;
  }

  public Integer getMinFileSizeInBytes() {
    return minFileSizeInBytes;
  }

  public void setMinFileSizeInBytes(Integer minFileSizeInBytes) {
    this.minFileSizeInBytes = minFileSizeInBytes;
  }

}
