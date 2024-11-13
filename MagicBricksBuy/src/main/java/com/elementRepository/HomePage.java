package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "buyheading")
	private WebElement getBuyLink;

	@FindBy(xpath = "(//a[@class='mb-header__main__link js-menu-link'])[1]")
	private WebElement getLocationLink;

	@FindBy(xpath = "//a[text()='Pune']")
	private WebElement getPuneLink;
	
	@FindBy(xpath = "//a[text()='Villa in Pune']")
	private WebElement getOptionLink;

	public WebElement getGetOptionLink() {
		return getOptionLink;
	}

	public WebElement getGetBuyLink() {
		return getBuyLink;
	}

	public WebElement getGetLocationLink() {
		return getLocationLink;
	}

	public WebElement getGetPuneLink() {
		return getPuneLink;
	} 

	
}