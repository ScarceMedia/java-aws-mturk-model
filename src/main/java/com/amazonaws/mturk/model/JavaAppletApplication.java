/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jeremy Custenborder
 */
public class JavaAppletApplication extends Application {

  @XmlElement(name = "AppletPath", namespace = QuestionForm.NS)
  String appletPath;
  @XmlElement(name = "AppletFilename", namespace = QuestionForm.NS)
  String appletFilename;

  @XmlTransient
  public String getAppletFilename() {
    return appletFilename;
  }

  public void setAppletFilename(String appletFilename) {
    this.appletFilename = appletFilename;
  }

  @XmlTransient
  public String getAppletPath() {
    return appletPath;
  }

  public void setAppletPath(String appletPath) {
    this.appletPath = appletPath;
  }

}
