/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import com.sun.xml.bind.marshaller.CharacterEscapeHandler;
import com.sun.xml.bind.marshaller.DumbEscapeHandler;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/**
 *
 * @author jeremy
 */
class CDataCharacterEscapeHandler implements CharacterEscapeHandler {

  static final CDataCharacterEscapeHandler instance = new CDataCharacterEscapeHandler();
  
  final char[] CDATA_PREFIX = "<![CDATA[".toCharArray();
//  final char[] CDATA_SUFFIX = "]]>".toCharArray();

  public void escape(char[] chars, int i, int i1, boolean bln, Writer writer) throws IOException {

    boolean shouldEscape = true;

    if (chars.length >= CDATA_PREFIX.length) {
      char[] prefix = Arrays.copyOfRange(chars, 0, CDATA_PREFIX.length);

      if (Arrays.equals(CDATA_PREFIX, prefix)) {
        shouldEscape = false;
      }
    }

    if (shouldEscape) {
      DumbEscapeHandler.theInstance.escape(chars, i, i1, bln, writer);
    } else {
      writer.write(chars);
    }
  }
}
