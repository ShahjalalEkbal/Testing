package testcases;

import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.Driversetup;
import pageobjects.p005_KeyboardEvent;

public class TC005_KeyboardEvent extends Driversetup{

	public static String baseUrl = "http://automationpractice.com/index.php";

	@Test
	public static void KeyboardEventCheck() throws InterruptedException {

		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();

		Thread.sleep(3000);
		p005_KeyboardEvent ke = new p005_KeyboardEvent(driver);
		WebElement e=ke.searchquery();;
		Thread.sleep(3000);
		e.sendKeys(Keys.chord(Keys.SHIFT,"tedtalk"));
		//driver.findElement(locator).sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,Keys.DELETE));
		Thread.sleep(3000);
		e.sendKeys(Keys.chord(Keys.ENTER));
		Thread.sleep(3000);
		
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)); 
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("someid")));
		
	
		
	}
}
