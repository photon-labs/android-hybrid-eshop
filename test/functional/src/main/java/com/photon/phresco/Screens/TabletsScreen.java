package com.photon.phresco.Screens;

import org.apache.commons.lang.StringUtils;

import com.photon.phresco.uiconstants.MobilewidgUiConstants;

public class TabletsScreen extends WebDriverAbstractBaseScreen {

	private MobilewidgUiConstants mobilewidgetUiConstants_;
	private String currentTestMethodName_;
	private WebDriverBaseScreen element;

	public TabletsScreen(MobilewidgUiConstants mobilewidgetUiConstants,
			String currentTestMethodName) {
		this.mobilewidgetUiConstants_ = mobilewidgetUiConstants;
		this.currentTestMethodName_ = currentTestMethodName;
	}
	public void testTabletsProducts() throws Exception {
		if (StringUtils.isEmpty(currentTestMethodName_)) {
			currentTestMethodName_ = Thread.currentThread().getStackTrace()[1]
					.getMethodName();
			;
		}
		waitForElementPresent(mobilewidgetUiConstants_.TABLETS, currentTestMethodName_);
		element = getXpathWebElement(mobilewidgetUiConstants_.TABLETS);
		element.click();
		waitForElementPresent(mobilewidgetUiConstants_.TABLETS_PROD1_DETAILS, currentTestMethodName_);
		element = getXpathWebElement(mobilewidgetUiConstants_.TABLETS_PROD1_DETAILS);
		element.click();
		waitForElementPresent(mobilewidgetUiConstants_.REVIEW, currentTestMethodName_);

	}
}

