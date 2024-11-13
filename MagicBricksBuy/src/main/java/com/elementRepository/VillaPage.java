package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VillaPage {

	public VillaPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
     }
	
	@FindBy(xpath = "//a[text()='Villa in Pune']")
	private WebElement villaSale;

	public WebElement getVillaSale() {
		return villaSale;
	}
	
	@FindBy(xpath = "//a[text()='New Projects']")
	private WebElement newProjects;

	public WebElement getNewProjects() {
		return newProjects;
	}
	
	@FindBy(xpath = "//div[text()='Project Directory']")
	private WebElement projectDirectory;

	public WebElement getProjectDirectory() {
		return projectDirectory;
	}
	
	@FindBy(xpath = "//div[text()='Filters']")
	private WebElement filters;

	public WebElement getFilters() {
		return filters;
	}
	
	@FindBy(xpath = "//div[@class='search-filter__city']")
	private WebElement filtersSearch;

	public WebElement getFiltersSearch() {
		return filtersSearch;
	}
	
	@FindBy(xpath = "//div[text()='Thane']")
	private WebElement SearchThane;

	public WebElement getSearchThane() {
		return SearchThane;
	}
	
	@FindBy(xpath = "//label[text()='2 BHK']")
	private WebElement SearchBHK;

	public WebElement getSearchBHK() {
		return SearchBHK;
	}
	
	@FindBy(xpath = "(//div[contains(text(),'View')])[1]")
	private WebElement SearchView;

	public WebElement getSearchView() {
		return SearchView;
	}
	
	@FindBy(xpath = "//div[text()='Ready To Move']")
	private WebElement ReadyToMove;

	public WebElement getReadyToMove() {
		return ReadyToMove;
	}
	
	@FindBy(xpath = "(//div[@class='mghome__prjblk__imgsec  '])[1]")
	private WebElement newProjectInThane;

	public WebElement getNewProjectInThane() {
		return newProjectInThane;
	}
	
}
