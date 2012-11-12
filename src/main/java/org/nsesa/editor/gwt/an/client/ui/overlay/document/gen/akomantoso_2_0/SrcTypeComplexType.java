package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class SrcTypeComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public SrcTypeComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private IDSimpleType idAttr;
private NMTOKENSimpleType evolvingIdAttr;
private AmendableWidgetImpl wildcardContentAttr;
private StringSimpleType showAsAttr;
private StringSimpleType shortFormAttr;
private AnyURISimpleType srcAttr;
private StringSimpleType altAttr;

public IDSimpleType getIdAttr() {
return idAttr;
}

public void setIdAttr(final IDSimpleType idAttr) {
this.idAttr = idAttr;
}
public NMTOKENSimpleType getEvolvingIdAttr() {
return evolvingIdAttr;
}

public void setEvolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
this.evolvingIdAttr = evolvingIdAttr;
}
public AmendableWidgetImpl getWildcardContentAttr() {
return wildcardContentAttr;
}

public void setWildcardContentAttr(final AmendableWidgetImpl wildcardContentAttr) {
this.wildcardContentAttr = wildcardContentAttr;
}
public StringSimpleType getShowAsAttr() {
return showAsAttr;
}

public void setShowAsAttr(final StringSimpleType showAsAttr) {
this.showAsAttr = showAsAttr;
}
public StringSimpleType getShortFormAttr() {
return shortFormAttr;
}

public void setShortFormAttr(final StringSimpleType shortFormAttr) {
this.shortFormAttr = shortFormAttr;
}
public AnyURISimpleType getSrcAttr() {
return srcAttr;
}

public void setSrcAttr(final AnyURISimpleType srcAttr) {
this.srcAttr = srcAttr;
}
public StringSimpleType getAltAttr() {
return altAttr;
}

public void setAltAttr(final StringSimpleType altAttr) {
this.altAttr = altAttr;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{};
    return  subtypes;
}
}
