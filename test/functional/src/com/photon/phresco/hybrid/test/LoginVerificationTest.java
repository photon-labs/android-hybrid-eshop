package com.photon.phresco.hybrid.test;
import junit.framework.TestCase;
import com.photon.phresco.hybrid.DataJava.UserInfoConstants;
import android.app.Instrumentation;
import android.util.Log;
import com.jayway.android.robotium.solo.By;
import com.jayway.android.robotium.solo.Solo;
import com.photon.phresco.hybrid.test.TestException;
//import com.photon.phresco.hybrid.DataJava.AndroidHybridDataJava;
public class LoginVerificationTest extends TestCase {

	private Solo soloMain;
	private String activityName;
	private UserInfoConstants data;
	//private By by;
	//private AndroidHybridDataJava android;
	
	private static final String TAG = "*****LoginVerificationTest******";
	
	
	public LoginVerificationTest(Solo solo) {
		this.soloMain = solo;

	}
	
/*	public  void  clickOnScreen(String name) throws TestException
	{   
		soloMain.getCurrentWebElements();
		soloMain.sleep(2000);
		soloMain.clickOnMenuItem(name);
	}
   
	public void Sendkeys(String value) throws TestException
	{
		soloMain.sleep(2000);
		By by;
		soloMain.typeTextInWebElement(by, value);
	}*/
	
	@SuppressWarnings("unused")
	public void testLoginVerification(Instrumentation instrumentation)
			throws TestException {
		try{
			Log.i(TAG, "------It is testLoginVerification()-----------");
			//android=new AndroidHybridDataJava();
			//android.parser(instrumentation.getContext());
			data=new UserInfoConstants();
			data.parser(instrumentation.getContext());
			activityName = soloMain.getCurrentActivity().getClass().getSimpleName();
			if(activityName.equalsIgnoreCase("Login"))
			  {
				Log.i(TAG, "------It is LoginVerifcation-----------" + activityName);
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
					Log.i(TAG, "------ testLoginVerification failed-----------");
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
				// Click The EditTextFied which are in Webview format
				By Logmail1 =By.id("logEmail");
				// Clears the Text fields
		        soloMain.clearTextInWebElement(Logmail1) ;
		        // pass the values in edit TextFields
		        soloMain.typeTextInWebElement(Logmail1, data.EMAILID); 
		        // wait for 2 seconds
		        soloMain.sleep(2000);
		        // get the current WebViewElements
		        soloMain.getCurrentWebElements();
		        By pass1=By.id("logpassword");
		        soloMain.clearTextInWebElement(pass1) ;
		        soloMain.typeTextInWebElement(pass1, data.PASSWORD); 
				 soloMain.sleep(2000);
		        soloMain.clickOnMenuItem("Submit");
		        
		        soloMain.sleep(2000);
		        //soloMain.sendKey(Solo.MENU);
		       // soloMain.clickOnRadioButton(0);		        
		   }
		catch (Exception e)
		{
			e.printStackTrace();
		}
		}
	
	 }


