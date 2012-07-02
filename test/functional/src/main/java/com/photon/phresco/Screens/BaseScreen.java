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

import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.android.AndroidDriver;

import com.photon.phresco.selenium.util.Constants;
import com.photon.phresco.selenium.util.ScreenActionFailedException;
import com.photon.phresco.selenium.util.ScreenException;
import com.thoughtworks.selenium.Selenium;

public class BaseScreen {


	public static Selenium selenium;
	public static WebDriver driver;
	private static Log log = LogFactory.getLog("BaseScreen");

	public BaseScreen() {

	}
	public BaseScreen(String androidhybrid, String applicationURL,
			String applicationContext) throws ScreenActionFailedException{
		initialize(androidhybrid, applicationURL, applicationContext);
	}

	public  void initialize(String androidhybrid, String applicationURL,
			String applicationContext)
			throws com.photon.phresco.selenium.util.ScreenActionFailedException {

		try {
			instantiateBrowser(androidhybrid, applicationURL,
					applicationContext);
		} catch (ScreenException se) {
			se.printStackTrace();
		}

	}

	public  void instantiateBrowser(String androidhybrid,
			String applicationURL, String applicationContext)
			throws ScreenException {

		if (androidhybrid.equalsIgnoreCase(Constants.ANDROID_HYBRID)) {
			try {
				log.info("-------------***LAUNCHING ANDROID_HYBRID APP***--------------");
				driver = new AndroidDriver();
				driver.get(applicationURL + applicationContext);
				log.info("----------------------Waiting for page to load----------------");
				driver.manage().timeouts()
						.implicitlyWait(200, TimeUnit.SECONDS);
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
		
			throw new ScreenException(
					"------AndroidHybrid application not launched properly-----------");
		}

	}

	public void closeActivities() {
		log.info("-------------BROWSER CLOSING--------------");
		if (driver != null) {
			driver.close();
			driver.quit();

		}
	}

}
