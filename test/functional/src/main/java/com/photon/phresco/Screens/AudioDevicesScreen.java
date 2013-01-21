package com.photon.phresco.Screens;

import com.photon.phresco.uiconstants.MobilewidgUiConstants;

public class AudioDevicesScreen extends WebDriverAbstractBaseScreen{

	private MobilewidgUiConstants mobilewidgetUiConstants_;
	private String currentTestMethodName_;
	private WebDriverBaseScreen element;
	
	public AudioDevicesScreen(MobilewidgUiConstants mobilewidgetUiConstants,String currentTestMethodName){
		this.mobilewidgetUiConstants_=mobilewidgetUiConstants;
		this.currentTestMethodName_=currentTestMethodName;
	}
	public void testAudioDevicesProducts() throws Exception {
		
		waitForElementPresent(mobilewidgetUiConstants_.AUDIO_DEVICES, currentTestMethodName_);
		element = getXpathWebElement(mobilewidgetUiConstants_.AUDIO_DEVICES);
		element.click();
		waitForElementPresent(mobilewidgetUiConstants_.AUDIO_PROD1_DETAILS, currentTestMethodName_);
		element = getXpathWebElement(mobilewidgetUiConstants_.AUDIO_PROD1_DETAILS);
		element.click();
		waitForElementPresent(mobilewidgetUiConstants_.REVIEW, currentTestMethodName_);

	}

}
