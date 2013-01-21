package com.photon.phresco.Screens;

import com.photon.phresco.uiconstants.MobilewidgUiConstants;

public class TelevisionScreen extends WebDriverAbstractBaseScreen {

	private MobilewidgUiConstants mobileWidgetUIConstants;
	private String currentTestMethodName_;
	private WebDriverBaseScreen element;

	public TelevisionScreen(MobilewidgUiConstants mobilewidgetUiConstants,
			String currentTestMethodName) {
		this.mobileWidgetUIConstants = mobilewidgetUiConstants;
		this.currentTestMethodName_ = currentTestMethodName;
	}

	public void testTelevisionProducts() throws Exception {

		waitForElementPresent(mobileWidgetUIConstants.TELEVISION,
				currentTestMethodName_);
		element = getXpathWebElement(mobileWidgetUIConstants.TELEVISION);
		element.click();
		waitForElementPresent(mobileWidgetUIConstants.TELE_PROD1_DETAILS,
				currentTestMethodName_);
		element = getXpathWebElement(mobileWidgetUIConstants.TELE_PROD1_DETAILS);
		element.click();
		waitForElementPresent(mobileWidgetUIConstants.REVIEW,
				currentTestMethodName_);

	}
}
