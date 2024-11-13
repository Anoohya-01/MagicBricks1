Feature: Office Space

Scenario: Validate user is able to navigate to office space property for sale with the given location.

Given Browser should be launched and URL should be navigated
When user should be able to mouse hover on location 
And click on pune city
And user should be able to mouse hover on Buy link
And user should be able to click on office space in buy link
And user should be able to navigate to office space page
Then user should be able to click on property 
And user should be able to navigate to office space for sale page
And Browser should be closed