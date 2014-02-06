/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amazonaws.mturk.model;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 *
 * @author jeremy
 */
public class CDATAAdapter extends XmlAdapter<String, String> {

  @Override
  public String marshal(String v) throws Exception {
    return "<![CDATA[" + v + "]]>";
  }

  @Override
  public String unmarshal(String v) throws Exception {
    return v;
  }
}
