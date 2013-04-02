package com.photon.phresco.hybrid.test;
import junit.framework.TestCase;
import com.photon.phresco.hybrid.DataJava.UserInfoConstants;
import android.app.Instrumentation;
import android.util.Log;
//import com.jayway.android.robotium.solo.By;
import com.jayway.android.robotium.solo.Solo;
import com.photon.phresco.hybrid.test.TestException;
import com.photon.phresco.hybrid.DataJava.AndroidHybridDataJava;
public class MyCartChekoutTest extends TestCase {

	private Solo soloMain;
	private String activityName;
	private UserInfoConstants data;
	//private By by;
	private AndroidHybridDataJava android;
	
	private static final String TAG = "*****MyCartChekoutTest******";
	
	
	public MyCartChekoutTest(Solo solo) {
		this.soloMain = solo;

	}
@SuppressWarnings("unused")
	public void testMyCartChekoutTest(Instrumentation instrumentation)
			throws TestException {
		try{
			Log.i(TAG, "------It is testMyCartChekoutTest()-----------");
			android=new AndroidHybridDataJava();
			android.parser(instrumentation.getContext());
			data=new UserInfoConstants();
			data.parser(instrumentation.getContext());
			activityName = soloMain.getCurrentActivity().getClass().getSimpleName();
			if(activityName.equalsIgnoreCase("My Cart"))
			  {
				Log.i(TAG, "------It is MyCartChekoutTest-----------" + activityName);
				soloMain.waitForActivity("My Cart", 2000);
				for (int i = 0; i < 40; i++) 
				    {
					activityName = soloMain.getCurrentActivity()
							.getClass().getSimpleName();
					if (activityName.equalsIgnoreCase("My Cart")) {

						Log.i(TAG, "------for()-- loop-----");
						break;
					   }
				
				else {
					Log.i(TAG, "------ testMyCartChekoutTest failed-----------");
					throw new TestException("Current Activity Failed----"
							+ soloMain.getCurrentActivity().getClass()
									.getSimpleName() + "failed");
				     }
					}
				}
			   // clicking the Login mycart
			     // clicking the Login Browse
				soloMain.sleep(3000);
			    soloMain.getCurrentWebElements();
				soloMain.clickOnMenuItem("Browse");
				soloMain.clickOnMenuItem("My Cart");
				soloMain.sleep(2000);
				soloMain.clickOnMenuItem("Update Cart");
				soloMain.sleep(2000);
					        
		   }
		catch (Exception e)
		{
			e.printStackTrace();
		}
		}
	
	 }



