/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import java.io.IOException;
import java.io.InputStream;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.xml.sax.SAXException;

/**
 *
 * @author Jeremy Custenborder
 */
public class QuestionFormTest extends BaseTest {
  
  @Before
  public void setup(){
    SerializationHelper.FORMAT_OUTPUT = true;
  }
  
  @Test
  public void validateQuestionForm_xml() throws SAXException, IOException {
    InputStream input = getClass().getResourceAsStream("QuestionForm.xml");
    QuestionForm.validate(input);
  }
  
  @Test
  public void foo() throws IOException {
    QuestionForm form = new QuestionForm();
    
    form.overview.add(new TitleContent("Game 01523, \"X\" to play"));
    form.overview.add(new TextContent("You are helping to decide the next move in a game of Tic-Tac-Toe.  The board looks like this:"));
    BinaryContent binaryContent = new BinaryContent();
    binaryContent.mimeType = new MimeType("image", "gif");
    binaryContent.dataURL = "http://tictactoe.amazon.com/game/01523/board.gif";
    binaryContent.altText = "The game board, with \"X\" to move.";
    
    form.overview.add(binaryContent);
    form.overview.add(new TextContent("Player \"X\" has the next move."));

    QuestionForm.save(form, System.out);    
  }
  
  @Test
  public void questionForm_xml() throws IOException {
    
    InputStream input = getClass().getResourceAsStream("QuestionForm.xml");
    QuestionForm questionForm = QuestionForm.load(input);
    Assert.assertNotNull("questionForm should not be null", questionForm);
    
    Assert.assertNotNull("questionForm.overView should not be null", questionForm.overview);
    Assert.assertEquals(questionForm.overview.get(0).getClass(), TitleContent.class);
    
    QuestionForm.save(questionForm, System.out);
    
//    Assert.assertEquals("questionForm.overview.text does not match", "You are helping to decide the next move in a game of Tic-Tac-Toe.  The board looks like this:", questionForm.overview.text);
    
  }
}
