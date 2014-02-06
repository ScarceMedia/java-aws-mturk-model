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
@XmlRootElement(name = "Flash", namespace = QuestionForm.NS)
public class FlashApplication extends Application {

  @XmlElement(name = "FlashMovieURL", namespace = QuestionForm.NS)
  String flashMovieURL;

  public String getFlashMovieURL() {
    return flashMovieURL;
  }

  public void setFlashMovieURL(String flashMovieURL) {
    this.flashMovieURL = flashMovieURL;
  }

}
