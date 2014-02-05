/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jeremy Custenborder
 */
@XmlRootElement(name = "Selection", namespace = QuestionForm.NS)
public class Selection {

  @XmlElement(name = "SelectionIdentifier", namespace = QuestionForm.NS)
  String selectionIdentifier;

  @XmlElements({
    @XmlElement(name = "Text", type = TextContent.class, namespace = QuestionForm.NS),
    @XmlElement(name = "Binary", type = BinaryContent.class, namespace = QuestionForm.NS),
    @XmlElement(name = "FormattedContent", type = FormattedContent.class, namespace = QuestionForm.NS)

  })
  Content content;

  @XmlTransient
  public Content getContent() {
    return content;
  }

  public void setContent(Content content) {
    this.content = content;
  }

  @XmlTransient
  public String getSelectionIdentifier() {
    return selectionIdentifier;
  }

  public void setSelectionIdentifier(String selectionIdentifier) {
    this.selectionIdentifier = selectionIdentifier;
  }

}
