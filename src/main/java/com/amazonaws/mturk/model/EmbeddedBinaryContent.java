/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jeremy Custenborder
 */
@XmlRootElement(name = "EmbeddedBinary", namespace = QuestionForm.NS)
public class EmbeddedBinaryContent extends Content {

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
}
