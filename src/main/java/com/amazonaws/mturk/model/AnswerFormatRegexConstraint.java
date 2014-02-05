/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jeremy
 */
@XmlRootElement(name = "AnswerFormatRegex", namespace = QuestionForm.NS)
public class AnswerFormatRegexConstraint extends Constraint {

  @XmlAttribute(name = "regex", required = true)
  String regex;
  @XmlAttribute(name = "errorText", required = false)
  String errorText;
  @XmlAttribute(name = "flags", required = false)
  String flags;
}
