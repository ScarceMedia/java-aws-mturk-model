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
 * @author Jeremy Custenborder
 */
@XmlRootElement(name="QuestionFormAnswers", namespace = QuestionFormAnswers.NS)
public class QuestionFormAnswers {

  public static final String NS = "http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd";
  
  @XmlElement(name="Answer", namespace = QuestionFormAnswers.NS)
  List<Answer> answers = new ArrayList<Answer>();
}
