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
@XmlRootElement(name="IsNumeric", namespace = QuestionForm.NS)
public class IsNumericConstraint extends Constraint {

  @XmlAttribute(name = "minValue", required = false)
  Integer minValue;
  @XmlAttribute(name = "maxValue", required = false)
  Integer maxValue;
}
