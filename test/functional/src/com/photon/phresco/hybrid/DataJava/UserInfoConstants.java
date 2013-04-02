package com.photon.phresco.hybrid.DataJava;

import java.io.InputStream;

import java.lang.reflect.Field;

import com.photon.phresco.hybrid.test.R;
import android.content.Context;
import android.content.res.Resources;

public class UserInfoConstants {
	private ReadXMLFile readXml;

	public String EMAILID = "emailid";
	public String PASSWORD = "passWord";
	public String WRONGEMAILID="wrongemailid";
	

	public UserInfoConstants() {

	}

	public void parser(Context context) {
		try {

			Resources res = context.getResources();
			InputStream instream = res.openRawResource(R.raw.user_info_constants);
			readXml = new ReadXMLFile();
			readXml.loadUserInfoConstants(instream);
			Field[] arrayOfField1 = super.getClass().getFields();
			Field[] arrayOfField2 = arrayOfField1;
			int i = arrayOfField2.length;
			for (int j = 0; j < i; ++j) {
				Field localField = arrayOfField2[j];
				Object localObject = localField.get(this);
				if (localObject instanceof String)
					localField
							.set(this, readXml.getValue((String) localObject));

			}
		} catch (Exception localException) {
			throw new RuntimeException("Loading "
					+ super.getClass().getSimpleName() + " failed",
					localException);
		}
	}
}
