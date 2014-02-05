/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import java.io.IOException;
import java.io.InputStream;
import org.junit.Assert;

/**
 *
 * @author jeremy
 */
public abstract class BaseTest {

  protected <T extends Object> T loadResource(String resource, Class<T> type) throws IOException {
    InputStream input = getClass().getResourceAsStream(resource);

    Assert.assertNotNull(resource + " was not found.", input);

    T expected = (T) SerializationHelper.load(input, type);
    Assert.assertNotNull(resource + " should not be null.", expected);
    return expected;
  }

}
