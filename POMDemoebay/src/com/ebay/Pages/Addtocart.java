package com.ebay.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {

	@FindBy(id="vi-viewInCartBtn")
	private WebElement add;
	
	
	public Addtocart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

public void cartAdded() {

	add.click();
}

}