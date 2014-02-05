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
@XmlRootElement(name = "Application", namespace = QuestionForm.NS)
public class ApplicationContent {

  @XmlElement(name = "JavaApplet", namespace = QuestionForm.NS)
  JavaAppletApplication javaAppletApplication;
  @XmlElement(name = "Flash", namespace = QuestionForm.NS)
  FlashApplication flashApplication;

}
