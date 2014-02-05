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
 * @author jeremy
 */
@XmlRootElement(name = "FileUploadAnswer", namespace = QuestionForm.NS)
public class FileUploadAnswer extends Answer {
  @XmlElement(name = "MaxFileSizeInBytes", namespace = QuestionForm.NS)
  Integer maxFileSizeInBytes;
  @XmlElement(name = "MinFileSizeInBytes", namespace = QuestionForm.NS)
  Integer minFileSizeInBytes;
}
