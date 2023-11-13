package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



import runtime.ActionCommands;


public class Store_Register_page extends ActionCommands {
    

    // Methods specific to the login page
    
	By lnk_register = By.xpath("//body/nav[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/i[1]");
    By tf_fullname = By.xpath("//input[@id='s-name']");
    By tf_email = By.xpath("//input[@id='s-email']");
    By tf_pnum = By.xpath("//input[@id='s-phone']");
    By tf_Password = By.xpath("//input[@id='s-password']");
    By btn_signup = By.xpath(" //input[@id='s-register']");
    
    By ele_ValidationText = By.xpath("//h1[contains(text(),'Category')]");
    
     public void dstore_register_link (WebDriver driver,String url ) throws Exception {
     	
 		open(driver, url);
 		
 		
 }
 	 
 		public void d_store_registerpage(WebDriver driver,String fname ,String email,String pnum, String password) throws Exception {
 			//open(driver, url);
 			
 			click(driver, lnk_register);
 			type(driver,  tf_fullname ,fname);
 			type(driver,  tf_email, email);
 			type(driver,  tf_pnum, pnum);
 			type(driver, tf_Password, password);
 			click(driver, btn_signup);
 			
 		}
 		
 		public void d_store_verifydetails(WebDriver driver, String expectedText) throws Exception   {
 			
 			verifyByText(driver, ele_ValidationText, expectedText);
 		}

}