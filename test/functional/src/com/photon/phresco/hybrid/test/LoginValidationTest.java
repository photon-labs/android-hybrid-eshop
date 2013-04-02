package com.photon.phresco.hybrid.test;
import junit.framework.TestCase;
import android.app.Instrumentation;
import android.util.Log;
import com.jayway.android.robotium.solo.By;
import com.jayway.android.robotium.solo.Solo;
import com.photon.phresco.hybrid.test.TestException;
import com.photon.phresco.hybrid.DataJava.UserInfoConstants;
import com.photon.phresco.hybrid.DataJava.AndroidHybridDataJava;
public class LoginValidationTest extends TestCase {

	private Solo soloMain;
	private String activityName;
	private UserInfoConstants data;
	private AndroidHybridDataJava android;
	private static final String TAG = "*****LoginValidationTestCase******";
	
	
	public LoginValidationTest(Solo solo) {
		this.soloMain = solo;

	}

	@SuppressWarnings("unused")
	public void testLoginValidation(Instrumentation instrumentation)
			throws TestException {
		try{
			Log.i(TAG, "------It is testLoginValidation()-----------");
			android=new AndroidHybridDataJava();
			android.parser(instrumentation.getContext());
			data=new UserInfoConstants();
			data.parser(instrumentation.getContext());
			activityName = soloMain.getCurrentActivity().getClass().getSimpleName();
			if(activityName.equalsIgnoreCase("Login"))
			  {
				Log.i(TAG, "------It is Login-----------" + activityName);
				soloMain.waitForActivity("Login", 2000);
				for (int i = 0; i < 40; i++) 
				    {
					activityName = soloMain.getCurrentActivity()
							.getClass().getSimpleName();
					if (activityName.equalsIgnoreCase("Login")) {

						Log.i(TAG, "------for()-- loop-----");
						break;
					   }
				
				else {
					Log.i(TAG, "------ testLoginValidation failed-----------");
					throw new TestException("Current Activity Failed----"
							+ soloMain.getCurrentActivity().getClass()
									.getSimpleName() + "failed");
				     }
					}
				}
			   // clicking the Login Button
			    soloMain.sleep(3000);
				soloMain.getCurrentWebElements();
				
				soloMain.clickOnMenuItem("Login");
		        soloMain.sleep(2000);
		        // Edit text  based on its ids
		        By Logmail =By.id("logEmail");
		        //passing the values in Webviews EditText
		        soloMain.typeTextInWebElement(Logmail, data.WRONGEMAILID); 
		        // Get the current WebViewElements
		        soloMain.getCurrentWebElements();
		        By pass =By.id("logpassword");
		        soloMain.typeTextInWebElement(pass, data.PASSWORD); 
		        soloMain.clickOnMenuItem("Submit");
		        // Verifying the Text is present or not
		        boolean expected=true;
		        boolean actual=soloMain.waitForText(android.TEXT);
		        assertEquals(android.TEXT, expected, actual); 
		        // Takes ScreenShorts
		        soloMain.takeScreenshot();
		        //Wait for 2 seconds
		        soloMain.sleep(2000);
		    
		   }
		catch (Exception e)
		{
			e.printStackTrace();
		}
		}
	
	 }


