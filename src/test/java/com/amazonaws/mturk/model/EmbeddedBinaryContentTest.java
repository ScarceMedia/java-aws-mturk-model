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
public class EmbeddedBinaryContentTest extends BaseTest {

  @Test
  public void test() throws IOException {
    EmbeddedBinaryContent actual = loadResource("EmbeddedBinaryContent.xml", EmbeddedBinaryContent.class);
    Assert.assertNotNull(actual.mimeType);
    Assert.assertEquals("image", actual.mimeType.type);
    Assert.assertEquals("gif", actual.mimeType.subType);
    Assert.assertEquals("http://tictactoe.amazon.com/game/01523/board.gif", actual.dataURL);   
    Assert.assertEquals("The game board, with \"X\" to move.", actual.altText);
    Assert.assertEquals("400", actual.width);
    Assert.assertEquals("300", actual.height);
    Assert.assertNotNull(actual.applicationParameters);
    Assert.assertEquals("game_id", actual.applicationParameters.get(0).name);
    Assert.assertEquals("01523", actual.applicationParameters.get(0).value);
  }

}
