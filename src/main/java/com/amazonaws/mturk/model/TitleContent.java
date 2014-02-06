/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

/**
 *
 * @author Jeremy Custenborder
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Title", namespace = QuestionForm.NS)
public class TitleContent implements Content {

  public TitleContent() {

  }

  public TitleContent(String value) {
    this.value = value;
  }

  @XmlValue
  String value;

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

}
