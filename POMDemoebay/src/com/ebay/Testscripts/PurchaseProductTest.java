package com.ebay.Testscripts;


import org.testng.annotations.Test;

import com.ebay.Pages.Addtocart;
import com.ebay.Pages.Login;
import com.ebay.Pages.Proceedtocart;
import com.ebay.Pages.Productsearch;
import com.ebay.Pages.Productselect;
import com.ebay.Pages.mousehoveraction;

public class PurchaseProductTest extends BaseClass {

	
	@Test
	
	public void purchasecarTest() {
		Login lp = new Login(driver);
		lp.applicationLogin("ishanmodi4@gmail.com", "Jiya@123");
		
		mousehoveraction ms = new mousehoveraction(driver);
		ms.mousehover();
		
		Productsearch ps = new Productsearch(driver);
		ps.searchProduct();
		
		Productselect pss = new Productselect(driver);
		pss.selectproduct();
		
		Addtocart ac = new Addtocart(driver);
		ac.cartAdded();
		
		Proceedtocart pc = new Proceedtocart(driver);
		pc.cartProceed();
		
		
	}
	
	
	
}
