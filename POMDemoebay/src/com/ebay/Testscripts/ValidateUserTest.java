package com.ebay.Testscripts;

import org.junit.Assert;

import org.testng.annotations.Test;

import com.ebay.Pages.Login;

public class ValidateUserTest extends BaseClass {
	

@Test

public void userValidationTest() {
	Login lp = new Login(driver);
	lp.applicationLogin("ishanmodi4@gmail.com", "Jiya@123");
	boolean userNamepresent = lp.getUserName().isDisplayed();
	
	Assert.assertTrue(userNamepresent);
	
}


}
