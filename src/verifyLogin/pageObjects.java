package verifyLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class pageObjects {
	WebDriver driver;
	String baseUrl;
	
	@FindBy(name = "uid")
	WebElement userName;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(name = "btnLogin")
	WebElement loginButton;

	@FindBy(xpath = "//td[text()='Manger Id : mngr93389']")
	WebElement message;

	public pageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void login() throws InterruptedException {
		//WebElement u = driver.findElement(By.name("uid"));
		userName.sendKeys("mngr93389");
		password.sendKeys("atYreqA");
		loginButton.click();
		Thread.sleep(2000);
		String actualMessage = message.getText();
		String expectedMsg = "Manger Id : mngr93389";
		if(actualMessage.equalsIgnoreCase(expectedMsg)) {
			System.out.println("Login Successful");
		}
		else {
			System.out.println("Login usuccessful");
		}
	}

}