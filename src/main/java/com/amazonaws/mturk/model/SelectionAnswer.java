/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jeremy Custenborder
 */
@XmlRootElement(name = "SelectionAnswer", namespace = QuestionForm.NS)
public class SelectionAnswer extends Answer {

  @XmlElement(name = "MinSelectionCount", namespace = QuestionForm.NS)
  Integer minSelectionCount;
  @XmlElement(name = "MaxSelectionCount", namespace = QuestionForm.NS)
  Integer maxSelectionCount;
  @XmlElement(name = "StyleSuggestion", namespace = QuestionForm.NS)
  StyleSuggestionType styleSuggestion;
  @XmlElement(name = "Selections", namespace = QuestionForm.NS)
  Selections selections;

  public enum StyleSuggestionType {

    radiobutton,
    checkbox,
    list,
    dropdown,
    combobox,
    multichooser,
  }

  @XmlTransient
  public Integer getMinSelectionCount() {
    return minSelectionCount;
  }

  public void setMinSelectionCount(Integer minSelectionCount) {
    this.minSelectionCount = minSelectionCount;
  }

  @XmlTransient
  public Integer getMaxSelectionCount() {
    return maxSelectionCount;
  }

  public void setMaxSelectionCount(Integer maxSelectionCount) {
    this.maxSelectionCount = maxSelectionCount;
  }

  @XmlTransient
  public StyleSuggestionType getStyleSuggestion() {
    return styleSuggestion;
  }

  public void setStyleSuggestion(StyleSuggestionType styleSuggestion) {
    this.styleSuggestion = styleSuggestion;
  }

  @XmlTransient
  public Selections getSelections() {
    return selections;
  }

  public void setSelections(Selections selections) {
    this.selections = selections;
  }

}
