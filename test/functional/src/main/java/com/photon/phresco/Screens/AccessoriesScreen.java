package com.photon.phresco.Screens;

import com.photon.phresco.uiconstants.MobilewidgUiConstants;

public class AccessoriesScreen extends WebDriverAbstractBaseScreen {

	private MobilewidgUiConstants mobilewidgetUiConstants_;
	private String currentTestMethodName_;
	private WebDriverBaseScreen element;

	public AccessoriesScreen(MobilewidgUiConstants mobilewidgetUiConstants,
			String currentTestMethodName) {
		this.mobilewidgetUiConstants_ = mobilewidgetUiConstants;
		this.currentTestMethodName_ = currentTestMethodName;
	}

	public void Accessories() throws Exception {

		waitForElementPresent(mobilewidgetUiConstants_.ACCESSORIES,
				currentTestMethodName_);
		element = getXpathWebElement(mobilewidgetUiConstants_.ACCESSORIES);
		element.click();
		waitForElementPresent(mobilewidgetUiConstants_.ACC_PROD1_DETAILS,
				currentTestMethodName_);
		element = getXpathWebElement(mobilewidgetUiConstants_.ACC_PROD1_DETAILS);
		element.click();
		waitForElementPresent(mobilewidgetUiConstants_.REVIEW,
				currentTestMethodName_);

	}
}