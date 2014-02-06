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
@XmlRootElement(name = "Selections", namespace = QuestionForm.NS)
public class Selections {

  @XmlElement(name = "Selection", namespace = QuestionForm.NS)
  List<Selection> selections = new ArrayList<Selection>();

  @XmlElement(name = "OtherSelection", namespace = QuestionForm.NS)
  FreeTextAnswer otherSelection;

  public List<Selection> getSelections() {
    return selections;
  }

  public void setSelections(List<Selection> selections) {
    this.selections = selections;
  }

  public FreeTextAnswer getOtherSelection() {
    return otherSelection;
  }

  public void setOtherSelection(FreeTextAnswer otherSelection) {
    this.otherSelection = otherSelection;
  }
}
