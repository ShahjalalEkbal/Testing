package testcases;

import org.testng.annotations.Test;

import base.Driversetup;
import pageobjects.p001_LocatorLearning;

public class TC001_LocatorLearning extends Driversetup {

String baseUrl="https://rahulshettyacademy.com/locatorspractice/";
	
	@Test
	public void locatorlearning() throws InterruptedException {
	
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		// Operate Elements
		p001_LocatorLearning locatorlearningPageObject= new p001_LocatorLearning(driver);
		
		locatorlearningPageObject.sendusername();
		locatorlearningPageObject.sendpassword();
		Thread.sleep(2000);
		locatorlearningPageObject.clicksigninbutton();
		//locatorlearningPageObject.errorgettext();
		locatorlearningPageObject.clicklinktext();
		locatorlearningPageObject.Resetname();
		locatorlearningPageObject.Resetemail();
		locatorlearningPageObject.Resetphone();
		Thread.sleep(2000);
		locatorlearningPageObject.Reset();
		locatorlearningPageObject.login();
		locatorlearningPageObject.Resendusername();
		Thread.sleep(2000);
		locatorlearningPageObject.Resendpassword();
		locatorlearningPageObject.checkbox();
		Thread.sleep(2000);
		locatorlearningPageObject.reclicksigninbutton();
		Thread.sleep(2000);
	}
}
