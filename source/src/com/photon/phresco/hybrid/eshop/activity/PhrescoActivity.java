/*
 * ###
 * PHR_AndroidNative
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
/*
 * Classname: PhrescoActivity
 * Version information: 1.0
 * Date: Nov 24, 2011
 * Copyright notice:
 */
package com.photon.phresco.hybrid.eshop.activity;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.cordova.DroidGap;
import org.json.JSONException;
import org.json.JSONObject;
import org.xml.sax.SAXException;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Bundle;

import com.photon.phresco.hybrid.R;
import com.photon.phresco.hybrid.eshop.config.ConfigReader;
import com.photon.phresco.hybrid.eshop.config.Configuration;
import com.photon.phresco.hybrid.eshop.core.Constants;
import com.photon.phresco.hybrid.eshop.logger.PhrescoLogger;


/**
 * Parent class which extends Activity class, for all the activities in
 * application
 * 
 * @author viral_b
 * 
 */
public class PhrescoActivity extends DroidGap {

	private static final String TAG = "PhrescoActivity  *********** ";
		
	
	private static final String SERVER_CONFIG_NAME = "Native_Server";
	private static final String SERVER = "Server";
	/*private static final String WEBSERVICE_CONFIG_NAME = "Native_Eshop";
	private static final String WEB_SERVICE = "WebService";*/

	private String protocol = "protocol";
	private String host = "host";
	private String port = "port";
	private String context = "context";
	private String additionalContext = "additional_context";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	/**
	 * Read phresco-env-config.xml file to get to connect to web service
	 */
	public void readConfigXML() {
		try {

			Resources resources = getResources();
			AssetManager assetManager = resources.getAssets();

			// Read from the /assets directory
			InputStream inputStream = assetManager
					.open(Constants.PHRESCO_ENV_CONFIG);

			ConfigReader confReaderObj = new ConfigReader(inputStream);

			PhrescoLogger.info(TAG + "Default ENV = " + confReaderObj.getDefaultEnvName());

			List<Configuration> configByEnv = confReaderObj.getConfigByEnv(confReaderObj.getDefaultEnvName());

			for (Configuration configuration : configByEnv) {
				String envName = configuration.getEnvName();
				String envType = configuration.getType();
				PhrescoLogger.info(TAG + "envName = " + envName	+ " ----- envType = " + envType);
//				properties = configuration.getProperties();

				if (envType.equalsIgnoreCase("webservice")) {
					/*String configJsonString = confReaderObj.getConfigAsJSON(envName, WEB_SERVICE, WEBSERVICE_CONFIG_NAME);
					getWebServiceURL(configJsonString);*/
				} else if (envType.equalsIgnoreCase("server")) {					
					String configJsonString = confReaderObj.getConfigAsJSON(envName, SERVER, SERVER_CONFIG_NAME);
					getServerURL(configJsonString);
				}

			}

		} catch (ParserConfigurationException ex) {
			PhrescoLogger.info(TAG
					+ "readConfigXML : ParserConfigurationException: "
					+ ex.toString());
			PhrescoLogger.warning(ex);
		} catch (SAXException ex) {
			PhrescoLogger.info(TAG + "readConfigXML : SAXException: "
					+ ex.toString());
			PhrescoLogger.warning(ex);
		} catch (IOException ex) {
			PhrescoLogger.info(TAG + "readConfigXML : IOException: "
					+ ex.toString());
			PhrescoLogger.warning(ex);
		} catch (Exception ex) {
			PhrescoLogger.info(TAG + "readConfigXML : Exception: "
					+ ex.toString());
			PhrescoLogger.warning(ex);
		}
	}

	/*private void getWebServiceURL(String configJsonString) {
		try {
			JSONObject jsonObject = new JSONObject(configJsonString);
			String webServiceProtocol = jsonObject.getString(protocol).endsWith("://") ? jsonObject.getString(protocol) : jsonObject.getString(protocol) + "://"; // http://

			String webServiceHost = jsonObject.getString(port).equalsIgnoreCase("") 
					? (jsonObject.getString(host).endsWith("/") 
								? jsonObject.getString(host): jsonObject.getString(host) + "/")	
					: jsonObject.getString(host); // localhost/
													// localhost

			String webServicePort = jsonObject.getString(port).equalsIgnoreCase("") 
					? "" : (jsonObject.getString(port).startsWith(":") 
								? jsonObject.getString(port) : ":" + jsonObject.getString(port)); // ""
																						// (blank)
																						// :1313

			String webServiceContext = jsonObject.getString(context).startsWith("/") 
					? jsonObject.getString(context) : "/"	+ jsonObject.getString(context); // /phresco

			Constants.setWebContextURL(webServiceProtocol + webServiceHost
					+ webServicePort + webServiceContext + "/");
			Constants.setRestAPI(Constants.REST_API);
			PhrescoLogger.info(TAG + "getWebServiceURL() - Constants.webContextURL : "
					+ Constants.getWebContextURL() + Constants.getRestAPI());
		} catch (JSONException e) {
			PhrescoLogger.info(TAG + " EnvConstuctor -  Exception " + e.toString());
			PhrescoLogger.warning(e);
		}
	}*/
	
	/*
	 * Don't Remove this method
	 */
	protected void getServerURL(String configJsonString) {
		try {
			JSONObject jsonObject = new JSONObject(configJsonString);
			String webServiceProtocol = jsonObject.getString(protocol).endsWith(
					"://") ? jsonObject.getString(protocol) : jsonObject.getString(protocol) + "://"; // http://

			String webServiceHost = jsonObject.getString(port).equalsIgnoreCase(
					"") ? (jsonObject.getString(host).endsWith("/") ? jsonObject.getString(host) : jsonObject.getString(host) + "/")
					: jsonObject.getString(host); // localhost/
													// localhost

			String webServicePort = jsonObject.getString(port).equalsIgnoreCase(
					"") ? ""
					: (jsonObject.getString(port).startsWith(":") ? jsonObject.getString(port) : ":" + jsonObject.getString(port)); // ""
																						// (blank)
																						// :1313

			String webServiceContext = jsonObject.getString(context).startsWith(
					"/") ? jsonObject.getString(context) : "/"
					+ jsonObject.getString(context); // /phresco

			String webServiceAdditionalContext = null;
			
			try {
				webServiceAdditionalContext = jsonObject.getString(
						additionalContext).startsWith("/") ? jsonObject.getString(additionalContext) : "/"
						+ jsonObject.getString(additionalContext);
			} catch (Exception e) {
				webServiceAdditionalContext = null;
			}

			if (webServiceAdditionalContext != null
					&& webServiceAdditionalContext.length() > 1) {// > 1 beacuse of
																	// "/"
				Constants.setWebContextURL(webServiceProtocol + webServiceHost
						+ webServicePort + webServiceContext
						+ webServiceAdditionalContext + "&userAgent=android");
			} else {
				Constants.setWebContextURL(webServiceProtocol + webServiceHost
								+ webServicePort + webServiceContext
								+ "?userAgent=android");
			}

			PhrescoLogger.info(TAG + "getServerURL() - Constants.webContextURL : " + Constants.getWebContextURL());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			PhrescoLogger.info(TAG + " EnvConstuctor -  Exception " + e.toString());
			PhrescoLogger.warning(e);
		}
	}
	
	/**
	 * Show the error message dialog box with OK button
	 * 
	 * @param errorMessage
	 */
	public void showErrorDialog(String errorMessage) {
		try {
			AlertDialog.Builder builder = new AlertDialog.Builder(this);
			builder.setMessage(errorMessage)
					.setTitle(R.string.app_name)
					.setCancelable(false)
					.setPositiveButton("OK",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,
										int id) {
									finish();
									// System.runFinalizersOnExit(true);
									android.os.Process
											.killProcess(android.os.Process
													.myPid());
								}
							});
			@SuppressWarnings("unused")
			AlertDialog alert = builder.show();
		} catch (Exception ex) {
			PhrescoLogger.info(TAG + "showErrorDialog: " + ex.toString());
			PhrescoLogger.warning(ex);
		}
	}
}