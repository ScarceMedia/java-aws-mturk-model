/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import java.io.IOException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Jeremy Custenborder
 */
public class IsNumericConstraintTest extends BaseTest {

  IsNumericConstraint constraint;

  @Before
  public void setup() {
    SerializationHelper.FORMAT_OUTPUT = false;
    constraint = new IsNumericConstraint();
  }

//  @Test
//  public void test() throws IOException {
//    SerializationHelper.save(constraint, System.out);
//
//    final String expected = "<IsNumeric xmlns=\"http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionForm.xsd\"/>";
//    String actual = SerializationHelper.toString(constraint);
//
//    Assert.assertEquals(expected, actual);
//  }
}
