package com.photon.phresco;

import junit.framework.TestCase;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.android.AndroidDriver;



import com.photon.phresco.uiconstants.PhrescoUiConstants;

public class Registertest extends TestCase {

	WebDriver driver;

	@Test
	public void testRegister() throws Exception {
		
		try {
			
			PhrescoUiConstants phrsc = new PhrescoUiConstants();
			String serverURL = phrsc.PROTOCOL + "://" + phrsc.HOST + ":" + phrsc.SERVER_PORT + "/"+phrsc.CONTEXT;
			System.out.println("serverURL :"+serverURL);
			driver.get(serverURL);
			Thread.sleep(15000);
			driver.findElement(By.xpath(phrsc.REGISTER)).click();
			Thread.sleep(1000);
			driver.findElement(By.id(phrsc.FIRSTNAME)).sendKeys(phrsc.FIRSTNAME_VALUE);
			Thread.sleep(1000);
			driver.findElement(By.id(phrsc.LASTNAME)).sendKeys(phrsc.LASTNAME_VALUE);
			Thread.sleep(1000);
			driver.findElement(By.id(phrsc.EMAIL_ID)).sendKeys(phrsc.EMAIL_ID_VALUE);
			Thread.sleep(1000);
			driver.findElement(By.id(phrsc.PASSWORD)).sendKeys(phrsc.PASSWORD_VALUE);
			Thread.sleep(1000);
			driver.findElement(By.id(phrsc.PHONENO)).sendKeys(phrsc.PHONENO_VALUE);
			Thread.sleep(1000);
			driver.findElement(By.xpath(phrsc.REGISTER_BUTTON));
			Thread.sleep(1000);
			driver.findElement(By.xpath(phrsc.REGISTER_BUTTON)).click();
			Thread.sleep(1000);

		 } catch (Exception e) {
			// File tempFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
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
