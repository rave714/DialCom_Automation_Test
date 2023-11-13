package pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import runtime.ActionCommands;


public class Store_Home extends ActionCommands{
	
	By lnk_logingregister = By.xpath("//body/nav[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/i[1]");
	

	
	
	public void openDialcomHome(WebDriver driver, String url) throws IOException {
		open(driver, url);
	}

	public void navigatelog(WebDriver driver) throws IOException {
		click(driver, lnk_logingregister);
		
	}
	
}
