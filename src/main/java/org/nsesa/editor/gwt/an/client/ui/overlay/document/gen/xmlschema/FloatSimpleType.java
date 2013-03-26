package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnySimpleTypeSimpleType;
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

public class FloatSimpleType extends AnySimpleTypeSimpleType  {


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "floatSimpleType");
span.setAttribute("ns", "http://www.w3.org/2001/XMLSchema");
span.setClassName("widget floatSimpleType");
return span;
}

// CONSTRUCTORS ------------------

/**
* Create an empty <code>FloatSimpleType</code> object
*/
public FloatSimpleType() {
super();
}
/**
* Create a <code>FloatSimpleType</code> object with teh given input data
*/
public FloatSimpleType(String value) {
super();
this.value = value;
}

// FIELDS ------------------
}

