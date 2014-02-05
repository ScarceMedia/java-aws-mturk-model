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
@XmlRootElement(name="Length", namespace = QuestionForm.NS)
public class LengthConstraint extends Constraint {
  @XmlAttribute(name = "minLength", required = false)
  Integer minValue;
  @XmlAttribute(name = "maxLength", required = false)
  Integer maxValue;  
}