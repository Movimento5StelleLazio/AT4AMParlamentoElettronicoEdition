package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.AlthierarchyComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.StatusTypeSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
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
* this element is a structural container for parts of a debates that contain resolutions
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class NationalInterest extends AlthierarchyComplexType  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
        ,
        new StructureIndicator.DefaultChoice(0,-1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new AdministrationOfOath())
,        new StructureIndicator.DefaultElement(1,1,new RollCall())
,        new StructureIndicator.DefaultElement(1,1,new Prayers())
,        new StructureIndicator.DefaultElement(1,1,new OralStatements())
,        new StructureIndicator.DefaultElement(1,1,new WrittenStatements())
,        new StructureIndicator.DefaultElement(1,1,new PersonalStatements())
,        new StructureIndicator.DefaultElement(1,1,new MinisterialStatements())
,        new StructureIndicator.DefaultElement(1,1,new Resolutions())
,        new StructureIndicator.DefaultElement(1,1,new NationalInterest())
,        new StructureIndicator.DefaultElement(1,1,new DeclarationOfVote())
,        new StructureIndicator.DefaultElement(1,1,new Communication())
,        new StructureIndicator.DefaultElement(1,1,new Petitions())
,        new StructureIndicator.DefaultElement(1,1,new Papers())
,        new StructureIndicator.DefaultElement(1,1,new NoticesOfMotion())
,        new StructureIndicator.DefaultElement(1,1,new Questions())
,        new StructureIndicator.DefaultElement(1,1,new Address())
,        new StructureIndicator.DefaultElement(1,1,new ProceduralMotions())
,        new StructureIndicator.DefaultElement(1,1,new PointOfOrder())
,        new StructureIndicator.DefaultElement(1,1,new Adjournment())
,        new StructureIndicator.DefaultElement(1,1,new DebateSection())
)
)
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultSequence(1,1,        new StructureIndicator.DefaultElement(1,1,new Div())
)
)
,        new StructureIndicator.DefaultElement(1,1,new Container())
)
)
,        new StructureIndicator.DefaultElement(1,1,new ComponentRef())
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new Speech())
,        new StructureIndicator.DefaultElement(1,1,new Question())
,        new StructureIndicator.DefaultElement(1,1,new Answer())
,        new StructureIndicator.DefaultElement(1,1,new Other())
,        new StructureIndicator.DefaultElement(1,1,new Scene())
,        new StructureIndicator.DefaultElement(1,1,new Narrative())
,        new StructureIndicator.DefaultElement(1,1,new Summary())
)
)
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new BlockList())
,        new StructureIndicator.DefaultElement(1,1,new Toc())
,        new StructureIndicator.DefaultElement(1,1,new Tblock())
)
)
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new Ul())
,        new StructureIndicator.DefaultElement(1,1,new Ol())
,        new StructureIndicator.DefaultElement(1,1,new Table())
,        new StructureIndicator.DefaultElement(1,1,new P())
)
)
,        new StructureIndicator.DefaultElement(1,1,new Foreign())
,        new StructureIndicator.DefaultElement(1,1,new Block())
)
)
)
        ,

        new StructureIndicator.DefaultSequence(1,1,        new StructureIndicator.DefaultElement(0,1,new Num())
,        new StructureIndicator.DefaultElement(0,1,new Heading())
,        new StructureIndicator.DefaultElement(0,1,new Subheading())
)
        
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "nationalInterest");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget nationalInterest");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>NationalInterest</code> object and set up its type
*/
public NationalInterest() {
super(create());
setType("nationalInterest");
}

/**
* Constructor with required attributes
*/
public NationalInterest(IDSimpleType idAttr) {
this();
setIdAttr(idAttr);
}


/**
* Create a <code>NationalInterest</code> object with the given DOM element
*/
public NationalInterest(Element element) {
super(element);
}

// FIELDS ------------------

//Override all attributes methods to be conformant with DSL approach
        /**
        * Set <code>idAttr</code> property in DSL way
        * @param idAttr new value
        * @return <code> NationalInterest</code> instance
        */
        public NationalInterest idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
        }
        /**
        * Set <code>evolvingIdAttr</code> property in DSL way
        * @param evolvingIdAttr new value
        * @return <code> NationalInterest</code> instance
        */
        public NationalInterest evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
        }
        /**
        * Set <code>classAttr</code> property in DSL way
        * @param classAttr new value
        * @return <code> NationalInterest</code> instance
        */
        public NationalInterest classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
        }
        /**
        * Set <code>styleAttr</code> property in DSL way
        * @param styleAttr new value
        * @return <code> NationalInterest</code> instance
        */
        public NationalInterest styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
        }
        /**
        * Set <code>titleAttr</code> property in DSL way
        * @param titleAttr new value
        * @return <code> NationalInterest</code> instance
        */
        public NationalInterest titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
        }
        /**
        * Set <code>wildcardContentAttr</code> property in DSL way
        * @param wildcardContentAttr new value
        * @return <code> NationalInterest</code> instance
        */
        public NationalInterest wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
        }
        /**
        * Set <code>alternativeToAttr</code> property in DSL way
        * @param alternativeToAttr new value
        * @return <code> NationalInterest</code> instance
        */
        public NationalInterest alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
        }
        /**
        * Set <code>statusAttr</code> property in DSL way
        * @param statusAttr new value
        * @return <code> NationalInterest</code> instance
        */
        public NationalInterest statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
        }
        /**
        * Set <code>refersToAttr</code> property in DSL way
        * @param refersToAttr new value
        * @return <code> NationalInterest</code> instance
        */
        public NationalInterest refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
        }
        /**
        * Set <code>langAttr</code> property in DSL way
        * @param langAttr new value
        * @return <code> NationalInterest</code> instance
        */
        public NationalInterest langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
        }
        /**
        * Set <code>periodAttr</code> property in DSL way
        * @param periodAttr new value
        * @return <code> NationalInterest</code> instance
        */
        public NationalInterest periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
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
public NationalInterest html(String s) {
    super.html(s);
    return this;
}
}

