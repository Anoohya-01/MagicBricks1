package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BackGroundPage {

	public BackGroundPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='₹ 50 Lac - ₹ 1 Cr']")
	private WebElement budget;

	public WebElement getBudget() {
		return budget;
	}
	
	@FindBy(xpath = "(//div[text()='Posted By'])[1]")
	private WebElement postedBY;

	public WebElement getPostedBY() {
		return postedBY;
	}
	
	@FindBy(xpath = "(//label[text()='Owners'])[1]")
	private WebElement owners;

	public WebElement getOwners() {
		return owners;
	}
	
	@FindBy(xpath = "(//div[text()='Done'])[6]")
	private WebElement postedByDone;

	public WebElement getPostedByDone() {
		return postedByDone;
	}
	
	@FindBy(xpath = "(//h2[@class='mb-srp__card--title'])[1]")
	private WebElement propertySale;

	public WebElement getPropertySale() {
		return propertySale;
	}
	
	@FindBy(xpath = "//label[text()='Brokers']")
	private WebElement brokers;

	public WebElement getBrokers() {
		return brokers;
	}
	
	@FindBy(xpath = "//label[text()='Developer']")
	private WebElement developer;

	public WebElement getDeveloper() {
		return developer;
	}
}
