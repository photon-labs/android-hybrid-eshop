package com.photon.phresco;

import junit.framework.TestCase;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.iphone.IPhoneDriver;

import com.photon.phresco.uiconstants.PhrescoUiConstants;

public class TabletTest extends TestCase {

	WebDriver driver;

	@Test
	public void testTablet() throws Exception {
		
		try {
			PhrescoUiConstants phrsc = new PhrescoUiConstants();
			String serverURL = phrsc.PROTOCOL + "://" + phrsc.HOST + ":" + phrsc.SERVER_PORT + "/"+phrsc.CONTEXT;
			System.out.println("serverURL :"+serverURL);
			driver.get(serverURL);
			Thread.sleep(20000);
			WebElement element = driver.findElement(By.xpath(phrsc.BROWSE));
			element.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(phrsc.BROWSE_TABLET));
			Thread.sleep(1000);
			driver.findElement(By.xpath(phrsc.BROWSE_TABLET)).click();			
			driver.findElement(By.xpath(phrsc.PRODUCT1));
			Thread.sleep(1000);
			driver.findElement(By.xpath(phrsc.PRODUCT1)).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(phrsc.ADDTOCART));
			Thread.sleep(1000);
			driver.findElement(By.xpath(phrsc.ADDTOCART)).click();
			driver.findElement(By.xpath(phrsc.CHECKOUT));
			Thread.sleep(1000);
			driver.findElement(By.xpath(phrsc.CHECKOUT)).click();
			} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public void setUp() throws Exception {

		driver = new AndroidDriver();
	}

	public void tearDown() throws Exception {
		System.out.println("Page title is: " + driver.getTitle());
		driver.quit();
	}

}


