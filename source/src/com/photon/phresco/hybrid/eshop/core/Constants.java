
/*
 * Classname: Constants
 * Version information: 1.0
 * Date: Nov 24, 2011
 * Copyright notice:
 */
package com.photon.phresco.hybrid.eshop.core;


/**
 * Constants that will be used through out the device application
 * @author viral_b
 *
 */
public class Constants {
	// Constant variables

	protected Constants() {}

	public static final String APP_FOLDER_PATH = "/sdcard/phonegap/";
	public static final String LOG_FOLDER_PATH = Constants.APP_FOLDER_PATH + "log/";
	public static final String LOG_FILE = "PhoneGap.log";
	public static final String PHRESCO_ENV_CONFIG = "phresco-env-config.xml";

	private static String webContextURL = "";
	private static String homeURL = "";

	/**
	 * @return the webContextURL
	 */
	public static String getWebContextURL() {
		return webContextURL;
	}
	/**
	 * @param webContextURL the webContextURL to set
	 */
	public static void setWebContextURL(String webContextURL) {
		Constants.webContextURL = webContextURL;
	}
	/**
	 * @return the homeURL
	 */
	public static String getHomeURL() {
		return homeURL;
	}
	/**
	 * @param homeURL the homeURL to set
	 */
	public static void setHomeURL(String homeURL) {
		Constants.homeURL = homeURL;
	}
}