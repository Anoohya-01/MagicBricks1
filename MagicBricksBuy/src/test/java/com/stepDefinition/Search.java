package com.stepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.SearchPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	
	WebDriver driver = DriverFactory.getDriver();
	SearchPage searchPage = new SearchPage(driver);
	FileUtility file = new FileUtility();
	WebDriverUtility web = new WebDriverUtility();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));

	@When("user should be able to click on House for sale in buy link")
	public void user_should_be_able_to_click_on_house_for_sale_in_buy_link() throws InterruptedException {
		Thread.sleep(6000);
//		wait.until(ExpectedConditions.elementToBeClickable(searchPage.getHomeForSale())).click();
//		searchPage.getHomeForSale().click();
		web.javascriptClick(driver, searchPage.getHomeForSale());
	    web.switchToTabOnTitle(driver, "House for Sale in Pune: 1764+ Independent House for Sale in Pune");
	    Thread.sleep(5000);
	    Reporter.log("user should be able to click on House for sale in buy link", true);
	}

	@When("user should be able to navigate to house for sale page")
	public void user_should_be_able_to_navigate_to_house_for_sale_page() throws Exception {
		web.switchToTabOnTitle(driver, file.getDataFromPropertiesFiles("searchHouseSaleTitle"));
	    Reporter.log("User should be able to navigate to house for sale page", true);
	    Thread.sleep(5000);
	}
	
	@When("user should click on top localities")
	public void user_should_click_on_top_localities() throws InterruptedException {
	   searchPage.getTopLocalities().click();
	   Thread.sleep(5000);
	   Reporter.log("user should click on top localities");
	}

	@Then("the user should select {int} from the top localities filter")
	public void the_user_should_select_from_the_top_localities_filter(Integer Locality) throws Exception {
		String dropdown = file.getDataFromExcel("Sheet1", Locality, 0);
		switch (dropdown) {
		case "Kalyani Nagar":
			searchPage.getKalyaniNagar().click();
			Assert.assertTrue(searchPage.getKalyaniNagar().isEnabled());
			Reporter.log("Kalyani Nagar option selected");
			break;
			
		case "NIBM Road":
			searchPage.getNibmRoad().click();
			Assert.assertTrue(searchPage.getNibmRoad().isEnabled());
			Reporter.log("NIBM Road option selected");
			break;
			
		case "Viman Nagar":
			searchPage.getVimanNagar().click();
			Assert.assertTrue(searchPage.getVimanNagar().isEnabled());
			Reporter.log("Viman Nagar option selected");
			break;
		}
		
	    
	}
}
