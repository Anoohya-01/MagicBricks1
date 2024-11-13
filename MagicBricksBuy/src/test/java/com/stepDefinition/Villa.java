package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.VillaPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Villa {
	
	WebDriver driver = DriverFactory.getDriver();
	VillaPage villaPage = new VillaPage(driver);
	WebDriverUtility web = new WebDriverUtility();
	FileUtility file = new FileUtility();

	@When("user should be able to click on villa in buy link")
	public void user_should_be_able_to_click_on_villa_in_buy_link() throws InterruptedException {
//	    villaPage.getVillaSale().click();
		web.javascriptClick(driver,  villaPage.getVillaSale());
	    Thread.sleep(3000);
	    Reporter.log("user should be able to click on villa in buy link", true);
	}

	@When("user should be able to navigate to villa page")
	public void user_should_be_able_to_navigate_to_villa_page() throws Exception {
	    web.switchToTabOnTitle(driver, file.getDataFromPropertiesFiles("villaInPune"));
	    Thread.sleep(3000);
	    Reporter.log("user should be able to navigate to villa page", true);
	}

	@When("user should be able to click on new projects")
	public void user_should_be_able_to_click_on_new_projects() throws InterruptedException {
	    villaPage.getNewProjects().click();
	    Thread.sleep(2000);
	    Reporter.log("user should be able to click on new projects", true);
	}

	@When("user is navigated to new projects page")
	public void user_is_navigated_to_new_projects_page() throws Exception {
		web.switchToTabOnTitle(driver, file.getDataFromPropertiesFiles("projectInPune"));
	    Thread.sleep(3000);
	    Reporter.log("user is navigated to new projects page", true);
	}

	@When("user should click on project directory and it displays all new projects")
	public void user_should_click_on_project_directory_and_it_displays_all_new_projects() throws InterruptedException {
	    villaPage.getProjectDirectory().click();
	    Thread.sleep(2000);
	    Reporter.log("user should click on project directory and it displays all new projects", true);
	}

	@When("user should click on filter and click on select city")
	public void user_should_click_on_filter_and_click_on_select_city() throws InterruptedException {
	    villaPage.getFilters().click();
	    Thread.sleep(3000);
	    villaPage.getFiltersSearch().click();
	    Thread.sleep(2000);
	    villaPage.getSearchThane().click();
	    Thread.sleep(3000);
	    Reporter.log("user should click on filter and click on select city", true);
	}

	@When("user should select BHK and click on view projects and it displays hotspots")
	public void user_should_select_rest_of_mumbai_hotspots_and_click_on_view_projects_and_it_displays_hotspots() throws InterruptedException {
	    villaPage.getSearchBHK().click();
	    Thread.sleep(3000);
	    villaPage.getSearchView().click();
	    Thread.sleep(3000);
	    Reporter.log("user should select BHK and click on view projects and it displays hotspots", true);
	}

	@When("user should click on ready to move and select any one hotspots provided below")
	public void user_should_click_on_ready_to_move_and_select_any_one_hotspots_provided_below() throws InterruptedException {
	    villaPage.getReadyToMove().click();
	    Thread.sleep(3000);
	    villaPage.getNewProjectInThane().click();
	    Thread.sleep(3000);
	    Reporter.log("user should click on ready to move and select any one hotspots provided below", true);
	}

	@Then("user is navigated to the new hotspots property page")
	public void user_is_navigated_to_the_new_hotspots_property_page() throws Exception {
		web.switchToTabOnTitle(driver, file.getDataFromPropertiesFiles("projectInThane"));
	    Thread.sleep(3000);
	    Reporter.log("user is navigated to the new hotspots property page", true);

	}

}
