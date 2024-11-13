Feature: Villa

Scenario: Validate user is able to select new projecs in villa for sale 
Given Browser should be launched and URL should be navigated
When user should be able to mouse hover on location 
And click on pune city
And user should be able to mouse hover on Buy link
And user should be able to click on villa in buy link
And user should be able to navigate to villa page 
And user should be able to click on new projects 
And user is navigated to new projects page
And user should click on project directory and it displays all new projects
And user should click on filter and click on select city
And user should select BHK and click on view projects and it displays hotspots
And user should click on ready to move and select any one hotspots provided below
Then user is navigated to the new hotspots property page 

