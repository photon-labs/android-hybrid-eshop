package com.photon.phresco.hybrid.DataJava;
import java.io.InputStream;
import java.lang.reflect.Field;
import com.photon.phresco.hybrid.test.R;


import android.content.Context;
import android.content.res.Resources;




public class AndroidHybridDataJava {
	private ReadXMLFile readXml;

	
	public String TEXT="text";
	public String FIRSTNAME="firstname";
	public String LASTNAME="lastname";
	public String EMAILID="emailid";
	public String PASSWORD="password";
	public String PHONE="phone";
	public String COMPANY="company";
	public String ADDRESS1="address1";
	public String ADDRESS2="address2";
	public String CITY="city";
	public String STATE="state";
	public String COUNTRY="country";
	public String POSTCODE="postcode";
	public String PHONENUMBER="phonenumber";
	public String COMMENTS="comments";
	
	public AndroidHybridDataJava() {
		
	}
    public void parser(Context context)
    {
    	try {
    		
    	    Resources res = context.getResources(); 
    	    InputStream inputStream = res.openRawResource(R.raw.android_hybrid_data);
    	
			readXml = new ReadXMLFile();
			readXml.loadUserInfoConstants(inputStream);
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
