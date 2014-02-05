/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import java.io.IOException;
import java.io.InputStream;
import javax.xml.XMLConstants;
import javax.xml.validation.Validator;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import org.xml.sax.SAXException;

/**
 *
 * @author Jeremy Custenborder
 */
class SchemaHelper {

  static final SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

  public static void validate(String schemaName, InputStream input) throws SAXException, IOException {
    InputStream schemaStream = SchemaHelper.class.getResourceAsStream(schemaName);
    StreamSource schemaSource = new StreamSource(schemaStream);
    Schema schema = schemaFactory.newSchema(schemaSource);
    Validator validator = schema.newValidator();
    StreamSource inputSource = new StreamSource(input);
    validator.validate(inputSource);
  }
}
