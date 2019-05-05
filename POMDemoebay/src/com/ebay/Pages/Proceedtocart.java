package com.ebay.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Proceedtocart {

	@FindBy(id="countryId")
	private WebElement country;
	
	@FindBy(css="#addressSugg")
	private WebElement address;
	
	@FindBy(id="addressSugg_manualEntryLink")
	private WebElement address1;

	@FindBy(name="city")
	private WebElement city;
	
	@FindBy(id="state")
	private WebElement state;
	
	@FindBy(name="zip")
	private WebElement zipcode;
	
	@FindBy(name="email")
	private WebElement emailid;
	
	@FindBy(id="phoneFlagComp1")
	private WebElement phone;
	
	@FindBy(css="#sbtBtn")
	private WebElement submit;
	
	public Proceedtocart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void cartProceed() {
		Select dropdown = new Select(country);
		dropdown.selectByValue("United States");
		
		address.sendKeys("123 XYZ");
		
		address1.click();
		
		city.sendKeys("abc");
		
		Select dropdown1 = new Select(state);
		dropdown1.selectByValue("lowa");
		
		zipcode.sendKeys("s4s3c3");
		
		phone.sendKeys("123-456-789");
		
		submit.click();
	}
}
