package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import java.util.ArrayList;

/**
* This file is generated.
*/
public enum ScopeModsSimpleType {

// FIELDS ------------------

    EXCEPTIONOFSCOPE("exceptionOfScope"),
    EXTENSIONOFSCOPE("extensionOfScope")
;
    private final String value;

    ScopeModsSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScopeModsSimpleType fromString(String text) {
        if (text == null) return null;
        for (ScopeModsSimpleType en : ScopeModsSimpleType.values()) {
            if(text.equalsIgnoreCase(en.value())) {
                return en;
            }
        }
        return null;
    }
}