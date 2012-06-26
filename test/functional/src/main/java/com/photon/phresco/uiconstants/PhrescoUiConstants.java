package com.photon.phresco.uiconstants;

import java.lang.reflect.Field;

public class PhrescoUiConstants {
  
	public String PROTOCOL ="server.protocol";
	public String SERVER_PORT = "server.port";
	public String CONTEXT = "server.context";
	public String HOST = "server.host";
	public String REGISTER ="PHOTON_PHRESCO_REGISTER_ICON";
	public String FIRSTNAME = "PHOTON_PHRESCO_REGISTER_FIRSTNAME";
	public String LASTNAME = "PHOTON_PHRESCO_REGISTER_LASTNAME";
	public String EMAIL_ID = "PHOTON_PHRESCO_REGISTER_EMAIL_ID";
	public String PASSWORD = "PHOTON_PHRESCO_REGISTER_PASSWORD";
	public String PHONENO = "PHOTON_PHRESCO_REGISTER_PHONENO";
	public String FIRSTNAME_VALUE = "PHOTON_PHRESCO_REGISTER_FIRSTNAME_VALUE";
	public String LASTNAME_VALUE = "PHOTON_PHRESCO_REGISTER_LASTNAME_VALUE";
	public String EMAIL_ID_VALUE = "PHOTON_PHRESCO_REGISTER_EMAIL_ID_VALUE";
	public String PASSWORD_VALUE = "PHOTON_PHRESCO_REGISTER_PASSWORD_VALUE";
	public String PHONENO_VALUE = "PHOTON_PHRESCO_REGISTER_PHONENO_VALUE";
	public String REGISTER_BUTTON ="PHOTON_PHRESCO_REGISTER_BUTTON";
	public String BROWSE ="PHOTON_PHRESCO_BROWSE_ICON";
	public String BROWSE_TV ="PHOTON_PHRESCO_BROWSE_ICON_TV";
	public String BROWSE_COMP ="PHOTON_PHRESCO_BROWSE_ICON_COMP";
	public String BROWSE_MOBILE ="PHOTON_PHRESCO_BROWSE_ICON_MOBILE";
	public String BROWSE_AUDIO ="PHOTON_PHRESCO_BROWSE_ICON_AUDIO";
	public String BROWSE_CAMERA="PHOTON_PHRESCO_BROWSE_ICON_CAMERA";
	public String BROWSE_ACCESSORIES ="PHOTON_PHRESCO_BROWSE_ICON_ACCESSORIES";
	public String BROWSE_GAMES ="PHOTON_PHRESCO_BROWSE_ICON_GAMES";
	public String BROWSE_MOVIES ="PHOTON_PHRESCO_BROWSE_ICON_MOVIES";
	public String BROWSE_TABLET ="PHOTON_PHRESCO_BROWSE_ICON_TABLET";
	public String BROWSE_MP3 ="PHOTON_PHRESCO_BROWSE_ICON_MP3";
	public String PRODUCT1 = "PHOTON_PHRESCO_BROWSE_ICON_CATEGORIES_PRODUCT1";
	public String ADDTOCART = "PHOTON_PHRESCO_BROWSE_ICON_CATEGORIES_PRODUCT1_ADDTOCART";
	public String CHECKOUT = "PHOTON_PHRESCO_BROWSE_ICON_CATEGORIES_PRODUCT1_CHECKOUT";
	
	private static PhrescoUiConstants instance;

	public static PhrescoUiConstants getInstance() {
		if (instance == null)
			instance = new PhrescoUiConstants();
		return instance;
	}

	public PhrescoUiConstants() {
		try {
			TestProperties localTestProperties = new TestProperties();
			localTestProperties.loadPhrescoConfigProperties();
			Field[] arrayOfField1 = super.getClass().getFields();
			Field[] arrayOfField2 = arrayOfField1;
			int i = arrayOfField2.length;
			for (int j = 0; j < i; ++j) {
				Field localField = arrayOfField2[j];
				Object localObject = localField.get(this);
				if (localObject instanceof String)
					localField.set(this,
							localTestProperties.getValue((String) localObject));
			}
		} catch (Exception localException) {
			throw new RuntimeException("Loading "
					+ super.getClass().getSimpleName() + " failed",
					localException);
		}
	}
}
	

