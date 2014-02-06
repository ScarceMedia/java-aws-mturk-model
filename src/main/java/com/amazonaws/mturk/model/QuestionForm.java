/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import org.xml.sax.SAXException;

/**
 *
 * @author Jeremy Custenborder
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "QuestionForm", namespace = QuestionForm.NS)
public class QuestionForm {

  static final String NS = "http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionForm.xsd";

  @XmlElementWrapper(name = "Overview", namespace = QuestionForm.NS)
  @XmlElements({
    @XmlElement(name = "Text", namespace = QuestionForm.NS, type = TextContent.class),
    @XmlElement(name = "Title", namespace = QuestionForm.NS, type = TitleContent.class),
    @XmlElement(name = "Binary", namespace = QuestionForm.NS, type = BinaryContent.class),
    @XmlElement(name = "List", namespace = QuestionForm.NS, type = ListContent.class),
    @XmlElement(name = "FormattedContent", namespace = QuestionForm.NS, type = FormattedContent.class),
    @XmlElement(name = "Application", namespace = QuestionForm.NS, type = ApplicationContent.class),
    @XmlElement(name = "EmbeddedBinary", namespace = QuestionForm.NS, type = EmbeddedBinaryContent.class),}
  )
  List<Content> overview = new ArrayList<Content>();

  @XmlElement(name = "Question", namespace = QuestionForm.NS)
  List<Question> questions = new ArrayList<Question>();

  public List<Content> getOverview() {
    return overview;
  }

  public void setOverview(List<Content> overview) {
    this.overview = overview;
  }

  public List<Question> getQuestions() {
    return questions;
  }

  public void setQuestions(List<Question> questions) {
    this.questions = questions;
  }

  public static QuestionForm
          load(InputStream input) throws IOException {
    try {
      JAXBContext context = JAXBContext.newInstance(QuestionForm.class
      );
      Unmarshaller um = context.createUnmarshaller();
//      um.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

      return (QuestionForm) um.unmarshal(input);
    } catch (JAXBException ex) {
      throw new IOException("Exception thrown while deserializing stream", ex);
    }
  }

  public static void save(QuestionForm question, Writer writer) throws IOException {
    SerializationHelper.save(question, writer);
  }

  public static void save(QuestionForm question, OutputStream output) throws IOException {
    SerializationHelper.save(question, output);
  }

  public static void validate(InputStream input) throws SAXException, IOException {
    SchemaHelper.validate("QuestionForm.xsd", input);
  }

}
