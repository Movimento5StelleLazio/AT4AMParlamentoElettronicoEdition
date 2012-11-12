package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.VersionTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Meta;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.CoverPage;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Preface;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Preamble;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.MainBody;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Conclusions;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0.Attachments;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.StringSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
/**
* This file is generated.
*/
public class OpenStructureComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
public OpenStructureComplexType(Element element) {
    super(element);
}

// FIELDS ------------------
private VersionTypeSimpleType containsAttr;
private Meta meta;
private CoverPage coverPage;
private Preface preface;
private Preamble preamble;
private MainBody mainBody;
private Conclusions conclusions;
private Attachments attachments;
private StringSimpleType nameAttr;

public VersionTypeSimpleType getContainsAttr() {
return containsAttr;
}

public void setContainsAttr(final VersionTypeSimpleType containsAttr) {
this.containsAttr = containsAttr;
}
public Meta getMeta() {
return meta;
}

public void setMeta(final Meta meta) {
this.meta = meta;
}
public CoverPage getCoverPage() {
return coverPage;
}

public void setCoverPage(final CoverPage coverPage) {
this.coverPage = coverPage;
}
public Preface getPreface() {
return preface;
}

public void setPreface(final Preface preface) {
this.preface = preface;
}
public Preamble getPreamble() {
return preamble;
}

public void setPreamble(final Preamble preamble) {
this.preamble = preamble;
}
public MainBody getMainBody() {
return mainBody;
}

public void setMainBody(final MainBody mainBody) {
this.mainBody = mainBody;
}
public Conclusions getConclusions() {
return conclusions;
}

public void setConclusions(final Conclusions conclusions) {
this.conclusions = conclusions;
}
public Attachments getAttachments() {
return attachments;
}

public void setAttachments(final Attachments attachments) {
this.attachments = attachments;
}
public StringSimpleType getNameAttr() {
return nameAttr;
}

public void setNameAttr(final StringSimpleType nameAttr) {
this.nameAttr = nameAttr;
}
/**
* Returns possible children as list of String
*/
@Override
public String[] getAllowedChildTypes() {
    String[] subtypes = new String[]{"conclusions","preface","mainBody","preamble","coverPage","attachments","meta"};
    return  subtypes;
}
}
