package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ModificationTypeComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.ForceModsSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.StatusTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.BooleanSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.HashMap;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
import java.util.LinkedHashMap;
import java.util.Map;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class ForceMod extends ModificationTypeComplexType  {
    private static Map<AmendableWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<AmendableWidget, Occurrence>() {
        {
            put(new Source(), new Occurrence(1,-1));
            put(new Destination(), new Occurrence(1,-1));
            put(new Force(), new Occurrence(0,1));
            put(new Efficacy(), new Occurrence(0,1));
            put(new Application(), new Occurrence(0,1));
            put(new Duration(), new Occurrence(0,1));
            put(new Condition(), new Occurrence(0,1));
        }
    };


// STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "forceMod");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget forceMod");
        return span;
    }

// CONSTRUCTORS ------------------
    public ForceMod() {
        super(create());
        setType("forceMod");
    }

    public ForceMod(Element element) {
        super(element);
    }

// FIELDS ------------------
    private ForceModsSimpleType typeAttr;

    public ForceModsSimpleType getTypeAttr() {
        if (typeAttr == null) {
            typeAttr = ForceModsSimpleType.fromString(getElement().getAttribute("type"));
        }

        return typeAttr;
     }
     //DSL Style get value
    public ForceModsSimpleType typeAttr() {
        return  getTypeAttr();
    }

    public void setTypeAttr(final ForceModsSimpleType typeAttr) {
        this.typeAttr = typeAttr;
    }
     //DSL Style set value
    public ForceMod typeAttr(final ForceModsSimpleType typeAttr) {
        setTypeAttr(typeAttr);
        return this;
    }
    //Override all attributes methods to be conformant with DSL approach
    //DSL Style set value
    public ForceMod refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }
    //DSL Style set value
    public ForceMod wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }
    //DSL Style set value
    public ForceMod statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }
    //DSL Style set value
    public ForceMod exclusionAttr(final BooleanSimpleType exclusionAttr) {
        setExclusionAttr(exclusionAttr);
        return this;
    }
    //DSL Style set value
    public ForceMod incompleteAttr(final BooleanSimpleType incompleteAttr) {
        setIncompleteAttr(incompleteAttr);
        return this;
    }
    //DSL Style set value
    public ForceMod idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }
    //DSL Style set value
    public ForceMod evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }
    //DSL Style set value
    public ForceMod periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
    }

    /**
    * Returns possible children as a map of <tt>AmendableWidget, Occurrence</tt>s.
    */
    @Override
    public Map<AmendableWidget, Occurrence> getAllowedChildTypes() {
        return ALLOWED_SUB_TYPES;
    }

/**
    * Returns the namespace URI of this amendable widget.
    */
    @Override
    public String getNamespaceURI() {
        return "http://www.akomantoso.org/2.0";
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("type", getTypeAttr() != null ? getTypeAttr().value() : null);
        return attrs;
    }
}

