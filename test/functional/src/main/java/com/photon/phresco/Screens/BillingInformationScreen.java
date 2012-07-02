package com.photon.phresco.Screens;

import com.photon.phresco.uiconstants.MobilewidgUiConstants;

public class BillingInformationScreen extends WebDriverAbstractBaseScreen {

	private MobilewidgUiConstants mobilewidgetUiConstants_;
	private String currentTestMethodName_;
	private WebDriverBaseScreen element;

	public BillingInformationScreen(
			MobilewidgUiConstants mobilewidgetUiConstants,
			String currentTestMethodName) {
		this.mobilewidgetUiConstants_ = mobilewidgetUiConstants;
		this.currentTestMethodName_ = currentTestMethodName;
	}

	public void testBillingInformationOfAllProducts() throws Exception {

		waitForElementPresent(mobilewidgetUiConstants_.ADDTOCART,
				currentTestMethodName_);
		element = getXpathWebElement(mobilewidgetUiConstants_.ADDTOCART);
		element.click();
		waitForElementPresent(mobilewidgetUiConstants_.UPDATECART,
				currentTestMethodName_);
		element = getXpathWebElement(mobilewidgetUiConstants_.UPDATECART);
		element.click();
		waitForElementPresent(mobilewidgetUiConstants_.CHECKOUT,
				currentTestMethodName_);
		element = getXpathWebElement(mobilewidgetUiConstants_.CHECKOUT);
		element.click();
		waitForElementPresent(mobilewidgetUiConstants_.CUSTOMERINFORMATION,
				currentTestMethodName_);
		element = getXpathWebElement(mobilewidgetUiConstants_.CUSTOMERINFORMATION);
		element.click();
		element = getIdWebElement(mobilewidgetUiConstants_.EMAIL);
		element.type(mobilewidgetUiConstants_.EMAIL_VALUE);
		waitForElementPresent(mobilewidgetUiConstants_.DELIVERYINFO,
				currentTestMethodName_);
		element = getXpathWebElement(mobilewidgetUiConstants_.DELIVERYINFO);
		element.click();
		element = getIdWebElement(mobilewidgetUiConstants_.FIRSTNAME);
		element.type(mobilewidgetUiConstants_.FIRSTNAME_VALUE);
		element = getIdWebElement(mobilewidgetUiConstants_.LASTNAME);
		element.type(mobilewidgetUiConstants_.LASTNAME_VALUE);
		element = getIdWebElement(mobilewidgetUiConstants_.COMPANY);
		element.type(mobilewidgetUiConstants_.COMPANY_VALUE);
		element = getIdWebElement(mobilewidgetUiConstants_.ADDRESS1);
		element.type(mobilewidgetUiConstants_.ADDRESS1_VALUE);
		element = getIdWebElement(mobilewidgetUiConstants_.ADDRESS2);
		element.type(mobilewidgetUiConstants_.ADDRESS2_VALUE);
		element = getIdWebElement(mobilewidgetUiConstants_.CITY);
		element.type(mobilewidgetUiConstants_.CITY_VALUE);
		element = getIdWebElement(mobilewidgetUiConstants_.STATE);
		element.type(mobilewidgetUiConstants_.STATE_VALUE);
		element = getIdWebElement(mobilewidgetUiConstants_.POSTCODE);
		element.type(mobilewidgetUiConstants_.POSTALCODE_VALUE);
		element = getIdWebElement(mobilewidgetUiConstants_.PHONENUMBER);
		element.type(mobilewidgetUiConstants_.PHONENUMBER_VALUE);
		waitForElementPresent(mobilewidgetUiConstants_.BILLINGINFO,
				currentTestMethodName_);
		element = getXpathWebElement(mobilewidgetUiConstants_.BILLINGINFO);
		element.click();
		waitForElementPresent(mobilewidgetUiConstants_.CHECKADDRESS,
				currentTestMethodName_);
		element = getXpathWebElement(mobilewidgetUiConstants_.CHECKADDRESS);
		element.click();
		waitForElementPresent(mobilewidgetUiConstants_.PAYMENTMETHODS,
				currentTestMethodName_);
		element = getXpathWebElement(mobilewidgetUiConstants_.PAYMENTMETHODS);
		element.click();
		waitForElementPresent(mobilewidgetUiConstants_.CASHONDELIVERY,
				currentTestMethodName_);
		element = getXpathWebElement(mobilewidgetUiConstants_.CASHONDELIVERY);
		element.click();
		waitForElementPresent(mobilewidgetUiConstants_.ORDERCOMMENTS,
				currentTestMethodName_);
		element = getXpathWebElement(mobilewidgetUiConstants_.ORDERCOMMENTS);
		element.click();
		element = getIdWebElement(mobilewidgetUiConstants_.GIVECOMMENTS);
		element.type(mobilewidgetUiConstants_.ORDERCOMMENTS_VALUE);
		waitForElementPresent(mobilewidgetUiConstants_.REVIEWORDER,
				currentTestMethodName_);
		element = getXpathWebElement(mobilewidgetUiConstants_.REVIEWORDER);
		element.click();
		waitForElementPresent(mobilewidgetUiConstants_.SUBMITORDER,
				currentTestMethodName_);
		element = getXpathWebElement(mobilewidgetUiConstants_.SUBMITORDER);
		element.click();
	}
}
