/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jeremy Custenborder
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Application", namespace = QuestionForm.NS)
public class ApplicationContent implements Content {

  @XmlElement(name = "JavaApplet", namespace = QuestionForm.NS)
  JavaAppletApplication javaAppletApplication;
  @XmlElement(name = "Flash", namespace = QuestionForm.NS)
  FlashApplication flashApplication;

  public FlashApplication getFlashApplication() {
    return flashApplication;
  }

  public void setFlashApplication(FlashApplication flashApplication) {
    this.flashApplication = flashApplication;
  }

  public JavaAppletApplication getJavaAppletApplication() {
    return javaAppletApplication;
  }

  public void setJavaAppletApplication(JavaAppletApplication javaAppletApplication) {
    this.javaAppletApplication = javaAppletApplication;
  }

}
