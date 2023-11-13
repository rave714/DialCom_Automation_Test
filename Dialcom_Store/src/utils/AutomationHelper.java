package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AutomationHelper {

	protected WebDriver driver;

	@BeforeMethod
	public void beforeMethod() throws Exception {

		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver(options);
	  
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
