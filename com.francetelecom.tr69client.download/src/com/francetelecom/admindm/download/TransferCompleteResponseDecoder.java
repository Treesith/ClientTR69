/*--------------------------------------------------------
 * Product Name : modus TR-069
 * Version : 1.1
 * Module Name : DownloadBundle
 *
 * Copyright © 2011 France Telecom
 *
 * This software is distributed under the Apache License, Version 2.0
 * (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 or see the "license.txt" file for
 * more details
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Author : Orange Labs R&D O.Beyler
 */
package com.francetelecom.admindm.download;
import org.kxml2.kdom.Element;

import aQute.bnd.annotation.component.Component;
import aQute.bnd.annotation.component.Reference;

import com.francetelecom.admindm.api.RPCDecoder;
import com.francetelecom.admindm.api.RPCMethod;
import com.francetelecom.admindm.download.api.IEngine;
import com.francetelecom.admindm.soap.Fault;
/**
 * The Class TransferCompleteReponseDecoder.
 */
@Component(properties="name=TransferCompleteResponse")
public final class TransferCompleteResponseDecoder implements RPCDecoder {
    /** The engine. */
    private IEngine engine;
    
    @Reference
    public void setEngine(IEngine engine) {
		this.engine = engine;
	}

    /**
     * Decode.
     * @param element the element
     * @return the RPC method
     * @throws Fault the decoder exception
     */
    public RPCMethod decode(final Element element) throws Fault {
        return new TransferCompleteResponse(engine);
    }
}
