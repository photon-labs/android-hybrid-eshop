/*
 * ###
 * PHR_AndroidHybrid
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
package com.photon.phresco.hybrid.eshop.activity;

import android.os.Bundle;

import com.photon.phresco.hybrid.eshop.core.Constants;
import com.photon.phresco.hybrid.eshop.logger.PhrescoLogger;
import com.photon.phresco.hybrid.eshop.net.NetworkManager;
import com.photon.phresco.hybrid.eshop.util.Utility;

public class MainActivity extends PhrescoActivity {

	private static final String TAG = "HomeActivity ******* ";

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		try {
			super.onCreate(savedInstanceState);
			setIntegerProperty("loadUrlTimeoutValue", 5 * 60 * 1000);
			initApplicationEnvironment();
			//buildEnvData();
			readConfigXML();
			PhrescoLogger.info(TAG + " onCreate()");
			if (!NetworkManager.checkNetworkConnectivity(this)) {
				NetworkManager.showNetworkConectivityAlert(this);
				return;
			} else if (!NetworkManager.checkURLStatus(Constants
					.getWebContextURL() + Constants.getHomeURL())) {
				NetworkManager.showServiceAlert(this);
				return;
			}
			// super.clearCache();
			super.loadUrl(Constants.getWebContextURL() + Constants.getHomeURL());
		} catch (Exception ex) {
			PhrescoLogger.info(TAG + " onCreate -  Exception " + ex);
			PhrescoLogger.warning(ex);
		}

	}

	/**
	 * Create the required folder structures on external storage Read the device
	 * information
	 */
	private void initApplicationEnvironment() {

		try {
			// Delete existing log file, when application starts, so the log
			// file doesn't consume more place on external device
			Utility.deleteLogFile();

			// Create all the directories required for this application
			Utility.createRequiredDirectory();

			// Get the device information
			Utility.getDeviceInfo();

		} catch (Exception ex) {
			PhrescoLogger.info(TAG
					+ " initApplicationEnvironment -  Exception "
					+ ex.toString());
			PhrescoLogger.warning(ex);
		}
	}
	
	
}