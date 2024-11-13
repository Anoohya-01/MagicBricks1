Feature: Buy

Scenario: Validate that the user should be able to mouse hover on Buy link

Given Browser should be launched and URL should be navigated
When user should be able to mouse hover on location 
And click on pune city
And user should be able to mouse hover on Buy link
Then user should be able to see sub-options in Buy link should be displayed
And Browser should be closed