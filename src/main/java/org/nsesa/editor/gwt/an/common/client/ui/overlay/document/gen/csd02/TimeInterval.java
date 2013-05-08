package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02;

import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.MetaoptComplexType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.DurationSimpleType;
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
* Generated class
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class TimeInterval extends MetaoptComplexType  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "timeInterval");
span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
span.setClassName("widget timeInterval");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>TimeInterval</code> object and set up its type
*/
public TimeInterval() {
super(create());
setType("timeInterval");
}

/**
* Constructor with required attributes
*/
public TimeInterval(AnyURISimpleType refersToAttr) {
this();
setRefersToAttr(refersToAttr);
}


/**
* Create a <code>TimeInterval</code> object with the given DOM element
*/
public TimeInterval(Element element) {
super(element);
}

// FIELDS ------------------
    private AnyURISimpleType startAttr;
    private AnyURISimpleType endAttr;
    private DurationSimpleType durationAttr;
    private AnyURISimpleType refersToAttr;

        /**
        * Return <code>startAttr</code> property
        * @return startAttr
        */
        public AnyURISimpleType getStartAttr() {
        if (startAttr == null) {
                startAttr = new AnyURISimpleType();
                startAttr.setValue(getElement().getAttribute("start"));
        }

        return startAttr;
        }
        /**
        * Return <code>startAttr</code> property in DSL way
        * @return startAttr
        */
        public AnyURISimpleType startAttr() {
        return  getStartAttr();
        }
        /**
        * Set <code>startAttr</code> property
        * @param startAttr the new value
        */
        public void setStartAttr(final AnyURISimpleType startAttr) {
        this.startAttr = startAttr;
        getElement().setAttribute("start",startAttr.getValue());
        }
        /**
        * Set <code>startAttr</code> property in DSL way
        * @param startAttr the new value
        * @return <code>TimeInterval</code> instance
        */
        public TimeInterval startAttr(final AnyURISimpleType startAttr) {
        setStartAttr(startAttr);
        return this;
        }
        /**
        * Return <code>endAttr</code> property
        * @return endAttr
        */
        public AnyURISimpleType getEndAttr() {
        if (endAttr == null) {
                endAttr = new AnyURISimpleType();
                endAttr.setValue(getElement().getAttribute("end"));
        }

        return endAttr;
        }
        /**
        * Return <code>endAttr</code> property in DSL way
        * @return endAttr
        */
        public AnyURISimpleType endAttr() {
        return  getEndAttr();
        }
        /**
        * Set <code>endAttr</code> property
        * @param endAttr the new value
        */
        public void setEndAttr(final AnyURISimpleType endAttr) {
        this.endAttr = endAttr;
        getElement().setAttribute("end",endAttr.getValue());
        }
        /**
        * Set <code>endAttr</code> property in DSL way
        * @param endAttr the new value
        * @return <code>TimeInterval</code> instance
        */
        public TimeInterval endAttr(final AnyURISimpleType endAttr) {
        setEndAttr(endAttr);
        return this;
        }
        /**
        * Return <code>durationAttr</code> property
        * @return durationAttr
        */
        public DurationSimpleType getDurationAttr() {
        if (durationAttr == null) {
                durationAttr = new DurationSimpleType();
                durationAttr.setValue(getElement().getAttribute("duration"));
        }

        return durationAttr;
        }
        /**
        * Return <code>durationAttr</code> property in DSL way
        * @return durationAttr
        */
        public DurationSimpleType durationAttr() {
        return  getDurationAttr();
        }
        /**
        * Set <code>durationAttr</code> property
        * @param durationAttr the new value
        */
        public void setDurationAttr(final DurationSimpleType durationAttr) {
        this.durationAttr = durationAttr;
        getElement().setAttribute("duration",durationAttr.getValue());
        }
        /**
        * Set <code>durationAttr</code> property in DSL way
        * @param durationAttr the new value
        * @return <code>TimeInterval</code> instance
        */
        public TimeInterval durationAttr(final DurationSimpleType durationAttr) {
        setDurationAttr(durationAttr);
        return this;
        }
        /**
        * Return <code>refersToAttr</code> property
        * @return refersToAttr
        */
        public AnyURISimpleType getRefersToAttr() {
        if (refersToAttr == null) {
                refersToAttr = new AnyURISimpleType();
                refersToAttr.setValue(getElement().getAttribute("refersTo"));
        }

        return refersToAttr;
        }
        /**
        * Return <code>refersToAttr</code> property in DSL way
        * @return refersToAttr
        */
        public AnyURISimpleType refersToAttr() {
        return  getRefersToAttr();
        }
        /**
        * Set <code>refersToAttr</code> property
        * @param refersToAttr the new value
        */
        public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
        getElement().setAttribute("refersTo",refersToAttr.getValue());
        }
        /**
        * Set <code>refersToAttr</code> property in DSL way
        * @param refersToAttr the new value
        * @return <code>TimeInterval</code> instance
        */
        public TimeInterval refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
        }
//Override all attributes methods to be conformant with DSL approach
        /**
        * Set <code>idAttr</code> property in DSL way
        * @param idAttr new value
        * @return <code> TimeInterval</code> instance
        */
        public TimeInterval idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
        }
        /**
        * Set <code>evolvingIdAttr</code> property in DSL way
        * @param evolvingIdAttr new value
        * @return <code> TimeInterval</code> instance
        */
        public TimeInterval evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
        }
        /**
        * Set <code>wildcardContentAttr</code> property in DSL way
        * @param wildcardContentAttr new value
        * @return <code> TimeInterval</code> instance
        */
        public TimeInterval wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
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
        attrs.put("start", getStartAttr() != null ? getStartAttr().getValue() : null);
        attrs.put("end", getEndAttr() != null ? getEndAttr().getValue() : null);
        attrs.put("duration", getDurationAttr() != null ? getDurationAttr().getValue() : null);
        attrs.put("refersTo", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
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
public TimeInterval html(String s) {
    super.html(s);
    return this;
}
}

