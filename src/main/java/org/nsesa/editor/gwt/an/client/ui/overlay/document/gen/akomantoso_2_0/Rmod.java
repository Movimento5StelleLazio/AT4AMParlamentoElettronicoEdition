package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.ModTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class Rmod extends ModTypeComplexType  {

// CONSTRUCTORS ------------------
public Rmod(Element element) {
    super(element);
}

// FIELDS ------------------
private AnyURISimpleType fromAttr;
private AnyURISimpleType upToAttr;

public AnyURISimpleType getFromAttr() {
return fromAttr;
}

public void setFromAttr(final AnyURISimpleType fromAttr) {
this.fromAttr = fromAttr;
}
public AnyURISimpleType getUpToAttr() {
return upToAttr;
}

public void setUpToAttr(final AnyURISimpleType upToAttr) {
this.upToAttr = upToAttr;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"person","neutralCitation","docType","location","remark","docStatus","change","entity","authorialNote","img","party","legislature","event","quotedStructure","eol","role","opinion","quantity","extractStructure","eop","fillIn","signature","docStage","mmod","docCommittee","vote","ins","mod","noteRef","docNumber","rref","marker","session","recordedTime","lawyer","docPurpose","extractText","span","sub","concept","courtType","docJurisdiction","object","sup","docProponent","date","omissis","rmod","organization","def","docketNumber","judge","quotedText","popup","inline","docTitle","del","docDate","relatedDocument","affectedDocument","mref","docIntroducer","b","placeholder","a","outcome","i","process","ref","u","term","shortTitle"};
    return  subtypes;
}
}
