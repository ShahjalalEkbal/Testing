package testcases;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.Driversetup;
import pageobjects.P004_VerifyCheckboxAndRadioButton;

public class TC004_checkBoxAndRadioButton extends Driversetup{

	public static String baseUrl = "https://jqueryui.com/checkboxradio";

	@Test
	public static void checkBoxAndRadioButtonInIFrame() throws InterruptedException {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();

		Thread.sleep(3000);
		
		// Switch to Frame
		driver.switchTo().frame(0);
		
		// Operate Elements
		P004_VerifyCheckboxAndRadioButton learningPageObject= new P004_VerifyCheckboxAndRadioButton(driver);
		learningPageObject.clickRadioButton();
		Thread.sleep(1000);
		learningPageObject.clickCheckBox();
		learningPageObject.clickCheckBox2();
		Thread.sleep(1000);
	
		// Back to page
		driver.switchTo().defaultContent();
		
	}
	
}
