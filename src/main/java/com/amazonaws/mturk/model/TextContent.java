/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jeremy Custenborder
 */
@XmlRootElement(name = "Text", namespace = QuestionForm.NS)
public class TextContent extends Content {

  public TextContent() {

  }

  public TextContent(String value) {
    super.value = value;
  }

}
