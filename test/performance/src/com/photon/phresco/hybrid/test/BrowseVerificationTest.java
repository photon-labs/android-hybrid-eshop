package com.photon.phresco.hybrid.test;
import junit.framework.TestCase;
import com.photon.phresco.hybrid.DataJava.UserInfoConstants;
import android.app.Instrumentation;
import android.util.Log;
import com.jayway.android.robotium.solo.By;
import com.jayway.android.robotium.solo.Solo;
import com.photon.phresco.hybrid.test.TestException;
import com.jayway.android.robotium.solo.WebElement;
import com.photon.phresco.hybrid.DataJava.AndroidHybridDataJava;
public class BrowseVerificationTest extends TestCase {

	private Solo soloMain;
	private String activityName;
	private UserInfoConstants data;
	//private By by;
	private AndroidHybridDataJava android;
	
	private static final String TAG = "*****BrowseVerificationTest******";
	
	
	public BrowseVerificationTest(Solo solo) {
		this.soloMain = solo;

	}
@SuppressWarnings("unused")
	public void testBrowseVerification(Instrumentation instrumentation)
			throws TestException {
		try{
			Log.i(TAG, "------It is testBrowseVerificationTest()-----------");
			android=new AndroidHybridDataJava();
			android.parser(instrumentation.getContext());
			data=new UserInfoConstants();
			data.parser(instrumentation.getContext());
			activityName = soloMain.getCurrentActivity().getClass().getSimpleName();
			if(activityName.equalsIgnoreCase("Browse"))
			  {
				Log.i(TAG, "------It is testBrowseVerificationTest-----------" + activityName);
				soloMain.waitForActivity("Browse", 2000);
				for (int i = 0; i < 40; i++) 
				    {
					activityName = soloMain.getCurrentActivity()
							.getClass().getSimpleName();
					if (activityName.equalsIgnoreCase("Browse")) {

						Log.i(TAG, "------for()-- loop-----");
						break;
					   }
				
				else {
					Log.i(TAG, "------ testBrowseVerificationTest failed-----------");
					throw new TestException("Current Activity Failed----"
							+ soloMain.getCurrentActivity().getClass()
									.getSimpleName() + "failed");
				     }
					}
				}
			   // clicking the Login Browse
				soloMain.sleep(3000);
			    soloMain.getCurrentWebElements();
				soloMain.clickOnMenuItem("Browse");
				soloMain.sleep(3000);
				
				soloMain.getCurrentWebElements();
				soloMain.clickOnMenuItem("Television");
			
				soloMain.getCurrentWebElements();
			
				soloMain.clickOnMenuItem("LG Electronics 42PW350 3D Plasma HDTV");
				soloMain.sleep(2000);
				
				
				soloMain.getCurrentWebElements();
				By email=By.id("email");
			    soloMain.clearTextInWebElement(email) ;
			    soloMain.typeTextInWebElement(email, data.EMAILID); 
			    
			    soloMain.getCurrentWebElements();
				soloMain.clickOnText("Delivery Information");
				By Firstname=By.id("deliveryfirstname");
			    soloMain.clearTextInWebElement(Firstname) ;
			    soloMain.typeTextInWebElement(Firstname, android.FIRSTNAME);
			    
			    soloMain.getCurrentWebElements();
			    By LastName=By.id("deliverylastname");
			    soloMain.clearTextInWebElement(LastName) ;
			    soloMain.typeTextInWebElement(LastName, android.LASTNAME);
			    
			    soloMain.getCurrentWebElements();
			    By CompanyName=By.id("deliverycompany");
			    soloMain.clearTextInWebElement(CompanyName) ;
			    soloMain.typeTextInWebElement(CompanyName, android.LASTNAME);
			    
			    soloMain.getCurrentWebElements();
			    By address1=By.id("deliveryaddress1");
			    soloMain.clearTextInWebElement(address1) ;
			    soloMain.typeTextInWebElement(address1, android.ADDRESS1);
			    
			    soloMain.getCurrentWebElements();
			    By address2=By.id("deliveryaddress2");
			    soloMain.clearTextInWebElement(address2) ;
			    soloMain.typeTextInWebElement(address2, android.ADDRESS2);
			    
			    soloMain.getCurrentWebElements();
			    By city=By.id("deliverycity");
			    soloMain.clearTextInWebElement(city) ;
			    soloMain.typeTextInWebElement(city, android.CITY);
			    
			    soloMain.getCurrentWebElements();
			    By state=By.id("deliverystate");
			    soloMain.clearTextInWebElement(state) ;
			    soloMain.typeTextInWebElement(state, android.STATE);
			    
			    soloMain.getCurrentWebElements();
			    By postcode=By.id("deliverypostcode");
			    soloMain.clearTextInWebElement(postcode) ;
			    soloMain.typeTextInWebElement(postcode, android.POSTCODE);
			    
			    soloMain.getCurrentWebElements();
			    By phonenumber=By.id("deliveryphonenumber");
			    soloMain.clearTextInWebElement(phonenumber) ;
			    soloMain.typeTextInWebElement(phonenumber, android.PHONENUMBER);
			  
			  // billling information starts here
			    
			    soloMain.getCurrentWebElements();
			    soloMain.clickOnMenuItem("billing Information");
			    By billFirstname=By.id("billingfirstname");
			    soloMain.clearTextInWebElement(billFirstname) ;
			    soloMain.typeTextInWebElement(billFirstname, android.FIRSTNAME);
			    
			    soloMain.getCurrentWebElements();
			    By billLastName=By.id("billinglastname");
			    soloMain.clearTextInWebElement(billLastName) ;
			    soloMain.typeTextInWebElement(billLastName, android.LASTNAME);
			    
			    soloMain.getCurrentWebElements();
			    By billCompanyName=By.id("billingcompany");
			    soloMain.clearTextInWebElement(billCompanyName) ;
			    soloMain.typeTextInWebElement(billCompanyName, android.LASTNAME);
			    
			    soloMain.getCurrentWebElements();
			    By billaddress1=By.id("billingaddress1");
			    soloMain.clearTextInWebElement(billaddress1) ;
			    soloMain.typeTextInWebElement(billaddress1, android.ADDRESS1);
			   
			    soloMain.getCurrentWebElements();
			    By billaddress2=By.id("billingaddress2");
			    soloMain.clearTextInWebElement(address2) ;
			    soloMain.typeTextInWebElement(address2, android.ADDRESS2);
			    
			    soloMain.getCurrentWebElements();
			    By billcity=By.id("billingcity");
			    soloMain.clearTextInWebElement(billcity) ;
			    soloMain.typeTextInWebElement(billcity, android.CITY);
			    
			    soloMain.getCurrentWebElements();
			    By billstate=By.id("billingstate");
			    soloMain.clearTextInWebElement(billstate) ;
			    soloMain.typeTextInWebElement(billstate, android.STATE);
			    
			    soloMain.getCurrentWebElements();
			    By billpostcode=By.id("billingpostcode");
			    soloMain.clearTextInWebElement(billpostcode) ;
			    soloMain.typeTextInWebElement(billpostcode, android.POSTCODE);
			    
			    soloMain.getCurrentWebElements();
			    By billphonenumber=By.id("billingphonenumber");
			    soloMain.clearTextInWebElement(billphonenumber) ;
			    soloMain.typeTextInWebElement(billphonenumber, android.PHONENUMBER);
			    
			    soloMain.getCurrentWebElements();
			    soloMain.clickOnMenuItem("Payment Methods");
			    soloMain.sleep(2000);
			    
			    soloMain.getCurrentWebElements();
			    soloMain.clickOnMenuItem("Order Comments");
			    By ordercomments=By.id("comments");
			    soloMain.clearTextInWebElement(ordercomments) ;
			    soloMain.typeTextInWebElement(ordercomments, android.COMMENTS);
			    
			    soloMain.getCurrentWebElements();
			    soloMain.clickOnMenuItem("Review Order");
			    soloMain.takeScreenshot();
			    soloMain.sleep(2000);
			    
				       
		   }
		catch (Exception e)
		{
			e.printStackTrace();
		}
		}
	
	 }


