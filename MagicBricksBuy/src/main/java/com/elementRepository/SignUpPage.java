package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

		public SignUpPage(WebDriver driver) {

			PageFactory.initElements(driver, this);	
		}
		
		@FindBy(xpath = "//div[@class='mb-header__main__login js-menu-container']/a[text()='Login']")
		private WebElement getLoginLink;
		
		@FindBy(xpath = "//a[text()='Sign Up']")
		private WebElement getSignUpLink;
		
		@FindBy(css = "div.signup__text a.signup__link")
		private WebElement getMainSignUpLink;
		
		@FindBy(xpath = "//label[contains(text(),'Buyer/Owner/Tenant')]")
		private WebElement getRadioLink;
		
		@FindBy(id = "regName")
		private WebElement getNameTextField;
		
		@FindBy(id = "regEmailid")
		private WebElement getEmailTextField;
		
		@FindBy(id = "regPassword")
		private WebElement getPasswordTextField;
		
		@FindBy(id = "regMobile")
		private WebElement getMobileTextField;
		
		@FindBy(id = "chk-TNC")
		private WebElement getCheckboxField;
		
		@FindBy(id = "captchaCodeRegistration")
		private WebElement getCaptchaField;
		
		@FindBy(xpath = "//button[contains(text(),'Sign Up')]")
		private WebElement getSignUpButton;
		
		@FindBy(xpath = "//button[@onclick='verifyOtp()']")
		private WebElement getContinueButton;

		public WebElement getGetLoginLink() {
			return getLoginLink;
		}

		public WebElement getGetSignUpLink() {
			return getSignUpLink;
		}

		public WebElement getGetMainSignUpLink() {
			return getMainSignUpLink;
		}

		public WebElement getGetRadioLink() {
			return getRadioLink;
		}

		public WebElement getGetNameTextField() {
			return getNameTextField;
		}

		public WebElement getGetEmailTextField() {
			return getEmailTextField;
		}

		public WebElement getGetPasswordTextField() {
			return getPasswordTextField;
		}

		public WebElement getGetMobileTextField() {
			return getMobileTextField;
		}

		public WebElement getGetCheckboxField() {
			return getCheckboxField;
		}

		public WebElement getGetCaptchaField() {
			return getCaptchaField;
		}

		public WebElement getGetSignUpButton() {
			return getSignUpButton;
		}

		public WebElement getGetContinueButton() {
			return getContinueButton;
		}

		
	}


