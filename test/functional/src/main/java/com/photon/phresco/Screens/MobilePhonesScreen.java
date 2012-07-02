package com.photon.phresco.Screens;

import com.photon.phresco.uiconstants.MobilewidgUiConstants;

public class MobilePhonesScreen extends WebDriverAbstractBaseScreen{

	private MobilewidgUiConstants mobilewidgetUiConstants_;
	private String currentTestMethodName_;
	private WebDriverBaseScreen element;
	
	public MobilePhonesScreen(MobilewidgUiConstants mobilewidgetUiConstants,String currentTestMethodName){
		this.mobilewidgetUiConstants_=mobilewidgetUiConstants;
		this.currentTestMethodName_=currentTestMethodName;
	}
	public void testMobilePhonesProducts() throws Exception {
		
		waitForElementPresent(mobilewidgetUiConstants_.MOBILE, currentTestMethodName_);
		element = getXpathWebElement(mobilewidgetUiConstants_.MOBILE);
		element.click();
		waitForElementPresent(mobilewidgetUiConstants_.MOBILE_PROD1_DETAILS, currentTestMethodName_);
		element = getXpathWebElement(mobilewidgetUiConstants_.MOBILE_PROD1_DETAILS);
		element.click();
		waitForElementPresent(mobilewidgetUiConstants_.REVIEW, currentTestMethodName_);

	}
}
