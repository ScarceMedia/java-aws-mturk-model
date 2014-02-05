/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author jeremy
 */
public class Answer {

  @XmlElement(name = "QuestionIdentifier", namespace = QuestionFormAnswers.NS)
  String questionIdentifier;
  @XmlElement(name = "SelectionIdentifier", namespace = QuestionFormAnswers.NS)
  String selectionIdentifier;
  @XmlElement(name = "OtherSelectionText", namespace = QuestionFormAnswers.NS)
  String otherSelectionText;
  @XmlElement(name = "FreeText", namespace = QuestionFormAnswers.NS)
  String freeText;
  @XmlElement(name = "UploadedFileSizeInBytes", namespace = QuestionFormAnswers.NS)
  Integer uploadedFileSizeInBytes;
  @XmlElement(name = "UploadedFileKey", namespace = QuestionFormAnswers.NS)
  String uploadedFileKey;

//                                 <xs:sequence>
//                                    <xs:element name="SelectionIdentifier" type="xs:string" minOccurs="0" maxOccurs="unbounded"/>
//                                    <xs:element name="OtherSelectionText" type="xs:string" minOccurs="0"/>
//                                </xs:sequence>
//                                <xs:element name="FreeText" type="xs:string"/>
//                                <xs:sequence>
//                                    <xs:element name="UploadedFileSizeInBytes" type="xs:positiveInteger"/>
//                                    <xs:element name="UploadedFileKey" type="xs:string"/>
//                                </xs:sequence
//                                        >
}
