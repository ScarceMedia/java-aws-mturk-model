/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jeremy Custenborder
 */
@XmlRootElement(name = "MimeType", namespace = QuestionForm.NS)
public class MimeType {

  @XmlElement(name = "Type", namespace = QuestionForm.NS)
  String type;
  @XmlElement(name = "SubType", namespace = QuestionForm.NS)
  String subType;

  public MimeType() {

  }

  public MimeType(String type, String subType) {
    this.type = type;
    this.subType = subType;
  }

  @XmlTransient
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @XmlTransient
  public String getSubType() {
    return subType;
  }

  public void setSubType(String subType) {
    this.subType = subType;
  }

}
