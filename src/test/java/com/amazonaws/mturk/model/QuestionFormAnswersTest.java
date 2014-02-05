/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author jeremy
 */
public class QuestionFormAnswersTest extends BaseTest {

  @Test
  public void test() throws IOException {
    QuestionFormAnswers actual = loadResource("QuestionFormAnswers.xml", QuestionFormAnswers.class);
    Assert.assertNotNull(actual.answers);
    Assert.assertEquals(2, actual.answers.size());
    
    
  }

}
