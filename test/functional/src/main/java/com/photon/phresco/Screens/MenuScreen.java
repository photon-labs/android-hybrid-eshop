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
package com.photon.phresco.Screens;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.photon.phresco.uiconstants.MobilewidgUiConstants;

public class MenuScreen extends WebDriverAbstractBaseScreen {
	private MobilewidgUiConstants mobilewidgUiConstants;
	private Log log = LogFactory.getLog(getClass());
	public WebDriverBaseScreen element;

	public MenuScreen(MobilewidgUiConstants mobilewidgUiConstants,
			String currentTestMethodName) throws Exception {
		this.mobilewidgUiConstants = mobilewidgUiConstants;
		log.info("---------------MenuScreen Constructor------------");
		waitForElementPresent(mobilewidgUiConstants.BROWSE,
				currentTestMethodName);
	}

	public BrowseScreen clickOnBrowseButton(String currentTestMethodName)
			throws IOException, Exception {
		waitForElementPresent(mobilewidgUiConstants.BROWSE,
				currentTestMethodName);
		element = getXpathWebElement(mobilewidgUiConstants.BROWSE);
		element.click();
		return new BrowseScreen(mobilewidgUiConstants);
		
	}

	public void clickOnRegisterButton() {

	}

	public void clickOnLoginButton() {

	}
}
