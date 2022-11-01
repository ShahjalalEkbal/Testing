package testcases;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Driversetup;
import pageobjects.p002_verifypageTitle;

public class TC002_VerifyPageTitle extends Driversetup{
	
public String baseUrl="http://automationpractice.com/index.php";
	
	
	@Test(priority=1)
	public void verifyPageTitle_shouldPass() {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		p002_verifypageTitle title = new p002_verifypageTitle(driver);
		String foundTitleFromWebsite=title.gettitle();
		
		SoftAssert softly = new SoftAssert();
		softly.assertEquals(foundTitleFromWebsite, "My Store");
		
		softly.assertAll();
	}
	
	@Test(priority=2)
	public static void isWebSiteSecured() {
		p002_verifypageTitle currenturl = new p002_verifypageTitle(driver) ;
		String url= currenturl.getcurrenturl();
		
		if (url.contains("https")) {
			System.out.println("Site is secured");
		}else {
			System.out.println("Site is not secured");
		}
	}

}
