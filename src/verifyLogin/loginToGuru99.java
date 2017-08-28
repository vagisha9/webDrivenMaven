package verifyLogin;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginToGuru99 {
	
	WebDriver driver;
	pageObjects pg;
	
	@BeforeClass
	public void setup() {
		
		String baseUrl = "http://www.demo.guru99.com/V4/";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\office\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		pg = new pageObjects(driver); // initialized always after driver
		// Maximize the browser's window
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	
	@Test
	public void loginToGuru() throws InterruptedException {
		pg.login();
	}
	
	

}
