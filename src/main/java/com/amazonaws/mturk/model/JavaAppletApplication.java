/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.amazonaws.mturk.model;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author jeremy
 */
public class JavaAppletApplication extends Application {
  @XmlElement(name = "AppletPath", namespace = QuestionForm.NS)
  String appletPath;
  @XmlElement(name = "AppletFilename", namespace = QuestionForm.NS)
  String appletFilename;   
}