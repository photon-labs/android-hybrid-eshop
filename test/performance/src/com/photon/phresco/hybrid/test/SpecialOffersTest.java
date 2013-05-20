package com.photon.phresco.hybrid.test;
import junit.framework.TestCase;

import com.photon.phresco.hybrid.DataJava.UserInfoConstants;
import android.app.Instrumentation;
import android.util.Log;
//import com.jayway.android.robotium.solo.By;
import com.jayway.android.robotium.solo.Solo;
import com.photon.phresco.hybrid.test.TestException;
import com.photon.phresco.hybrid.DataJava.AndroidHybridDataJava;
public class SpecialOffersTest extends TestCase {

	private Solo soloMain;
	private String activityName;
	private UserInfoConstants data;
	//private By by;
	private AndroidHybridDataJava android;
	
	private static final String TAG = "*****SpecialOffersTest******";
	
	
	public SpecialOffersTest(Solo solo) {
		this.soloMain = solo;

	}
@SuppressWarnings("unused")
	public void testSpecialOffersTest(Instrumentation instrumentation)
			throws TestException {
		try{
			Log.i(TAG, "------It is testSpecialOffersTest()-----------");
			android=new AndroidHybridDataJava();
			android.parser(instrumentation.getContext());
			data=new UserInfoConstants();
			data.parser(instrumentation.getContext());
			activityName = soloMain.getCurrentActivity().getClass().getSimpleName();
			if(activityName.equalsIgnoreCase("Special Offers"))
			  {
				Log.i(TAG, "------It is testSpecialOffersTest-----------" + activityName);
				soloMain.waitForActivity("Special Offers", 2000);
				for (int i = 0; i < 40; i++) 
				    {
					activityName = soloMain.getCurrentActivity()
							.getClass().getSimpleName();
					if (activityName.equalsIgnoreCase("Special Offers")) {

						Log.i(TAG, "------for()-- loop-----");
						break;
					   }
				
				else {
					Log.i(TAG, "------ testSpecialOffersTest failed-----------");
					throw new TestException("Current Activity Failed----"
							+ soloMain.getCurrentActivity().getClass()
									.getSimpleName() + "failed");
				     }
					}
				}
			   // clicking the Login Special Offers
			    // clicking the Login Browse
				soloMain.sleep(3000);
			    soloMain.getCurrentWebElements();
				soloMain.clickOnMenuItem("Browse");
			    soloMain.getCurrentWebElements();
				soloMain.clickOnMenuItem("Special Offers");
				soloMain.sleep(2000);
				// choosing cart to add
				soloMain.getCurrentWebElements();
				soloMain.clickOnMenuItem("BlackBerry Torch 9800 ");
				
				// add cart to list
				soloMain.getCurrentWebElements();
				soloMain.clickOnMenuItem("Add to Cart");			
				
			   
		   }
		catch (Exception e)
		{
			e.printStackTrace();
		}
		}
	
	 }


