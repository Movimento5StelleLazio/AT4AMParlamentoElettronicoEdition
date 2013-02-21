/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or – as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen;

import com.google.gwt.core.client.GWT;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.DefaultOverlayLocalizableResource;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;

/**
 * Note: this file is generated. Rather than changing this file, correct the template called <tt>overlayLocalizableResource.ftl</tt>.
 */
public class NamespaceOverlayLocalizableResource extends DefaultOverlayLocalizableResource {
    private static NamespaceOverlayMessages MESSAGES = GWT.create(NamespaceOverlayMessages.class);

    @Override
    public String getName(final OverlayWidget widget) {
        if (widget == null) {
            throw new IllegalArgumentException("Null widget passed.");
        } else {
            return widget.getType();
        }
    }

    @Override
    public String getDescription(final OverlayWidget widget) {
        if (widget == null) {
            throw new IllegalArgumentException("Null widget passed.");
        } else {
            return widget.getType();
        }
    }

}