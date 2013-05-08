package org.nsesa.editor.gwt.an.common.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.StructureIndicator;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
* Generated class
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class Components extends OverlayWidgetImpl  {

/** Stores a structure indicator coming from xsd structure **/
private static StructureIndicator STRUCTURE_INDICATOR = new StructureIndicator.DefaultStructureIndicator(1,1
        ,
        new StructureIndicator.DefaultSequence(1,-1,        new StructureIndicator.DefaultElement(1,1,new Component())
)
        
);


/**
* Create a browser DOM span element and set up "type", "ns" and css class attributes
*/
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "components");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget components");
return span;
}

// CONSTRUCTORS ------------------
/**
* Create a <code>Components</code> object and set up its type
*/
public Components() {
super(create());
setType("components");
}



/**
* Create a <code>Components</code> object with the given DOM element
*/
public Components(Element element) {
super(element);
}

// FIELDS ------------------

            /**
            * Return <code>java.util.List<Component></code> property
            * @return The property as unmodifiable list
            */
            public java.util.List<Component> getComponents() {
                java.util.List<Component> result = new ArrayList<Component>();
                for (OverlayWidget widget : getChildOverlayWidgets()) {
                    if ("Component".equalsIgnoreCase(widget.getType()) && "http://www.akomantoso.org/2.0".equalsIgnoreCase(widget.getNamespaceURI())) {
                        result.add((Component)widget);
                    }
                }
                return java.util.Collections.unmodifiableList(result);
            }

            /**
            * Return <code>java.util.List<Component></code> property in DSL way
            * @return The property as unmodifiable list
            */
            public java.util.List<Component> getComponentList() {
                return  getComponents();
            }
            /**
            * Add <code>java.util.List<Component></code> property in the list of properties
            * @return The property as unmodifiable list
            */
            public Component addComponent(Component componentElem) {
                this.addOverlayWidget(componentElem);
                return componentElem;
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
public Components html(String s) {
    super.html(s);
    return this;
}
}

