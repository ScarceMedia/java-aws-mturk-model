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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jeremy Custenborder
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "EmbeddedBinary", namespace = QuestionForm.NS)
public class EmbeddedBinaryContent implements Content {

  @XmlElement(name = "EmbeddedMimeType", namespace = QuestionForm.NS)
  MimeType mimeType;
  @XmlElement(name = "DataURL", namespace = QuestionForm.NS)
  String dataURL;
  @XmlElement(name = "AltText", namespace = QuestionForm.NS)
  String altText;
  @XmlElement(name = "Width", namespace = QuestionForm.NS)
  String width;
  @XmlElement(name = "Height", namespace = QuestionForm.NS)
  String height;
  @XmlElement(name = "ApplicationParameter", namespace = QuestionForm.NS)
  List<ApplicationParameter> applicationParameters = new ArrayList<ApplicationParameter>();

  public String getAltText() {
    return altText;
  }

  public void setAltText(String altText) {
    this.altText = altText;
  }

  public List<ApplicationParameter> getApplicationParameters() {
    return applicationParameters;
  }

  public void setApplicationParameters(List<ApplicationParameter> applicationParameters) {
    this.applicationParameters = applicationParameters;
  }

  public String getDataURL() {
    return dataURL;
  }

  public void setDataURL(String dataURL) {
    this.dataURL = dataURL;
  }

  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  public MimeType getMimeType() {
    return mimeType;
  }

  public void setMimeType(MimeType mimeType) {
    this.mimeType = mimeType;
  }

  public String getWidth() {
    return width;
  }

  public void setWidth(String width) {
    this.width = width;
  }

}
