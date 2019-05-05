package com.ebay.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(linkText="Sign in")
	private WebElement Signin; 
	
	@FindBy(id="userid")
	private WebElement userid;
	
	@FindBy(id="pass")
	private WebElement pass;
	
	@FindBy(css="#sgnBt")
	private WebElement submit;
	
	@FindBy(css="#gh-ug > b:nth-child(1)")
	private WebElement username;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUserName() {
		 return username;
	}
	
	public void applicationLogin(String username, String password) {
		Signin.click();
		userid.sendKeys(username);
		pass.sendKeys(password);
		submit.click();
	}
}
