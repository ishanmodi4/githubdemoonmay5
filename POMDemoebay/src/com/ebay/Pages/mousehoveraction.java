package com.ebay.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mousehoveraction {

	@FindBy(linkText="Toys")
	private WebElement toys;
	
	@FindBy(css="#w1-w0-w7-toggle-button > span")
	private WebElement etoys;
	
	@FindBy(linkText="Battery Operated Toys")
	private WebElement batterytoys;
	
	public mousehoveraction(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void mousehover() {
		toys.click();
		etoys.click();
		batterytoys.click();
	}
	
}
