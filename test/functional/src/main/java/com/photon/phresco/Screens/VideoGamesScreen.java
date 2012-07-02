package com.photon.phresco.Screens;

import com.photon.phresco.uiconstants.MobilewidgUiConstants;

public class VideoGamesScreen extends WebDriverAbstractBaseScreen {

	private MobilewidgUiConstants mobileWidgetUIConstants;
	private String currentTestMethodName_;
	private WebDriverBaseScreen element;

	public VideoGamesScreen(MobilewidgUiConstants mobilewidgetUiConstants,
			String currentTestMethodName) {
		this.mobileWidgetUIConstants = mobilewidgetUiConstants;
		this.currentTestMethodName_ = currentTestMethodName;
	}

	public void testVideoGamesProducts() throws Exception {
		
		waitForElementPresent(mobileWidgetUIConstants.VIDEOGAMES, currentTestMethodName_);
		element = getXpathWebElement(mobileWidgetUIConstants.VIDEOGAMES);
		element.click();
		waitForElementPresent(mobileWidgetUIConstants.VIDGAMES_PROD1_DETAILS,
				currentTestMethodName_);
		element = getXpathWebElement(mobileWidgetUIConstants.VIDGAMES_PROD1_DETAILS);
		element.click();
		waitForElementPresent(mobileWidgetUIConstants.REVIEW, currentTestMethodName_);

	}

}
