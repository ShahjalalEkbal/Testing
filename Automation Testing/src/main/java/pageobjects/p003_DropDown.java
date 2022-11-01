package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class p003_DropDown {

	WebDriver driver=null;
	public p003_DropDown(WebDriver driver) {
		this.driver=driver;
	}
	
	By name= By.name("cars");
	
	public WebElement car() {
		return driver.findElement(name);
	}
	
}
