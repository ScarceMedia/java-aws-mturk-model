/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import javax.xml.bind.annotation.XmlValue;

/**
 *
 * @author jeremy
 */
public abstract class Content {

  @XmlValue
  String value;
}
