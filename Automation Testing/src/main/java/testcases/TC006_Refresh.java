package testcases;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.Driversetup;

public class TC006_Refresh extends Driversetup{

	public static String baseUrl = "https://www.w3schools.com";

	@Test
	public static void refreshPage() throws InterruptedException {
		
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		driver.navigate().to("http://www.google.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		
		//navigate( ).to( )
		//navigate( ).back( )
		//navigate( ).forward( )
		//navigate( ).refresh( )
	}
}
