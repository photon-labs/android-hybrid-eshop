package com.photon.phresco.Screens;

import com.photon.phresco.uiconstants.MobilewidgUiConstants;

public class CamerasScreen extends WebDriverAbstractBaseScreen {

	private MobilewidgUiConstants mobilewidgetUiConstants_;
	private String currentTestMethodName_;
	private WebDriverBaseScreen element;

	public CamerasScreen(MobilewidgUiConstants mobilewidgetUiConstants,
			String currentTestMethodName) {
		this.mobilewidgetUiConstants_ = mobilewidgetUiConstants;
		this.currentTestMethodName_ = currentTestMethodName;
	}

	public void testCamerasPrducts() throws Exception {

		waitForElementPresent(mobilewidgetUiConstants_.CAMERAS,
				currentTestMethodName_);
		element = getXpathWebElement(mobilewidgetUiConstants_.CAMERAS);
		element.click();
		waitForElementPresent(mobilewidgetUiConstants_.CAMERAS_PROD1_DETAILS,
				currentTestMethodName_);
		element = getXpathWebElement(mobilewidgetUiConstants_.CAMERAS_PROD1_DETAILS);
		element.click();
		waitForElementPresent(mobilewidgetUiConstants_.REVIEW,
				currentTestMethodName_);

	}

}
