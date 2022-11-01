package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class p001_LocatorLearning {

	WebDriver driver=null;
	public p001_LocatorLearning(WebDriver driver) {
		this.driver=driver;
	}
	By id= By.id("inputUsername");
	By name= By.name("inputPassword");
	By className= By.className("signInBtn");
	//By csserror= By.cssSelector("p.error");
	By className2= By.className("error");
	By linktext= By.linkText("Forgot your password?");
	By xpathname= By.xpath("//input[@placeholder='Name']");
	By xpathemail= By.xpath("//input[@placeholder='Email']");
	By xpathphone= By.xpath("//input[@type='text'][3]");
	By reset= By.cssSelector("button.reset-pwd-btn");
	By login= By.className("go-to-login-btn");
	By inputusername= By.cssSelector("input#inputUsername");
	By inputpass= By.name("inputPassword");
	By checkbox= By.id("chkboxOne");
	By signin= By.className("signInBtn");
	
	public void sendusername() {
		driver.findElement(id).sendKeys("sajjad");
	}
	
	public void sendpassword() {
		driver.findElement(name).sendKeys("12345");
	}
	
	public void clicksigninbutton() {
		driver.findElement(className).click();
	}
	
	public void errorgettext() {
		System.out.println(driver.findElement(className2).getText());
	}
	
	public void clicklinktext() {
		driver.findElement(linktext).click();
	}
	
	public void Resetname() {
		driver.findElement(xpathname).sendKeys("ekbal");
	}
	
	public void Resetemail() {
		driver.findElement(xpathemail).sendKeys("test@gmail.com");
	}
	
	public void Resetphone() {
		driver.findElement(xpathphone).sendKeys("01670102216");
	}
     
	public void Reset() {
		driver.findElement(reset).click();
	}
	
	public void login() {
		driver.findElement(login).click();
	}
	
	public void Resendusername() {
		driver.findElement(inputusername).sendKeys("Tanvir");
	}
	
	public void Resendpassword() {
		driver.findElement(inputpass).sendKeys("rahulshettyacademy");
	}
	
	public void checkbox() {
		driver.findElement(checkbox).click();
	}
	
	public void reclicksigninbutton() {
		driver.findElement(signin).click();
	}
	
}
