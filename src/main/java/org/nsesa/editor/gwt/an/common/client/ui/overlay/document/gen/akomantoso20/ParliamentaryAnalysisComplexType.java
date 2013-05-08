package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.QuorumVerification;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Voting;
import org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20.Recount;
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
* The complex type parliamentaryAnalysis is a list of all the parliamentary analysis elements<br/> that can be used on the analysis of a debate
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class ParliamentaryAnalysisComplexType extends OverlayWidgetImpl  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
        ,
        new StructureIndicator.DefaultChoice(1,-1,        new StructureIndicator.DefaultElement(1,1,new QuorumVerification())
,        new StructureIndicator.DefaultElement(1,1,new Voting())
,        new StructureIndicator.DefaultElement(1,1,new Recount())
)
        
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "parliamentaryAnalysisComplexType");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget parliamentaryAnalysisComplexType");
return span;
}

// CONSTRUCTORS ------------------

/**
* Create a <code>ParliamentaryAnalysisComplexType</code> object with the given DOM element
*/
public ParliamentaryAnalysisComplexType(Element element) {
super(element);
}

// FIELDS ------------------

            /**
            * Return <code>java.util.List<QuorumVerification></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<QuorumVerification> getQuorumVerifications() {
                java.util.List<QuorumVerification> result = new ArrayList<QuorumVerification>();
                for (OverlayWidget widget : getChildOverlayWidgets()) {
                    if ("QuorumVerification".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
                        result.add((QuorumVerification)widget);
                    }
                }
                return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<QuorumVerification></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<QuorumVerification> getQuorumVerificationList() {
                return  getQuorumVerifications();
            }
            /**
            * Add <code>java.util.List<QuorumVerification></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public QuorumVerification addQuorumVerification(QuorumVerification quorumVerificationElem) {
                this.addOverlayWidget(quorumVerificationElem);
                return quorumVerificationElem;
            }

            /**
            * Return <code>java.util.List<Voting></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<Voting> getVotings() {
                java.util.List<Voting> result = new ArrayList<Voting>();
                for (OverlayWidget widget : getChildOverlayWidgets()) {
                    if ("Voting".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
                        result.add((Voting)widget);
                    }
                }
                return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<Voting></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<Voting> getVotingList() {
                return  getVotings();
            }
            /**
            * Add <code>java.util.List<Voting></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Voting addVoting(Voting votingElem) {
                this.addOverlayWidget(votingElem);
                return votingElem;
            }

            /**
            * Return <code>java.util.List<Recount></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<Recount> getRecounts() {
                java.util.List<Recount> result = new ArrayList<Recount>();
                for (OverlayWidget widget : getChildOverlayWidgets()) {
                    if ("Recount".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
                        result.add((Recount)widget);
                    }
                }
                return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<Recount></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<Recount> getRecountList() {
                return  getRecounts();
            }
            /**
            * Add <code>java.util.List<Recount></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Recount addRecount(Recount recountElem) {
                this.addOverlayWidget(recountElem);
                return recountElem;
            }

//Override all attributes methods to be conformant with DSL approach

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
public ParliamentaryAnalysisComplexType html(String s) {
    super.html(s);
    return this;
}
}

