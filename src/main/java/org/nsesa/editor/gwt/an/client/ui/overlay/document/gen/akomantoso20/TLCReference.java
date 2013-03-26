package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ReferenceTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import java.util.HashMap;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;
import java.util.LinkedHashMap;
import java.util.Map;
import com.google.gwt.user.client.DOM;

/**
* The element TLCreference is a generic metadata reference to the Akoma Ntoso URI of an ontology instance of a class specified through the name attribute
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class TLCReference extends ReferenceTypeComplexType  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "TLCReference");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget TLCReference");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>TLCReference</code> object and set up its type
*/
public TLCReference() {
super(create());
setType("TLCReference");
}

/**
* Constructor with required attributes
*/
public TLCReference(StringSimpleType nameAttr,StringSimpleType showAsAttr,IDSimpleType idAttr,AnyURISimpleType hrefAttr) {
this();
setNameAttr(nameAttr);
setShowAsAttr(showAsAttr);
setIdAttr(idAttr);
setHrefAttr(hrefAttr);
}


/**
* Create a <code>TLCReference</code> object with the given DOM element
*/
public TLCReference(Element element) {
super(element);
}

// FIELDS ------------------
    private StringSimpleType nameAttr;

        /**
        * Return <code>nameAttr</code> property
        * @return nameAttr
        */
        public StringSimpleType getNameAttr() {
        if (nameAttr == null) {
                nameAttr = new StringSimpleType();
                nameAttr.setValue(getElement().getAttribute("name"));
        }

        return nameAttr;
        }
        /**
        * Return <code>nameAttr</code> property in DSL way
        * @return nameAttr
        */
        public StringSimpleType nameAttr() {
        return  getNameAttr();
        }
        /**
        * Set <code>nameAttr</code> property
        * @param nameAttr the new value
        */
        public void setNameAttr(final StringSimpleType nameAttr) {
        this.nameAttr = nameAttr;
        getElement().setAttribute("name",nameAttr.getValue());
        }
        /**
        * Set <code>nameAttr</code> property in DSL way
        * @param nameAttr the new value
        * @return <code>TLCReference</code> instance
        */
        public TLCReference nameAttr(final StringSimpleType nameAttr) {
        setNameAttr(nameAttr);
        return this;
        }
//Override all attributes methods to be conformant with DSL approach
        /**
        * Set <code>showAsAttr</code> property in DSL way
        * @param showAsAttr new value
        * @return <code> TLCReference</code> instance
        */
        public TLCReference showAsAttr(final StringSimpleType showAsAttr) {
        setShowAsAttr(showAsAttr);
        return this;
        }
        /**
        * Set <code>shortFormAttr</code> property in DSL way
        * @param shortFormAttr new value
        * @return <code> TLCReference</code> instance
        */
        public TLCReference shortFormAttr(final StringSimpleType shortFormAttr) {
        setShortFormAttr(shortFormAttr);
        return this;
        }
        /**
        * Set <code>wildcardContentAttr</code> property in DSL way
        * @param wildcardContentAttr new value
        * @return <code> TLCReference</code> instance
        */
        public TLCReference wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
        }
        /**
        * Set <code>idAttr</code> property in DSL way
        * @param idAttr new value
        * @return <code> TLCReference</code> instance
        */
        public TLCReference idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
        }
        /**
        * Set <code>evolvingIdAttr</code> property in DSL way
        * @param evolvingIdAttr new value
        * @return <code> TLCReference</code> instance
        */
        public TLCReference evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
        }
        /**
        * Set <code>hrefAttr</code> property in DSL way
        * @param hrefAttr new value
        * @return <code> TLCReference</code> instance
        */
        public TLCReference hrefAttr(final AnyURISimpleType hrefAttr) {
        setHrefAttr(hrefAttr);
        return this;
        }

/**
* Returns the namespace URI of this amendable widget.
* @return The namesapce as String
*/
@Override
public String getNamespaceURI() {
return "http://www.akomantoso.org/2.0";
}

@Override
public LinkedHashMap<String, String> getAttributes() {
final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
attrs.putAll(super.getAttributes());
        attrs.put("name", getNameAttr() != null ? getNameAttr().getValue() : null);
return attrs;
}

@Override
public StructureIndicator getStructureIndicator() {
    return STRUCTURE_INDICATOR;
}

/**
* DSL Style for html method
*/
@Override
public TLCReference html(String s) {
    super.html(s);
    return this;
}
}

