package tests;

import org.testng.annotations.Test;

import pageobjects.Store_Loginpage;
import pageobjects.Store_Register_page;
import pageobjects.Store_adcartpage;
import utils.AutomationHelper;


public class Store_Cart_Tests  extends AutomationHelper {
	  
	  
	  
	  @Test()
	  public void Dstore_login01()throws Exception  {
		  
		  Store_Loginpage Store_Loginpage = new Store_Loginpage();
		 
		
		  
		  Store_Loginpage.dstore_Login_link (driver,"http://localhost/OnlineShopping-master/index.php");
		  Store_Loginpage.d_store_loginpage(driver, "jr@gmail.xom", "123456");
		  Store_adcartpage addcart_page = new  Store_adcartpage();
		  addcart_page.d_store_cart(driver);
		  addcart_page.d_store_cartverifydetails(driver, "Product has been added to the cart View Cart");
		
		  
	    
	    
	  }
	  

	}
