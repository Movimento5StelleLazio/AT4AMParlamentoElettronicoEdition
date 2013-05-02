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
package org.nsesa.editor.gwt.an.amendments.server.service;

import java.io.OutputStream;

/**
 *  Export the object into the given output stream
 *
 * @author <a href="stelian.groza@gmail.com">Stelian Groza</a>
 *         Date: 30/04/13 11:21
 */
public interface ExportService<T> {
    /**
     * Export the object into the given output stream
     * @param object
     * @param outputStream
     */
    void export(T object, OutputStream outputStream);

    /**
     * Returns the content type of the export operation
     * @return As String
     */
    String getContentType();

    /**
     * Return the length of the export
     * @return as int
     */
    int getLength();
    /**
     * Returns the result name after the export operation
     * @return As String
     */
    String getName();
}
