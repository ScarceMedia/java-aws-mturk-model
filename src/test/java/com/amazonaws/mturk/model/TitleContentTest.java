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
public class TitleContentTest extends BaseTest {
  @Test
  public void test() throws IOException {
    TitleContent actual = loadResource("TitleContent.xml", TitleContent.class);
    Assert.assertEquals("value does not match", "The Next Move", actual.value);
  }

}
