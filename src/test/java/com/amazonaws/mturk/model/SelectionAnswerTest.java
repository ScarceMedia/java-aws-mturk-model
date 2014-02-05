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
 * @author Jeremy Custenborder
 */
public class SelectionAnswerTest extends BaseTest {



  @Test
  public void test() throws IOException {
    SelectionAnswer actual = loadResource("SelectionAnswer.xml", SelectionAnswer.class);
    Assert.assertEquals(SelectionAnswer.StyleSuggestionType.radiobutton, actual.styleSuggestion);
    Assert.assertNotNull(actual.selections);
    Assert.assertNotNull(actual.selections.selections);
    Assert.assertEquals(4, actual.selections.selections.size());
  }

}
