package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.InlinereqreqComplexType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.StatusTypeSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
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
* the element judge is an inline element within judgements to identify where the document defines<br/> one of the judges, and his/her role
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class Judge extends InlinereqreqComplexType  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
        ,
        new StructureIndicator.DefaultChoice(0,-1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new Ref())
,        new StructureIndicator.DefaultElement(1,1,new Mref())
,        new StructureIndicator.DefaultElement(1,1,new Rref())
,        new StructureIndicator.DefaultElement(1,1,new Mod())
,        new StructureIndicator.DefaultElement(1,1,new Mmod())
,        new StructureIndicator.DefaultElement(1,1,new Rmod())
,        new StructureIndicator.DefaultElement(1,1,new Remark())
,        new StructureIndicator.DefaultElement(1,1,new RecordedTime())
,        new StructureIndicator.DefaultElement(1,1,new Vote())
,        new StructureIndicator.DefaultElement(1,1,new Outcome())
,        new StructureIndicator.DefaultElement(1,1,new Ins())
,        new StructureIndicator.DefaultElement(1,1,new Del())
,        new StructureIndicator.DefaultElement(1,1,new Omissis())
,        new StructureIndicator.DefaultElement(1,1,new ExtractText())
,        new StructureIndicator.DefaultElement(1,1,new ExtractStructure())
,        new StructureIndicator.DefaultElement(1,1,new Placeholder())
,        new StructureIndicator.DefaultElement(1,1,new FillIn())
)
)
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new B())
,        new StructureIndicator.DefaultElement(1,1,new I())
,        new StructureIndicator.DefaultElement(1,1,new A())
,        new StructureIndicator.DefaultElement(1,1,new U())
,        new StructureIndicator.DefaultElement(1,1,new Sub())
,        new StructureIndicator.DefaultElement(1,1,new Sup())
,        new StructureIndicator.DefaultElement(1,1,new Span())
)
)
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new DocType())
,        new StructureIndicator.DefaultElement(1,1,new DocTitle())
,        new StructureIndicator.DefaultElement(1,1,new DocNumber())
,        new StructureIndicator.DefaultElement(1,1,new DocProponent())
,        new StructureIndicator.DefaultElement(1,1,new DocDate())
,        new StructureIndicator.DefaultElement(1,1,new Legislature())
,        new StructureIndicator.DefaultElement(1,1,new Session())
,        new StructureIndicator.DefaultElement(1,1,new ShortTitle())
,        new StructureIndicator.DefaultElement(1,1,new DocPurpose())
,        new StructureIndicator.DefaultElement(1,1,new DocCommittee())
,        new StructureIndicator.DefaultElement(1,1,new DocIntroducer())
,        new StructureIndicator.DefaultElement(1,1,new DocStage())
,        new StructureIndicator.DefaultElement(1,1,new DocStatus())
,        new StructureIndicator.DefaultElement(1,1,new DocJurisdiction())
,        new StructureIndicator.DefaultElement(1,1,new DocketNumber())
)
)
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new Date())
,        new StructureIndicator.DefaultElement(1,1,new Person())
,        new StructureIndicator.DefaultElement(1,1,new Organization())
,        new StructureIndicator.DefaultElement(1,1,new Concept())
,        new StructureIndicator.DefaultElement(1,1,new Object())
,        new StructureIndicator.DefaultElement(1,1,new Event())
,        new StructureIndicator.DefaultElement(1,1,new Location())
,        new StructureIndicator.DefaultElement(1,1,new Process())
,        new StructureIndicator.DefaultElement(1,1,new Role())
,        new StructureIndicator.DefaultElement(1,1,new Term())
,        new StructureIndicator.DefaultElement(1,1,new Quantity())
,        new StructureIndicator.DefaultElement(1,1,new Def())
,        new StructureIndicator.DefaultElement(1,1,new Entity())
)
)
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new CourtType())
,        new StructureIndicator.DefaultElement(1,1,new NeutralCitation())
,        new StructureIndicator.DefaultElement(1,1,new Party())
,        new StructureIndicator.DefaultElement(1,1,new Judge())
,        new StructureIndicator.DefaultElement(1,1,new Lawyer())
,        new StructureIndicator.DefaultElement(1,1,new Signature())
,        new StructureIndicator.DefaultElement(1,1,new Opinion())
)
)
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new AffectedDocument())
,        new StructureIndicator.DefaultElement(1,1,new RelatedDocument())
,        new StructureIndicator.DefaultElement(1,1,new Change())
)
)
,        new StructureIndicator.DefaultElement(1,1,new Inline())
)
)
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultElement(1,1,new NoteRef())
,        new StructureIndicator.DefaultElement(1,1,new Eol())
,        new StructureIndicator.DefaultElement(1,1,new Eop())
)
)
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultSequence(1,1,        new StructureIndicator.DefaultElement(1,1,new Img())
)
)
,        new StructureIndicator.DefaultElement(1,1,new Marker())
)
)
,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultChoice(1,1,        new StructureIndicator.DefaultGroup(1,1,        new StructureIndicator.DefaultSequence(1,1,        new StructureIndicator.DefaultElement(1,1,new AuthorialNote())
)
)
,        new StructureIndicator.DefaultElement(1,1,new Popup())
)
)
)
)
)
        
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "judge");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget judge");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>Judge</code> object and set up its type
*/
public Judge() {
super(create());
setType("judge");
}

/**
* Constructor with required attributes
*/
public Judge(AnyURISimpleType refersToAttr,IDSimpleType idAttr) {
this();
setRefersToAttr(refersToAttr);
setIdAttr(idAttr);
}


/**
* Create a <code>Judge</code> object with the given DOM element
*/
public Judge(Element element) {
super(element);
}

// FIELDS ------------------
    private AnyURISimpleType asAttr;

        /**
        * Return <code>asAttr</code> property
        * @return asAttr
        */
        public AnyURISimpleType getAsAttr() {
        if (asAttr == null) {
                asAttr = new AnyURISimpleType();
                asAttr.setValue(getElement().getAttribute("as"));
        }

        return asAttr;
        }
        /**
        * Return <code>asAttr</code> property in DSL way
        * @return asAttr
        */
        public AnyURISimpleType asAttr() {
        return  getAsAttr();
        }
        /**
        * Set <code>asAttr</code> property
        * @param asAttr the new value
        */
        public void setAsAttr(final AnyURISimpleType asAttr) {
        this.asAttr = asAttr;
        getElement().setAttribute("as",asAttr.getValue());
        }
        /**
        * Set <code>asAttr</code> property in DSL way
        * @param asAttr the new value
        * @return <code>Judge</code> instance
        */
        public Judge asAttr(final AnyURISimpleType asAttr) {
        setAsAttr(asAttr);
        return this;
        }
//Override all attributes methods to be conformant with DSL approach
        /**
        * Set <code>langAttr</code> property in DSL way
        * @param langAttr new value
        * @return <code> Judge</code> instance
        */
        public Judge langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
        }
        /**
        * Set <code>refersToAttr</code> property in DSL way
        * @param refersToAttr new value
        * @return <code> Judge</code> instance
        */
        public Judge refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
        }
        /**
        * Set <code>statusAttr</code> property in DSL way
        * @param statusAttr new value
        * @return <code> Judge</code> instance
        */
        public Judge statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
        }
        /**
        * Set <code>alternativeToAttr</code> property in DSL way
        * @param alternativeToAttr new value
        * @return <code> Judge</code> instance
        */
        public Judge alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
        }
        /**
        * Set <code>idAttr</code> property in DSL way
        * @param idAttr new value
        * @return <code> Judge</code> instance
        */
        public Judge idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
        }
        /**
        * Set <code>evolvingIdAttr</code> property in DSL way
        * @param evolvingIdAttr new value
        * @return <code> Judge</code> instance
        */
        public Judge evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
        }
        /**
        * Set <code>wildcardContentAttr</code> property in DSL way
        * @param wildcardContentAttr new value
        * @return <code> Judge</code> instance
        */
        public Judge wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
        }
        /**
        * Set <code>classAttr</code> property in DSL way
        * @param classAttr new value
        * @return <code> Judge</code> instance
        */
        public Judge classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
        }
        /**
        * Set <code>styleAttr</code> property in DSL way
        * @param styleAttr new value
        * @return <code> Judge</code> instance
        */
        public Judge styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
        }
        /**
        * Set <code>titleAttr</code> property in DSL way
        * @param titleAttr new value
        * @return <code> Judge</code> instance
        */
        public Judge titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
        }
        /**
        * Set <code>periodAttr</code> property in DSL way
        * @param periodAttr new value
        * @return <code> Judge</code> instance
        */
        public Judge periodAttr(final AnyURISimpleType periodAttr) {
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
        attrs.put("as", getAsAttr() != null ? getAsAttr().getValue() : null);
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
public Judge html(String s) {
    super.html(s);
    return this;
}
}

