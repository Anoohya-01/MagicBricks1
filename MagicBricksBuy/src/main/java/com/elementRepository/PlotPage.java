package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlotPage {

	public PlotPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
     }
	
	@FindBy(xpath = "//a[text()='Plot in Pune']")
	private WebElement getPlot;

	public WebElement getGetPlot() {
		return getPlot;
	}
	
	@FindBy(xpath = "(//div[text()='Top Localities'])[1]")
	private WebElement getTopLocalities;

	public WebElement getGetTopLocalities() {
		return getTopLocalities;
	}
	
	@FindBy(xpath = "//label[text()='Pune - Mumbai IT Corridor']")
	private WebElement getTopLocalityCity;

	public WebElement getGetTopLocalityCity() {
		return getTopLocalityCity;
	}
	
	@FindBy(xpath = "//div[@class='filter__component topZone activeFilter']//div[text()='Done']")
	private WebElement getTopLocalitiesDone;

	public WebElement getGetTopLocalitiesDone() {
		return getTopLocalitiesDone;
	}
	
	@FindBy(xpath = "(//h2[@class='mb-srp__card--title'])[1]")
	private WebElement getPlotSale;

	public WebElement getGetPlotSale() {
		return getPlotSale;
	}
	
	
	
	
}
