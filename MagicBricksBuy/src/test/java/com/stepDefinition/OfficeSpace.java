package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.OfficePage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OfficeSpace {

	WebDriver driver = DriverFactory.getDriver();
	OfficePage officePage = new OfficePage(driver);
	WebDriverUtility utility = new WebDriverUtility();
	FileUtility file = new FileUtility();

	@When("user should be able to click on office space in buy link")
	public void user_should_be_able_to_click_on_office_space_in_buy_link() throws Exception {
		officePage.getOfficeSpace().click();
		utility.switchToTabOnTitle(driver, file.getDataFromPropertiesFiles("officeTitle"));
		Thread.sleep(4000);
		Reporter.log("User should be able to click on office space", true);
	}

	@When("user should be able to navigate to office space page")
	public void user_should_be_able_to_navigate_to_office_space_page(){
//		Assert.assertTrue(officePage.getDisplayLink().isDisplayed());
		Reporter.log("user should be able to navigate to office space", true);
	}

	@When("user should be able to click on property")
	public void user_should_be_able_to_click_on_property() throws Exception {
		utility.switchToTabOnTitle(driver, "Office Space For sale in Pune | MagicBricks");
		officePage.getPropLink().click();
		utility.switchToTabOnTitle(driver, file.getDataFromPropertiesFiles("propTitle"));
		Thread.sleep(3000);
		Reporter.log("user should be able to click on property",true);
	}

	@Then("user should be able to navigate to office space for sale page")
	public void user_should_be_able_to_navigate_to_office_space_for_sale_page() throws Exception {
		utility.switchToTabOnTitle(driver, file.getDataFromPropertiesFiles("officeSaleTitle"));
		Reporter.log("user should be able to navigate to office space for sale page",true);
	}
}
