/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02;

import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.csd02.MetaoptComplexType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.DateSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.TimeSimpleType;
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
* The element publication is the metadata container specifying a publication event for the FRBR expression of the document.
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class Publication extends MetaoptComplexType  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "publication");
span.setAttribute("ns", "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD02");
span.setClassName("widget publication");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>Publication</code> object and set up its type
*/
public Publication() {
super(create());
setType("publication");
}

/**
* Constructor with required attributes
*/
public Publication(StringSimpleType showAsAttr,StringSimpleType nameAttr,DateSimpleType dateAttr) {
this();
setShowAsAttr(showAsAttr);
setNameAttr(nameAttr);
setDateAttr(dateAttr);
}


/**
* Create a <code>Publication</code> object with the given DOM element
*/
public Publication(Element element) {
super(element);
}

// FIELDS ------------------
    private StringSimpleType showAsAttr;
    private StringSimpleType shortFormAttr;
    private AnyURISimpleType refersToAttr;
    private StringSimpleType numberAttr;
    private StringSimpleType nameAttr;
    private DateSimpleType dateAttr;
    private TimeSimpleType timeAttr;

        /**
        * Return <code>showAsAttr</code> property
        * @return showAsAttr
        */
        public StringSimpleType getShowAsAttr() {
        if (showAsAttr == null) {
                showAsAttr = new StringSimpleType();
                showAsAttr.setValue(getElement().getAttribute("showAs"));
        }

        return showAsAttr;
        }
        /**
        * Return <code>showAsAttr</code> property in DSL way
        * @return showAsAttr
        */
        public StringSimpleType showAsAttr() {
        return  getShowAsAttr();
        }
        /**
        * Set <code>showAsAttr</code> property
        * @param showAsAttr the new value
        */
        public void setShowAsAttr(final StringSimpleType showAsAttr) {
        this.showAsAttr = showAsAttr;
        getElement().setAttribute("showAs",showAsAttr.getValue());
        }
        /**
        * Set <code>showAsAttr</code> property in DSL way
        * @param showAsAttr the new value
        * @return <code>Publication</code> instance
        */
        public Publication showAsAttr(final StringSimpleType showAsAttr) {
        setShowAsAttr(showAsAttr);
        return this;
        }
        /**
        * Return <code>shortFormAttr</code> property
        * @return shortFormAttr
        */
        public StringSimpleType getShortFormAttr() {
        if (shortFormAttr == null) {
                shortFormAttr = new StringSimpleType();
                shortFormAttr.setValue(getElement().getAttribute("shortForm"));
        }

        return shortFormAttr;
        }
        /**
        * Return <code>shortFormAttr</code> property in DSL way
        * @return shortFormAttr
        */
        public StringSimpleType shortFormAttr() {
        return  getShortFormAttr();
        }
        /**
        * Set <code>shortFormAttr</code> property
        * @param shortFormAttr the new value
        */
        public void setShortFormAttr(final StringSimpleType shortFormAttr) {
        this.shortFormAttr = shortFormAttr;
        getElement().setAttribute("shortForm",shortFormAttr.getValue());
        }
        /**
        * Set <code>shortFormAttr</code> property in DSL way
        * @param shortFormAttr the new value
        * @return <code>Publication</code> instance
        */
        public Publication shortFormAttr(final StringSimpleType shortFormAttr) {
        setShortFormAttr(shortFormAttr);
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
        * @return <code>Publication</code> instance
        */
        public Publication refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
        }
        /**
        * Return <code>numberAttr</code> property
        * @return numberAttr
        */
        public StringSimpleType getNumberAttr() {
        if (numberAttr == null) {
                numberAttr = new StringSimpleType();
                numberAttr.setValue(getElement().getAttribute("number"));
        }

        return numberAttr;
        }
        /**
        * Return <code>numberAttr</code> property in DSL way
        * @return numberAttr
        */
        public StringSimpleType numberAttr() {
        return  getNumberAttr();
        }
        /**
        * Set <code>numberAttr</code> property
        * @param numberAttr the new value
        */
        public void setNumberAttr(final StringSimpleType numberAttr) {
        this.numberAttr = numberAttr;
        getElement().setAttribute("number",numberAttr.getValue());
        }
        /**
        * Set <code>numberAttr</code> property in DSL way
        * @param numberAttr the new value
        * @return <code>Publication</code> instance
        */
        public Publication numberAttr(final StringSimpleType numberAttr) {
        setNumberAttr(numberAttr);
        return this;
        }
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
        * @return <code>Publication</code> instance
        */
        public Publication nameAttr(final StringSimpleType nameAttr) {
        setNameAttr(nameAttr);
        return this;
        }
        /**
        * Return <code>dateAttr</code> property
        * @return dateAttr
        */
        public DateSimpleType getDateAttr() {
        if (dateAttr == null) {
                dateAttr = new DateSimpleType();
                dateAttr.setValue(getElement().getAttribute("date"));
        }

        return dateAttr;
        }
        /**
        * Return <code>dateAttr</code> property in DSL way
        * @return dateAttr
        */
        public DateSimpleType dateAttr() {
        return  getDateAttr();
        }
        /**
        * Set <code>dateAttr</code> property
        * @param dateAttr the new value
        */
        public void setDateAttr(final DateSimpleType dateAttr) {
        this.dateAttr = dateAttr;
        getElement().setAttribute("date",dateAttr.getValue());
        }
        /**
        * Set <code>dateAttr</code> property in DSL way
        * @param dateAttr the new value
        * @return <code>Publication</code> instance
        */
        public Publication dateAttr(final DateSimpleType dateAttr) {
        setDateAttr(dateAttr);
        return this;
        }
        /**
        * Return <code>timeAttr</code> property
        * @return timeAttr
        */
        public TimeSimpleType getTimeAttr() {
        if (timeAttr == null) {
                timeAttr = new TimeSimpleType();
                timeAttr.setValue(getElement().getAttribute("time"));
        }

        return timeAttr;
        }
        /**
        * Return <code>timeAttr</code> property in DSL way
        * @return timeAttr
        */
        public TimeSimpleType timeAttr() {
        return  getTimeAttr();
        }
        /**
        * Set <code>timeAttr</code> property
        * @param timeAttr the new value
        */
        public void setTimeAttr(final TimeSimpleType timeAttr) {
        this.timeAttr = timeAttr;
        getElement().setAttribute("time",timeAttr.getValue());
        }
        /**
        * Set <code>timeAttr</code> property in DSL way
        * @param timeAttr the new value
        * @return <code>Publication</code> instance
        */
        public Publication timeAttr(final TimeSimpleType timeAttr) {
        setTimeAttr(timeAttr);
        return this;
        }
//Override all attributes methods to be conformant with DSL approach
        /**
        * Set <code>wildcardContentAttr</code> property in DSL way
        * @param wildcardContentAttr new value
        * @return <code> Publication</code> instance
        */
        public Publication wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
        }
        /**
        * Set <code>idAttr</code> property in DSL way
        * @param idAttr new value
        * @return <code> Publication</code> instance
        */
        public Publication idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
        }
        /**
        * Set <code>evolvingIdAttr</code> property in DSL way
        * @param evolvingIdAttr new value
        * @return <code> Publication</code> instance
        */
        public Publication evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
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
        attrs.put("showAs", getShowAsAttr() != null ? getShowAsAttr().getValue() : null);
        attrs.put("shortForm", getShortFormAttr() != null ? getShortFormAttr().getValue() : null);
        attrs.put("refersTo", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
        attrs.put("number", getNumberAttr() != null ? getNumberAttr().getValue() : null);
        attrs.put("name", getNameAttr() != null ? getNameAttr().getValue() : null);
        attrs.put("date", getDateAttr() != null ? getDateAttr().getValue() : null);
        attrs.put("time", getTimeAttr() != null ? getTimeAttr().getValue() : null);
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
public Publication html(String s) {
    super.html(s);
    return this;
}
}

