/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

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
}
