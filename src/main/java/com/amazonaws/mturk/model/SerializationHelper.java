/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Jeremy Custenborder
 */
class SerializationHelper {

  public static boolean FORMAT_OUTPUT = false;

  public static void save(Object value, Writer writer) throws IOException {
    try {
      JAXBContext context = JAXBContext.newInstance(value.getClass());

      Marshaller um = context.createMarshaller();
      um.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, FORMAT_OUTPUT);
      um.marshal(value, writer);
    } catch (JAXBException ex) {
      throw new IOException("Exception thrown while deserializing stream", ex);
    }
  }

  public static void save(Object value, OutputStream output) throws IOException {
    PrintWriter writer = new PrintWriter(output);
    save(value, writer);
  }

  public static String toString(Object value) throws IOException {
    StringWriter writer = new StringWriter();
    save(value, writer);
    return writer.toString();
  }

  public static <T extends Object> T load(InputStream input, Class<T> type) throws IOException {
    try {
      JAXBContext context = JAXBContext.newInstance(type);
      Unmarshaller um = context.createUnmarshaller();
      return (T) um.unmarshal(input);
    } catch (JAXBException ex) {
      throw new IOException("Exception thrown while deserializing stream", ex);
    }
  }
}
