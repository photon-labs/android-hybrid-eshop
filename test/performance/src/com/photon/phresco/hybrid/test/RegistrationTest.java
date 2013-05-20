package com.photon.phresco.hybrid.test;
import junit.framework.TestCase;
import android.app.Instrumentation;
import android.util.Log;
import com.jayway.android.robotium.solo.By;
import com.jayway.android.robotium.solo.Solo;
import com.photon.phresco.hybrid.DataJava.AndroidHybridDataJava;
import com.photon.phresco.hybrid.test.TestException;
public class RegistrationTest extends TestCase {

	private Solo soloMain;
	private String activityName;
	private AndroidHybridDataJava android;
	private static final String TAG = "*****RegistrationTest******";
	
	
	public RegistrationTest(Solo solo) {
		this.soloMain = solo;

	}

	@SuppressWarnings("unused")
	public void testRegistration(Instrumentation instrumentation)
			throws TestException {
		try{
			Log.i(TAG, "------It is testRegistration()-----------");
			android=new AndroidHybridDataJava();
			android.parser(instrumentation.getContext());
			activityName = soloMain.getCurrentActivity().getClass().getSimpleName();
			if(activityName.equalsIgnoreCase("Login"))
			  {
				Log.i(TAG, "------It is testRegistration-----------" + activityName);
				soloMain.waitForActivity("Register", 2000);
				for (int i = 0; i < 40; i++) 
				    {
					activityName = soloMain.getCurrentActivity()
							.getClass().getSimpleName();
					if (activityName.equalsIgnoreCase("Register")) {

						Log.i(TAG, "------for()-- loop-----");
						break;
					   }
				
				else {
					Log.i(TAG, "------ testRegistration failed-----------");
					throw new TestException("Current Activity Failed----"
							+ soloMain.getCurrentActivity().getClass()
									.getSimpleName() + "failed");
				     }
					}
				}
			// Get the current WebViewElements
			soloMain.getCurrentWebElements();
			// clicking the Browse Button
	        soloMain.clickOnMenuItem("Register");
	        //Wait for 2 seconds
	        soloMain.sleep(2000);
	        // Edit text  based on its ids
	        By FirstName = By.id("regfirstname");
	        //passing the values in Webviews EditText
	        soloMain.typeTextInWebElement(FirstName, android.FIRSTNAME );
	        soloMain.sleep(2000);
	        soloMain.getCurrentWebElements();
	        By LastName =By.id("reglastname");
	        soloMain.typeTextInWebElement(LastName, android.LASTNAME);
	        soloMain.getCurrentWebElements();
	        By EmailId =By.id("regemail");
	        soloMain.typeTextInWebElement(EmailId, android.EMAILID);
	        soloMain.getCurrentWebElements();
	        By password =By.id("regpassword");
	        soloMain.typeTextInWebElement(password, android.PASSWORD);
	        soloMain.getCurrentWebElements();
	        By Phonenumber =By.id("regphonenumber");
	        soloMain.typeTextInWebElement(Phonenumber, android.PHONE);
	        soloMain.getCurrentWebElements();
	       // soloMain.clickOnMenuItem("Register");
		   }
		catch (Exception e)
		{
			e.printStackTrace();
		}
		}
	
	 }


