package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.PlotPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Plot {
	
	WebDriver driver = DriverFactory.getDriver();
	PlotPage plotPage = new PlotPage(driver);
	WebDriverUtility utility = new WebDriverUtility();
	FileUtility file = new FileUtility();

	@When("user should be able to click on plot in buy link")
	public void user_should_be_able_to_click_on_plot_in_buy_link() throws InterruptedException {
		plotPage.getGetPlot().click();
		Thread.sleep(10000);
		Reporter.log("user should be able to click on plot in buy link", true);
	    
	}

	@When("user should be able to navigate to plot page")
	public void user_should_be_able_to_navigate_to_plot_page() throws Exception {
		utility.switchToTabOnTitle(driver, file.getDataFromPropertiesFiles("plotPageTitle"));
	    Reporter.log("User is navigated to plot page", true);
	    Thread.sleep(3000);
	}
	
	@When("user should be able to click on top localities")
	public void user_should_be_able_to_click_on_top_localities() throws InterruptedException {
	   plotPage.getGetTopLocalities().click();
	   Thread.sleep(3000);  
	   Reporter.log("user should be able to click on top localities", true);

	}

	@When("select one in the preferred locations and click on done")
	public void select_one_in_the_preferred_locations_and_click_on_done() throws InterruptedException {
	   plotPage.getGetTopLocalityCity().click();
	   Thread.sleep(3000);
	   Reporter.log("select one in the preferred locations and click on done", true);

	}


	@When("user should be able to select any one plotland provided below based on the given type")
	public void user_should_be_able_to_select_any_one_plot_land_provided_below_based_on_the_given_type() throws InterruptedException {
	   plotPage.getGetPlotSale().click();
	   Thread.sleep(3000);
	   Reporter.log("user should be able to select any one plotland provided below based on the given type", true);

	}

	@Then("user is navigated to the required plotland page")
	public void user_is_navigated_to_the_required_plot_land_page() throws Exception {
		utility.switchToTabOnTitle(driver, file.getDataFromPropertiesFiles("plotLandTitle"));
	    Reporter.log("User is navagited to the plot/land page", true);
	}
}
