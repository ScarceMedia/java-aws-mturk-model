/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jeremy
 */
@XmlRootElement(name = "Selections", namespace = QuestionForm.NS)
public class Selections {

  @XmlElement(name = "Selection", namespace = QuestionForm.NS)
  List<Selection> selections = new ArrayList<Selection>();

  @XmlElement(name = "OtherSelection", namespace = QuestionForm.NS)
  FreeTextAnswer otherSelection;
}