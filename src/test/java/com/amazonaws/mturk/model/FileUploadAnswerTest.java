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
public class FileUploadAnswerTest extends BaseTest {

  @Test
  public void test() throws IOException {
    FileUploadAnswer actual = loadResource("FileUploadAnswer.xml", FileUploadAnswer.class);
    Assert.assertEquals("maxFileSizeInBytes does not match", 3000000, (int) actual.maxFileSizeInBytes);
    Assert.assertEquals("minFileSizeInBytes does not match", 1000, (int) actual.minFileSizeInBytes);
  }

}
