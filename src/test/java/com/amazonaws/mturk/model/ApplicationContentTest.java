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
public class ApplicationContentTest extends BaseTest {

  @Test
  public void testJavaApplet() throws IOException {
    ApplicationContent expected = loadResource("Application.JavaApplet.xml", ApplicationContent.class);
    Assert.assertNotNull(expected.javaAppletApplication);
    Assert.assertNull(expected.flashApplication);
    Assert.assertEquals("http://tictactoe.amazon.com/applets/", expected.javaAppletApplication.appletPath);
    Assert.assertEquals("GameViewer.class", expected.javaAppletApplication.appletFilename);
    Assert.assertEquals("400", expected.javaAppletApplication.width);
    Assert.assertEquals("300", expected.javaAppletApplication.height);
    Assert.assertNotNull(expected.javaAppletApplication.applicationParameters);
    Assert.assertEquals("game_id", expected.javaAppletApplication.applicationParameters.get(0).name);
    Assert.assertEquals("01523", expected.javaAppletApplication.applicationParameters.get(0).value);
  }
  @Test
  public void testFlash() throws IOException {
    ApplicationContent expected = loadResource("Application.Flash.xml", ApplicationContent.class);
    Assert.assertNotNull(expected.flashApplication);
    Assert.assertNull(expected.javaAppletApplication);
    Assert.assertEquals("http://tictactoe.amazon.com/applets/", expected.flashApplication.flashMovieURL);
    Assert.assertEquals("400", expected.flashApplication.width);
    Assert.assertEquals("300", expected.flashApplication.height);
    Assert.assertNotNull(expected.flashApplication.applicationParameters);
    Assert.assertEquals("game_id", expected.flashApplication.applicationParameters.get(0).name);
    Assert.assertEquals("01523", expected.flashApplication.applicationParameters.get(0).value);
  }
}
