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
@XmlRootElement(name = "Binary", namespace = QuestionForm.NS)
public class BinaryContent extends Content {

  @XmlElement(name = "MimeType", namespace = QuestionForm.NS)
  MimeType mimeType;
  @XmlElement(name = "DataURL", namespace = QuestionForm.NS)
  String dataURL;
  @XmlElement(name = "AltText", namespace = QuestionForm.NS)
  String altText;

  @XmlTransient
  public String getAltText() {
    return altText;
  }

  public void setAltText(String altText) {
    this.altText = altText;
  }

  @XmlTransient
  public String getDataURL() {
    return dataURL;
  }

  public void setDataURL(String dataURL) {
    this.dataURL = dataURL;
  }

  @XmlTransient
  public MimeType getMimeType() {
    return mimeType;
  }

  public void setMimeType(MimeType mimeType) {
    this.mimeType = mimeType;
  }

  @XmlTransient
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

}
