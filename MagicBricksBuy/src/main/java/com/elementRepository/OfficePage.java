package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OfficePage {

	public OfficePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "(//a[text()='Office Space in Pune'])[1]")
	private WebElement officeSpace;

	public WebElement getOfficeSpace() {
		return officeSpace;
	}
	
	@FindBy(xpath = "//div[text()='Sort by']")
	private WebElement displayLink;

	public WebElement getDisplayLink() {
		return displayLink;
	}

	@FindBy(xpath = "(//h2[@class='mb-srp__card--title'])[1]")
	private WebElement propLink;

	public WebElement getPropLink() {
		return propLink;
	}
	
//	@FindBy(xpath = "(//a[@class='mb-ldp__dtls__title--link'])[1]")
//	private WebElement displayLink1;
//
//	public WebElement getDisplayLink1() {
//		return displayLink1;
//	}
}
