package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class p005_KeyboardEvent {

	WebDriver driver=null;
	public p005_KeyboardEvent(WebDriver driver) {
		this.driver=driver;
	}
	
	By search= By.xpath("//input[@id='search_query_top']");
	
	public WebElement searchquery() {
		return driver.findElement(search);
	}
	
	
}
