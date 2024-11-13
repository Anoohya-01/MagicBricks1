package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.HomePage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyHover {
	WebDriver driver = DriverFactory.getDriver();
	HomePage homePage = new HomePage(driver);
	WebDriverUtility utility = new WebDriverUtility();

	@Given("Browser should be launched and URL should be navigated")
	public void browser_shuold_be_launched_and_url_should_be_navigated() throws Exception {
		FileUtility fileUtility = new FileUtility();
		String actualURL = driver.getCurrentUrl();
		String expectedURL = fileUtility.getDataFromPropertiesFiles("url");
		Assert.assertEquals(actualURL, expectedURL, "URL is not navigated");
		Reporter.log("The Browser should be launched and URL should be navigated", true);
	}

	@When("user should be able to mouse hover on location")
	public void user_should_be_able_to_mouse_hover_on_location() throws InterruptedException {
		utility.mouseHover(driver, homePage.getGetLocationLink());
		Thread.sleep(5000);
		Reporter.log("user should be able to mouse hover on location", true);
	}

	@When("click on pune city")
	public void click_on_pune_city() throws InterruptedException {
//	    homePage.getGetPuneLink().click();
		utility.javascriptClick(driver, homePage.getGetPuneLink());
		Thread.sleep(6000);
		Reporter.log("click on pune city", true);
	}

	@When("user should be able to mouse hover on Buy link")
	public void user_should_be_able_to_mouse_hover_on_buy_link() throws InterruptedException {
//		Thread.sleep(5000);
		utility.mouseHover(driver, homePage.getGetBuyLink());
		Thread.sleep(5000);
		Reporter.log("user should be able to mouse hover on Buy link", true);
	}

	@Then("user should be able to see sub-options in Buy link should be displayed")
	public void user_should_be_able_to_see_sub_options_in_buy_link_should_be_displayed() {
		homePage.getGetOptionLink().isDisplayed();
		Reporter.log("user should be able to see sub-options in Buy link should be displayed", true);
	}

	@Then("Browser should be closed")
	public void browser_should_be_closed() {
		Reporter.log("Browser should be closed", true);
	}

}
