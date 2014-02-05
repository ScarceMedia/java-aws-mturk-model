/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import java.io.IOException;
import java.io.InputStream;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author jeremy
 */
public class FreeTextAnswerTest extends BaseTest {

  @Test
  public void unmarshall_0() throws IOException {
    FreeTextAnswer expected = loadResource("FreeTextAnswer.0.xml", FreeTextAnswer.class);
    Assert.assertNotNull(expected.constraints);
    Assert.assertEquals(2, expected.constraints.size());
    Assert.assertEquals(IsNumericConstraint.class, expected.constraints.get(0).getClass());
    IsNumericConstraint isNumericConstraint = (IsNumericConstraint) expected.constraints.get(0);
    Assert.assertEquals(100, (int) isNumericConstraint.minValue);
    Assert.assertEquals(999, (int) isNumericConstraint.maxValue);
    Assert.assertEquals(LengthConstraint.class, expected.constraints.get(1).getClass());
    LengthConstraint lengthConstraint = (LengthConstraint) expected.constraints.get(1);
    Assert.assertEquals(3, (int) lengthConstraint.minValue);
    Assert.assertEquals(3, (int) lengthConstraint.maxValue);
  }

  @Test
  public void unmarshall_1() throws IOException {
    FreeTextAnswer expected = loadResource("FreeTextAnswer.1.xml", FreeTextAnswer.class);
    Assert.assertNotNull(expected.constraints);
    Assert.assertEquals(2, expected.constraints.size());
    Assert.assertEquals(IsNumericConstraint.class, expected.constraints.get(0).getClass());
    IsNumericConstraint isNumericConstraint = (IsNumericConstraint) expected.constraints.get(0);
    Assert.assertNull(isNumericConstraint.minValue);
    Assert.assertNull(isNumericConstraint.maxValue);
    Assert.assertEquals(LengthConstraint.class, expected.constraints.get(1).getClass());
    LengthConstraint lengthConstraint = (LengthConstraint) expected.constraints.get(1);
    Assert.assertEquals(3, (int) lengthConstraint.minValue);
    Assert.assertEquals(3, (int) lengthConstraint.maxValue);
  }

  @Test
  public void unmarshall_2() throws IOException {
    FreeTextAnswer expected = loadResource("FreeTextAnswer.2.xml", FreeTextAnswer.class);
    Assert.assertNotNull(expected.constraints);
    Assert.assertEquals(2, expected.constraints.size());
    Assert.assertEquals(AnswerFormatRegexConstraint.class, expected.constraints.get(1).getClass());
    AnswerFormatRegexConstraint answerFormatRegexConstraint = (AnswerFormatRegexConstraint) expected.constraints.get(1);
    Assert.assertEquals("\\S", answerFormatRegexConstraint.regex);
    Assert.assertEquals("The content cannot be blank.", answerFormatRegexConstraint.errorText);
    Assert.assertEquals(LengthConstraint.class, expected.constraints.get(0).getClass());
    LengthConstraint lengthConstraint = (LengthConstraint) expected.constraints.get(0);
    Assert.assertEquals(2, (int) lengthConstraint.minValue);
    Assert.assertNull(lengthConstraint.maxValue);
  }

  @Test
  public void unmarshall_3() throws IOException {
    FreeTextAnswer expected = loadResource("FreeTextAnswer.3.xml", FreeTextAnswer.class);
    Assert.assertNotNull(expected.constraints);
    Assert.assertEquals(1, expected.constraints.size());
    Assert.assertEquals(AnswerFormatRegexConstraint.class, expected.constraints.get(0).getClass());
    AnswerFormatRegexConstraint answerFormatRegexConstraint = (AnswerFormatRegexConstraint) expected.constraints.get(0);
    Assert.assertEquals("(^$|\\S{2,})", answerFormatRegexConstraint.regex);
    Assert.assertEquals("You must enter at least two characters.", answerFormatRegexConstraint.errorText);

  }

  @Test
  public void unmarshall_4() throws IOException {
    FreeTextAnswer expected = loadResource("FreeTextAnswer.4.xml", FreeTextAnswer.class);
    Assert.assertNotNull(expected.constraints);
    Assert.assertEquals(1, expected.constraints.size());
    Assert.assertEquals(AnswerFormatRegexConstraint.class, expected.constraints.get(0).getClass());
    AnswerFormatRegexConstraint answerFormatRegexConstraint = (AnswerFormatRegexConstraint) expected.constraints.get(0);
    Assert.assertEquals("^(1[- ]?)?(\\([2-9]\\d{2}\\)\\s*|[2-9]\\d{2}-?)[2-9]\\d{2}-?\\d{4}$)", answerFormatRegexConstraint.regex);
    Assert.assertEquals("You must enter a US phone number in the format  1-555-555-1234 or 555-555-1234.", answerFormatRegexConstraint.errorText);
  }

  @Test
  public void unmarshall_5() throws IOException {
    FreeTextAnswer expected = loadResource("FreeTextAnswer.5.xml", FreeTextAnswer.class);
    Assert.assertNotNull(expected.constraints);
    Assert.assertEquals(1, expected.constraints.size());
    Assert.assertEquals(AnswerFormatRegexConstraint.class, expected.constraints.get(0).getClass());
    AnswerFormatRegexConstraint answerFormatRegexConstraint = (AnswerFormatRegexConstraint) expected.constraints.get(0);
    Assert.assertEquals("^[12][0-9]{3}-[01]?\\d-[0-3]?\\d$", answerFormatRegexConstraint.regex);
    Assert.assertEquals("You must enter a date with the format yyyy-mm-dd.", answerFormatRegexConstraint.errorText);

  }

  @Test
  public void unmarshall_6() throws IOException {
    FreeTextAnswer expected = loadResource("FreeTextAnswer.6.xml", FreeTextAnswer.class);
    Assert.assertNotNull(expected.constraints);
    Assert.assertEquals(1, expected.constraints.size());
    Assert.assertEquals(AnswerFormatRegexConstraint.class, expected.constraints.get(0).getClass());
    AnswerFormatRegexConstraint answerFormatRegexConstraint = (AnswerFormatRegexConstraint) expected.constraints.get(0);
    Assert.assertEquals("regex", answerFormatRegexConstraint.regex);
    Assert.assertEquals("You must enter 'regex'.", answerFormatRegexConstraint.errorText);
    Assert.assertEquals("i", answerFormatRegexConstraint.flags);

  }
//
//  @Test
//  public void unmarshall_7() throws IOException {
//    FreeTextAnswer expected = loadResource("FreeTextAnswer.7.xml", FreeTextAnswer.class);
//    Assert.assertNotNull(expected.constraints);
//    Assert.assertEquals(2, expected.constraints.size());
//    Assert.assertEquals(IsNumericConstraint.class, expected.constraints.get(0).getClass());
//    IsNumericConstraint isNumericConstraint = (IsNumericConstraint) expected.constraints.get(0);
//    Assert.assertNull(isNumericConstraint.minValue);
//    Assert.assertNull(isNumericConstraint.maxValue);
//    Assert.assertEquals(LengthConstraint.class, expected.constraints.get(1).getClass());
//    LengthConstraint lengthConstraint = (LengthConstraint) expected.constraints.get(0);
//    Assert.assertEquals(3, (int) lengthConstraint.minValue);
//    Assert.assertEquals(3, (int) lengthConstraint.maxValue);
//  }

}
