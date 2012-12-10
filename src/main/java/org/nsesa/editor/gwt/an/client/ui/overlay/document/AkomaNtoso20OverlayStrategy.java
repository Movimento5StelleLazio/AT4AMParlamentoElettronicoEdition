package org.nsesa.editor.gwt.an.client.ui.overlay.document;

import com.google.gwt.dom.client.Element;
import org.nsesa.editor.gwt.core.client.ui.overlay.Format;
import org.nsesa.editor.gwt.core.client.ui.overlay.NumberingType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayStrategy;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayStrategySupport;

import java.util.Arrays;
import java.util.List;

/**
 * Date: 03/07/12 22:54
 *
 * @author <a href="philip.luppens@gmail.com">Philip Luppens</a>
 * @version $Id$
 */
public class AkomaNtoso20OverlayStrategy implements OverlayStrategy {

    private OverlayStrategySupport overlayStrategySupport = new OverlayStrategySupport();

    public AkomaNtoso20OverlayStrategy() {
        //overlayStrategySupport.asProperties(Num.class, P.class, B.class, I.class, Span.class, Content.class);
    }

    @Override
    public String getSource(Element element) {
        return overlayStrategySupport.getSource(element);
    }

    @Override
    public String getID(Element element) {
        return overlayStrategySupport.getID(element);
    }

    @Override
    public Boolean isAmendable(Element element) {
        if (!Arrays.asList("num", "p", "b", "i", "span", "content").contains(element.getAttribute("type").toLowerCase()))
            return overlayStrategySupport.isAmendable(element);
        return false;
    }

    @Override
    public Boolean isImmutable(Element element) {
        return overlayStrategySupport.isImmutable(element);
    }

    @Override
    public String getType(Element element) {
        return overlayStrategySupport.getType(element);
    }

    @Override
    public String getNamespaceURI(Element element) {
        return overlayStrategySupport.getNamespaceURI(element);
    }

    @Override
    public String getIndex(Element element) {
        return overlayStrategySupport.getLiteralIndex(element);
    }

    @Override
    public NumberingType getNumberingType(Element element, int index) {
        return overlayStrategySupport.getNumberingType(element, index);
    }

    @Override
    public Format getFormat(Element element) {
        return overlayStrategySupport.getFormat(element);
    }

    @Override
    public String getInnerHTML(Element element) {
        return overlayStrategySupport.getInnerHTML(element);
    }

    @Override
    public Element[] getChildren(Element element) {
        final List<Element> children = overlayStrategySupport.getChildren(element);
        return children.toArray(new Element[children.size()]);
    }

    @Override
    public String getFormattedIndex(Element element) {
        return overlayStrategySupport.getLiteralIndex(element);
    }

    @Override
    public String getUnFormattedIndex(Element element) {
        return overlayStrategySupport.getUnformattedIndex(element);
    }
}
