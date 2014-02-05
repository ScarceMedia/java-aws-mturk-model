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
public class FormattedContentTest extends BaseTest {



  @Test
  public void test() throws IOException {
    FormattedContent actual = loadResource("FormattedContent.xml", FormattedContent.class);
    Assert.assertEquals("value does not match", "<p>This is a paragraph with <b>bold text</b>,<i>italic text</i>, and <b><i>bold italic text</i></b>.</p>", actual.value);
  }

}
