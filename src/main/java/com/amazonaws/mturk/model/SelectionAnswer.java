/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jeremy
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
}
