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
public class BinaryContentTest extends BaseTest {

  @Test
  public void test() throws IOException {
    BinaryContent expected = loadResource("BinaryContent.xml", BinaryContent.class);
    Assert.assertNotNull(expected.mimeType);
    Assert.assertEquals("image", expected.mimeType.type);
    Assert.assertEquals("gif", expected.mimeType.subType);
    Assert.assertEquals("http://tictactoe.amazon.com/game/01523/board.gif", expected.dataURL);   
    Assert.assertEquals("The game board, with \"X\" to move.", expected.altText);


  }

}
