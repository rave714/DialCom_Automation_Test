package tests;

import org.testng.annotations.Test;

import pageobjects.Store_Loginpage;
import pageobjects.Store_Register_page;
import utils.AutomationHelper;


public class Store_Register_Tests  extends AutomationHelper {
	  
	  
	  
	  @Test()
	  public void Dstore_login01()throws Exception  {
	    
		  Store_Register_page register_page = new  Store_Register_page();
		  
	    
		
		  register_page.dstore_register_link (driver,"http://localhost/OnlineShopping-master/index.php");
		  register_page.d_store_registerpage(driver, "Nipun1", "yr45@gmail.xom", "4433665511","55555");
		  register_page.d_store_verifydetails(driver, "CATEGORY");
	    
	    
	  }
	  

	}
