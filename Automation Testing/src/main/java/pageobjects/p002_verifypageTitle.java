package pageobjects;

import org.openqa.selenium.WebDriver;

public class p002_verifypageTitle {

	WebDriver driver=null;
	public p002_verifypageTitle(WebDriver driver) {
		this.driver=driver;
	}
	
	public String gettitle() {
		return driver.getTitle();
	}
	
	public String getcurrenturl() {
		return driver.getCurrentUrl();
	}
}
