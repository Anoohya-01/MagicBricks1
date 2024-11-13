package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.elementRepository.SignUpPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUp {

		WebDriver driver = DriverFactory.getDriver();
		WebDriverUtility utility = new WebDriverUtility();
		SignUpPage signUpPage = new SignUpPage(driver);

		@When("The user should be able to hover on login link and click on sign up link")
		public void the_user_should_be_able_to_hover_on_login_link_and_click_on_sign_up_link() throws InterruptedException {
			utility.mouseHover(driver, signUpPage.getGetLoginLink());
			Thread.sleep(1000);
			signUpPage.getGetSignUpLink().click();
			Reporter.log("The user should be able to hover on login link", true);
		}

		@When("Click on main sign up link")
		public void click_on_main_sign_up_link() {
			utility.switchToTabOnTitle(driver, "User Login");
			    signUpPage.getGetMainSignUpLink().click();
			}
		@When("Enter the valid credentials")
		public void enter_the_valid_credentials() throws InterruptedException {
			signUpPage.getGetRadioLink().click();
			signUpPage.getGetNameTextField().sendKeys("Anoohya");
			signUpPage.getGetEmailTextField().sendKeys("anoohyanelapudi@gmail.com");
			signUpPage.getGetPasswordTextField().sendKeys("Anoohya_01");
			signUpPage.getGetMobileTextField().sendKeys("7095612769");
			signUpPage.getGetCheckboxField().click();
			signUpPage.getGetCaptchaField().click();
			Thread.sleep(3000);
		}

		@When("Click on sign up button")
		public void click_on_sign_up_button() {
			signUpPage.getGetSignUpButton().click();
		}

		@When("Enter the otp that is generated to the mobile number given")
		public void enter_the_otp_that_is_generated_to_the_mobile_number_given() throws InterruptedException {
			Thread.sleep(15000);
		}

		@Then("Click on continue button")
		public void click_on_continue_button() {
			signUpPage.getGetContinueButton().click();
		}



}
