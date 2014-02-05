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
public class ListContentTest extends BaseTest {

  @Test
  public void test() throws IOException {
    ListContent actual = loadResource("ListContent.xml", ListContent.class);
    Assert.assertNotNull(actual.list);
    Assert.assertEquals("It must be a valid move.", actual.list.get(0));
    Assert.assertEquals("\"X\" cannot resign.", actual.list.get(1));
  }

}
