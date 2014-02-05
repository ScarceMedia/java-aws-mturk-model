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
public class EmbeddedBinaryContentTest extends BaseTest {

  @Test
  public void test() throws IOException {
    EmbeddedBinaryContent expected = loadResource("EmbeddedBinaryContent.xml", EmbeddedBinaryContent.class);
    Assert.assertNotNull(expected.mimeType);
    Assert.assertEquals("image", expected.mimeType.type);
    Assert.assertEquals("gif", expected.mimeType.subType);
    Assert.assertEquals("http://tictactoe.amazon.com/game/01523/board.gif", expected.dataURL);   
    Assert.assertEquals("The game board, with \"X\" to move.", expected.altText);
    Assert.assertEquals("400", expected.width);
    Assert.assertEquals("300", expected.height);
    Assert.assertNotNull(expected.applicationParameters);
    Assert.assertEquals("game_id", expected.applicationParameters.get(0).name);
    Assert.assertEquals("01523", expected.applicationParameters.get(0).value);

  }

}
