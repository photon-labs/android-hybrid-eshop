/*
 * ###
 * PHR_HTML5MobileWidget
 * %%
 * Copyright (C) 1999 - 2012 Photon Infotech Inc.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ###
 */
package com.photon.phresco.uiconstants;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.lang.NullArgumentException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.photon.phresco.selenium.util.ScreenException;

public class ReadXMLFile {

	private  static Element eElement;
	private Log log = LogFactory.getLog(getClass());
	private static final String phrscoEnvironments = "./src/main/resources/phresco-env-config.Xml";
	private static final String mobilewidgetConstants = "./src/main/resources/mobilewidget-config.Xml";

	public ReadXMLFile() throws ScreenException {
		
	}

	public void loadPhrescoConstansts(String properties) throws ScreenException {

		try {
			File fXmlFile = new File(properties);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			NodeList nList = doc.getElementsByTagName("environment");
			log.info("-----------"+nList.getLength());
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					eElement = (Element) nNode;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void loadPhrescoUIConstants() throws ScreenException{
		loadPhrescoConstansts(phrscoEnvironments);
	}
	public void loadMobileUIConstants() throws ScreenException{
		loadPhrescoConstansts(mobilewidgetConstants);
	}
	public String getValue(String elementName) {
		NodeList nlList = eElement.getElementsByTagName(elementName).item(0)
				.getChildNodes();
		Node ElementValue = (Node) nlList.item(0);		
		if (ElementValue.getNodeValue() == null) {
			throw new NullArgumentException(
					"------ Null Element passed-------");
		}
		return ElementValue.getNodeValue();
	}

}