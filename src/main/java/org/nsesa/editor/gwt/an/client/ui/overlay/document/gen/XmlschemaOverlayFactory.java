package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen;

import com.google.inject.Inject;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.DefaultOverlayFactory;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayStrategy;
import org.nsesa.editor.gwt.core.client.ClientFactory;
import com.google.gwt.dom.client.Element;
import java.util.logging.Logger;
import java.util.Map;
/**
* A factory class specialization used to create overlay wigets based on the given DOM element input data
* Note: this file is generated. Rather than changing this file, correct the template called <tt>overlayFactory.ftl</tt>.
*/
public class XmlschemaOverlayFactory extends DefaultOverlayFactory  {

private final static Logger LOG = Logger.getLogger(XmlschemaOverlayFactory.class.getName());
/** the namespace URI of the overlay factory **/
private final String namespaceURI = "http://www.w3.org/2001/XMLSchema";

/**
* Create <code>XmlschemaOverlayFactory</code> object with the given overlay strategy
* @param overlayStrategy The strategy to be used to create overlay widget objects
*/
@Inject
public XmlschemaOverlayFactory(final OverlayStrategy overlayStrategy) {
super(overlayStrategy);
}
/**
* Return <code>namespaceURI</code> of the overlay class
* @return the namespace URI as String
*/
@Override
public String getNamespaceURI() {
return namespaceURI;
}
/**
* Return <code>OverlayWidget</code> instance based on the given DOM element or null if there is no
* possibility to create an overlay widget with the type specified in the DOM element "type" attribute
* @return an overlay widget instance
*/
@Override
public OverlayWidget toAmendableWidget(final Element element) {
final String nodeName = overlayStrategy.getType(element);
final String namespaceURI = overlayStrategy.getNamespaceURI(element);

if ("".equals(nodeName)) {
throw new IllegalArgumentException("Empty element or null passed.");
}
// nothing found
LOG.warning("Could not find overlay element (nodename: " + nodeName + " in namespace URI '" + namespaceURI + "')");
return null;
}
}