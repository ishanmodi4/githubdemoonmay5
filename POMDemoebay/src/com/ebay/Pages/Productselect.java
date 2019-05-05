package com.ebay.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Productselect {

//	@FindBy(css="#w6-w0-w1 > button > div")
	//private WebElement sort;
	
	//@FindBy(id="w6-w0-w3-switch-box")
//	private WebElement switchbox;

	@FindBy(css="#w6-items\\5b 0\\5d > div > div.s-item__info.clearfix > a > h3")
	private WebElement carselect;
	
	public Productselect(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void selectproduct() {	
	//	Select dropdown = new Select(sort);
	//	dropdown.selectByIndex(1);
		
		//sort.click();
	//	switchbox.click();
		carselect.click();
	}
	
}
