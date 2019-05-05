package com.ebay.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productsearch {

	@FindBy(id="w1-w1-w0-multiselect[1]")
	private WebElement freeship;
	
	@FindBy(css="#w1-w1-w0-multiselect\\5b 0\\5d > a > span.cbx.x-refine__multi-select-cbx")
	private WebElement used;
	
	@FindBy(css="#w6-xCarousel-x-carousel-items > ul > li:nth-child(1) > a")
	private WebElement cars;
	
	public Productsearch(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void searchProduct() {
		freeship.click();
		used.click();
		cars.click();
	}
}
