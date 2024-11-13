package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.BackGroundPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackGround {
	
	WebDriver driver = DriverFactory.getDriver();
	BackGroundPage backGroundPage = new BackGroundPage(driver);
	WebDriverUtility web = new WebDriverUtility();
	FileUtility file = new FileUtility();

	@When("user should be able to click on budget in buy link")
	public void user_should_be_able_to_click_on_budget_in_buy_link() throws InterruptedException {
//	    backGroundPage.getBudget().click();
		web.javascriptClick(driver, backGroundPage.getBudget());
	    Thread.sleep(5000);
	    Reporter.log("user should be able to click on budget in buy link", true);
	}

	@When("user should be able to navigate to properties page")
	public void user_should_be_able_to_navigate_to_properties_page() throws Exception {
	    web.switchToTabOnUrl(driver, file.getDataFromPropertiesFiles("budgetURL"));
	    Reporter.log("user should be able to navigate to properties page", true);
	    Thread.sleep(5000);
	}

	@When("user should be able to click on posted by filter")
	public void user_should_be_able_to_click_on_posted_by_filter() throws InterruptedException {
	    backGroundPage.getPostedBY().click();
	    Thread.sleep(5000);
	    Reporter.log("user should be able to click on posted by filter", true);
	}

	@When("user should select owners and click on done")
	public void user_should_select_owners_and_click_on_done() throws InterruptedException {
		backGroundPage.getOwners().click();
		Thread.sleep(5000);
		backGroundPage.getPostedByDone().click();
		Reporter.log("user should select owners and click on done");
	}

	@When("user should be able to select any one property provided below based on the given type")
	public void user_should_be_able_to_select_any_one_property_provided_below_based_on_the_given_type() throws InterruptedException {
	    backGroundPage.getPropertySale().click();
	    Thread.sleep(5000);
	    Reporter.log("user should be able to select any one property provided below based on the given type");
	}

	@Then("user is navigated to the required property page")
	public void user_is_navigated_to_the_required_property_page() throws Exception {
	    web.switchToTabOnTitle(driver, file.getDataFromPropertiesFiles("bGpropertySaleTitle"));
	    Reporter.log("user is navigated to the required property page", true);
	    Thread.sleep(5000);
	}

	@When("user should select brokers and click on done")
	public void user_should_select_brokers_and_click_on_done() throws InterruptedException {
	    backGroundPage.getBrokers().click();
	    Thread.sleep(5000);
	    backGroundPage.getPostedByDone().click();
	    Reporter.log("user should select brokers and click on done", true);
	}

	@When("user should select developer and click on done")
	public void user_should_select_developer_and_click_on_done() throws InterruptedException {
		backGroundPage.getDeveloper().click();
		Thread.sleep(5000);
		backGroundPage.getPostedByDone().click();
		Reporter.log("user should select developer and click on done");
	}
}
