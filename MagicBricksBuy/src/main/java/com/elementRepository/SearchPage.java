package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='House for sale in Pune']")
	private WebElement homeForSale;

	public WebElement getHomeForSale() {
		return homeForSale;
	}
	
	@FindBy(xpath = "(//div[text()='Top Localities'])[1]")
	private WebElement topLocalities;

	public WebElement getTopLocalities() {
		return topLocalities;
	}

	@FindBy(xpath = "//label[text()='Kalyani Nagar']")
	private WebElement kalyaniNagar;

	public WebElement getKalyaniNagar() {
		return kalyaniNagar;
	}

	@FindBy(xpath = "//label[text()='NIBM Road']")
	private WebElement nibmRoad;

	public WebElement getNibmRoad() {
		return nibmRoad;
	}

	@FindBy(xpath = "//label[text()='Viman Nagar']")
	private WebElement vimanNagar;

	public WebElement getVimanNagar() {
		return vimanNagar;
	}

}
