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

/**
 *
 * @author Jeremy Custenborder
 */
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class Application {

  @XmlElement(name = "Width", namespace = QuestionForm.NS)
  String width;
  @XmlElement(name = "Height", namespace = QuestionForm.NS)
  String height;
  @XmlElement(name = "ApplicationParameter", namespace = QuestionForm.NS)
  List<ApplicationParameter> applicationParameters = new ArrayList<ApplicationParameter>();

  public List<ApplicationParameter> getApplicationParameters() {
    return applicationParameters;
  }

  public void setApplicationParameters(List<ApplicationParameter> applicationParameters) {
    this.applicationParameters = applicationParameters;
  }

  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  public String getWidth() {
    return width;
  }

  public void setWidth(String width) {
    this.width = width;
  }

}
