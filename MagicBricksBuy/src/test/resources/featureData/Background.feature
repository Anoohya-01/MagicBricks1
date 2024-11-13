Feature: Property Filtering

Background:
Given Browser should be launched and URL should be navigated
When user should be able to mouse hover on location 
And click on pune city
And user should be able to mouse hover on Buy link
And user should be able to click on budget in buy link
And user should be able to navigate to properties page 
And user should be able to click on posted by filter


Scenario: Validate user can access properties filtered by owners option
And user should select owners and click on done
And user should be able to select any one property provided below based on the given type
Then user is navigated to the required property page


Scenario: Validate user can access properties filtered by brokers option
And user should select brokers and click on done
And user should be able to select any one property provided below based on the given type
Then user is navigated to the required property page


Scenario: Validate user can access properties filtered by developer option
And user should select developer and click on done
And user should be able to select any one property provided below based on the given type
Then user is navigated to the required property page

