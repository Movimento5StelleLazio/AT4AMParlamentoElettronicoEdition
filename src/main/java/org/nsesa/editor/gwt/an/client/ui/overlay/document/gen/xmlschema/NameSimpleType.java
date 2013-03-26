package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.TokenSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import com.google.gwt.user.client.DOM;

/**
* Generated class
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class NameSimpleType extends TokenSimpleType  {


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "NameSimpleType");
span.setAttribute("ns", "http://www.w3.org/2001/XMLSchema");
span.setClassName("widget NameSimpleType");
return span;
}

// CONSTRUCTORS ------------------

/**
* Create an empty <code>NameSimpleType</code> object
*/
public NameSimpleType() {
super();
}
/**
* Create a <code>NameSimpleType</code> object with teh given input data
*/
public NameSimpleType(String value) {
super();
this.value = value;
}

// FIELDS ------------------
}

