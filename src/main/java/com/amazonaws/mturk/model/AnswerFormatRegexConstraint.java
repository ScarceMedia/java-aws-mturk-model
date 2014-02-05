/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jeremy Custenborder
 */
@XmlRootElement(name = "AnswerFormatRegex", namespace = QuestionForm.NS)
public class AnswerFormatRegexConstraint extends Constraint {

  @XmlAttribute(name = "regex", required = true)
  String regex;
  @XmlAttribute(name = "errorText", required = false)
  String errorText;
  @XmlAttribute(name = "flags", required = false)
  String flags;

  @XmlTransient
  public String getErrorText() {
    return errorText;
  }

  public void setErrorText(String errorText) {
    this.errorText = errorText;
  }

  @XmlTransient
  public String getFlags() {
    return flags;
  }

  public void setFlags(String flags) {
    this.flags = flags;
  }

  @XmlTransient
  public String getRegex() {
    return regex;
  }

  public void setRegex(String regex) {
    this.regex = regex;
  }

}
