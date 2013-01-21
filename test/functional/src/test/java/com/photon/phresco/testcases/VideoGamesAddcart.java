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
package com.photon.phresco.testcases;

import java.io.IOException;

import junit.framework.TestCase;

import org.apache.commons.logging.Log;
import org.junit.Test;
import org.openqa.jetty.log.LogFactory;

import com.photon.phresco.Screens.BrowseScreen;
import com.photon.phresco.Screens.MenuScreen;
import com.photon.phresco.Screens.VideoGamesScreen;
import com.photon.phresco.Screens.WelcomeScreen;
import com.photon.phresco.uiconstants.MobilewidgUiConstants;
import com.photon.phresco.uiconstants.PhrescoUIConstants;

public class VideoGamesAddcart extends TestCase {

	private MobilewidgUiConstants mobileUIConstantss;
	private WelcomeScreen welcomeScreen;
	private int SELENIUM_PORT;
	private String androidHybrid;
	private Log log = LogFactory.getLog(getClass());
	private String currentTestMethodName;
	private String applicationURL;
	private String applicationContext;
	public MenuScreen menuScreen;
	public PhrescoUIConstants phrescoUIConstants;

	@Override
	public void setUp() throws Exception {
		super.setUp();
		mobileUIConstantss = new MobilewidgUiConstants();
		phrescoUIConstants = new PhrescoUIConstants();
	}

	@Test
	public void testVideoGames() throws InterruptedException, IOException,
			Exception {

		try {

			log.info("--------testCompupterProducts scenario---------");
			applicationURL = phrescoUIConstants.PROTOCOL + "://"
					+ phrescoUIConstants.HOST + ":" + phrescoUIConstants.PORT
					+ "/";
			androidHybrid = "*" + mobileUIConstantss.BROWSER;
			applicationContext = phrescoUIConstants.CONTEXT;

			assertNotNull("Browser name should not be null", androidHybrid);
			assertNotNull("selenium-port number should not be null",
					SELENIUM_PORT);
			welcomeScreen = new WelcomeScreen(androidHybrid, applicationURL,
					applicationContext);
			assertNotNull(welcomeScreen);
			currentTestMethodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();
			assertNotNull("This is Current Test method name(testMP3Players)",
					currentTestMethodName);
			menuScreen = new MenuScreen(mobileUIConstantss,
					currentTestMethodName);
			BrowseScreen browsing=menuScreen.clickOnBrowseButton(currentTestMethodName);
			VideoGamesScreen videogamesScreen=browsing.gotoVideoGamesScreen(currentTestMethodName);
			videogamesScreen.testVideoGamesProducts();
			
			
		} catch (Exception t) {
			t.printStackTrace();

		}
	}

	@Override
	public void tearDown() {
		welcomeScreen.closeActivities();
	}

}