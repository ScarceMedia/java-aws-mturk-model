/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jeremy Custenborder
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "List", namespace = QuestionForm.NS)
public class ListContent implements Content {
//  @XmlElementWrapper(name = "List", namespace = QuestionForm.NS)

  @XmlElement(name = "ListItem", namespace = QuestionForm.NS)
  List<String> list = new ArrayList<String>();

  public List<String> getList() {
    return list;
  }

  public void setList(List<String> list) {
    this.list = list;
  }

}
