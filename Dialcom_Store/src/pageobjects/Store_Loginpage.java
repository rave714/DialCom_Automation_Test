package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import runtime.ActionCommands;


public class Store_Loginpage extends ActionCommands {
    

    // Methods specific to the login page
    
	By lnk_logingregister = By.xpath("//body/nav[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/i[1]");
    By tf_email = By.xpath("//input[@name ='l-email']");
    By tf_Password = By.xpath("//input[@name ='l-password']");
    By btn_Login = By.xpath(" //input[@name ='l-login']");
    
    By ele_ValidationText = By.xpath("//h1[contains(text(),'Category')]");
    
     public void dstore_Login_link (WebDriver driver,String url ) throws Exception {
     	
 		open(driver, url);
 		
 		
 }
 	 
 		public void d_store_loginpage(WebDriver driver,String email, String password) throws Exception {
 			//open(driver, url);
 			
 			click(driver, lnk_logingregister);
 			type(driver,  tf_email, email);
 			type(driver, tf_Password, password);
 			click(driver, btn_Login);
 			
 		}
 		
 		public void d_store_verifydetails(WebDriver driver, String expectedText) throws Exception   {
 			
 			verifyByText(driver, ele_ValidationText, expectedText);
 		}

}