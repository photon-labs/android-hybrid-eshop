package com.photon.phresco.Screens;

import java.io.IOException;

import com.photon.phresco.uiconstants.MobilewidgUiConstants;

public class ComputersScreen extends WebDriverAbstractBaseScreen{

	private MobilewidgUiConstants mobilewidgetUiConstants_;
	private String currentTestMethodName_;
	private WebDriverBaseScreen element;
	
	public ComputersScreen(MobilewidgUiConstants mobilewidgetUiConstants,
			String currentTestMethodName){
		this.mobilewidgetUiConstants_=mobilewidgetUiConstants;
		this.currentTestMethodName_=currentTestMethodName;
	}
	public void testComputersProducts() throws IOException, Exception{
		waitForElementPresent(mobilewidgetUiConstants_.COMPUTERS, currentTestMethodName_);
		element = getXpathWebElement(mobilewidgetUiConstants_.COMPUTERS);
		element.click();
		waitForElementPresent(mobilewidgetUiConstants_.COMP_PROD1_DETAILS, currentTestMethodName_);
		element = getXpathWebElement(mobilewidgetUiConstants_.COMP_PROD1_DETAILS);
		element.click();
		waitForElementPresent(mobilewidgetUiConstants_.REVIEW, currentTestMethodName_);
		
	}

}
