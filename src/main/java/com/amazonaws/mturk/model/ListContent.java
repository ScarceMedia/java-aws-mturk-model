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
@XmlRootElement(name="List", namespace=QuestionForm.NS)
public class ListContent extends Content {
//  @XmlElementWrapper(name = "List", namespace = QuestionForm.NS)
  @XmlElement(name = "ListItem", namespace = QuestionForm.NS)
  List<String> list = new ArrayList<String>();  
}
