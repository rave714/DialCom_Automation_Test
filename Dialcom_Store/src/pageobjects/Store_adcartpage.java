package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import runtime.ActionCommands;


public class Store_adcartpage extends ActionCommands {
    

    // Methods specific to the login page
    
	
	By lnk_cartgregister = By.xpath("//p[contains(text(),'Tablets')]");
    By lnk_prodcut = By.xpath("//p[contains(text(),'APPLE 9.7 iPad')]");
    
    By lnk_cart = By.xpath(" //button[@id='add-to-cart']");
    
    
    By ele_ValidationText = By.xpath("//span[@id='add-to-cart-message']");
    
     public void dstore_Login_link (WebDriver driver,String url ) throws Exception {
     	
 		open(driver, url);
 		
 		
 }
 	 
 		public void d_store_cart(WebDriver driver) throws Exception {
 			
 			//open(driver, url);
 			click(driver, lnk_cartgregister);
 			click(driver, lnk_prodcut);
 			
 			click(driver,  lnk_cart);
 			
 			
 			
 		}
 		
 		public void d_store_cartverifydetails(WebDriver driver, String expectedText) throws Exception   {
 			
 			verifyByText(driver, ele_ValidationText, expectedText);
 		}

}