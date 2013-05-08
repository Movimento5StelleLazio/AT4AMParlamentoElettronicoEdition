package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02;

import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.MarkeroptComplexType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.IntegerSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.NCNameSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.StatusTypeSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
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
* the complex type eolType is shared by eol and eop elements as being able to specify a position within the next word in which the break can happen
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class EolTypeComplexType extends MarkeroptComplexType  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "eolTypeComplexType");
span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
span.setClassName("widget eolTypeComplexType");
return span;
}

// CONSTRUCTORS ------------------

/**
* Create a <code>EolTypeComplexType</code> object with the given DOM element
*/
public EolTypeComplexType(Element element) {
super(element);
}

// FIELDS ------------------
    private IntegerSimpleType breakatAttr;

        /**
        * Return <code>breakatAttr</code> property
        * @return breakatAttr
        */
        public IntegerSimpleType getBreakatAttr() {
        if (breakatAttr == null) {
                breakatAttr = new IntegerSimpleType();
                breakatAttr.setValue(getElement().getAttribute("breakat"));
        }

        return breakatAttr;
        }
        /**
        * Return <code>breakatAttr</code> property in DSL way
        * @return breakatAttr
        */
        public IntegerSimpleType breakatAttr() {
        return  getBreakatAttr();
        }
        /**
        * Set <code>breakatAttr</code> property
        * @param breakatAttr the new value
        */
        public void setBreakatAttr(final IntegerSimpleType breakatAttr) {
        this.breakatAttr = breakatAttr;
        getElement().setAttribute("breakat",breakatAttr.getValue());
        }
        /**
        * Set <code>breakatAttr</code> property in DSL way
        * @param breakatAttr the new value
        * @return <code>EolTypeComplexType</code> instance
        */
        public EolTypeComplexType breakatAttr(final IntegerSimpleType breakatAttr) {
        setBreakatAttr(breakatAttr);
        return this;
        }
//Override all attributes methods to be conformant with DSL approach
        /**
        * Set <code>langAttr</code> property in DSL way
        * @param langAttr new value
        * @return <code> EolTypeComplexType</code> instance
        */
        public EolTypeComplexType langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
        }
        /**
        * Set <code>spaceAttr</code> property in DSL way
        * @param spaceAttr new value
        * @return <code> EolTypeComplexType</code> instance
        */
        public EolTypeComplexType spaceAttr(final NCNameSimpleType spaceAttr) {
        setSpaceAttr(spaceAttr);
        return this;
        }
        /**
        * Set <code>wildcardContentAttr</code> property in DSL way
        * @param wildcardContentAttr new value
        * @return <code> EolTypeComplexType</code> instance
        */
        public EolTypeComplexType wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
        }
        /**
        * Set <code>refersToAttr</code> property in DSL way
        * @param refersToAttr new value
        * @return <code> EolTypeComplexType</code> instance
        */
        public EolTypeComplexType refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
        }
        /**
        * Set <code>classAttr</code> property in DSL way
        * @param classAttr new value
        * @return <code> EolTypeComplexType</code> instance
        */
        public EolTypeComplexType classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
        }
        /**
        * Set <code>styleAttr</code> property in DSL way
        * @param styleAttr new value
        * @return <code> EolTypeComplexType</code> instance
        */
        public EolTypeComplexType styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
        }
        /**
        * Set <code>titleAttr</code> property in DSL way
        * @param titleAttr new value
        * @return <code> EolTypeComplexType</code> instance
        */
        public EolTypeComplexType titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
        }
        /**
        * Set <code>statusAttr</code> property in DSL way
        * @param statusAttr new value
        * @return <code> EolTypeComplexType</code> instance
        */
        public EolTypeComplexType statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
        }
        /**
        * Set <code>idAttr</code> property in DSL way
        * @param idAttr new value
        * @return <code> EolTypeComplexType</code> instance
        */
        public EolTypeComplexType idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
        }
        /**
        * Set <code>evolvingIdAttr</code> property in DSL way
        * @param evolvingIdAttr new value
        * @return <code> EolTypeComplexType</code> instance
        */
        public EolTypeComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
        }
        /**
        * Set <code>alternativeToAttr</code> property in DSL way
        * @param alternativeToAttr new value
        * @return <code> EolTypeComplexType</code> instance
        */
        public EolTypeComplexType alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
        }
        /**
        * Set <code>periodAttr</code> property in DSL way
        * @param periodAttr new value
        * @return <code> EolTypeComplexType</code> instance
        */
        public EolTypeComplexType periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
        }

/**
* Returns the namespace URI of this amendable widget.
* @return The namesapce as String
*/
@Override
public String getNamespaceURI() {
return "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02";
}

@Override
public LinkedHashMap<String, String> getAttributes() {
final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
attrs.putAll(super.getAttributes());
        attrs.put("breakat", getBreakatAttr() != null ? getBreakatAttr().getValue() : null);
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
public EolTypeComplexType html(String s) {
    super.html(s);
    return this;
}
}

