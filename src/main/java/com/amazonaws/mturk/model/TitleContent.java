/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jeremy
 */
@XmlRootElement(name = "Title", namespace = QuestionForm.NS)
public class TitleContent extends Content {
  public TitleContent(){
    
  }
  public TitleContent(String value){
    super.value = value;
  }
}
