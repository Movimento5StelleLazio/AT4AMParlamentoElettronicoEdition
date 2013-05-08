package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;

/**
* Generated class
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class NormalizedStringSimpleType extends StringSimpleType  {


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "normalizedStringSimpleType");
span.setAttribute("ns", "http://www.w3.org/2001/XMLSchema");
span.setClassName("widget normalizedStringSimpleType");
return span;
}

// CONSTRUCTORS ------------------

/**
* Create an empty <code>NormalizedStringSimpleType</code> object
*/
public NormalizedStringSimpleType() {
super();
}
/**
* Create a <code>NormalizedStringSimpleType</code> object with teh given input data
*/
public NormalizedStringSimpleType(String value) {
super();
this.value = value;
}

// FIELDS ------------------
}

