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
@XmlRootElement(name = "ApplicationParameter", namespace = QuestionForm.NS)
public class ApplicationParameter {

  @XmlElement(name = "Name", namespace = QuestionForm.NS)
  String name;
  @XmlElement(name = "Value", namespace = QuestionForm.NS)
  String value;

}
