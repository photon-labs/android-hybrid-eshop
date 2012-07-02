package com.photon.phresco.Screens;

import com.photon.phresco.uiconstants.MobilewidgUiConstants;

public class MoviesAndMusicScreen extends WebDriverAbstractBaseScreen {

	private MobilewidgUiConstants mobilewidgetUiConstants_;
	private String currentTestMethodName_;
	private WebDriverBaseScreen element;

	public MoviesAndMusicScreen(MobilewidgUiConstants mobilewidgetUiConstants,
			String currentTestMethodName) {
		this.mobilewidgetUiConstants_ = mobilewidgetUiConstants;
		this.currentTestMethodName_ = currentTestMethodName;
	}

	public void testMoviesAndMusicProducts() throws Exception {
		waitForElementPresent(mobilewidgetUiConstants_.MOVIESnMUSIC,
				currentTestMethodName_);
		element = getXpathWebElement(mobilewidgetUiConstants_.MOVIESnMUSIC);
		element.click();
		waitForElementPresent(mobilewidgetUiConstants_.MnM_PROD1_DETAILS,
				currentTestMethodName_);
		element = getXpathWebElement(mobilewidgetUiConstants_.MnM_PROD1_DETAILS);
		element.click();
		waitForElementPresent(mobilewidgetUiConstants_.REVIEW,
				currentTestMethodName_);

	}
}