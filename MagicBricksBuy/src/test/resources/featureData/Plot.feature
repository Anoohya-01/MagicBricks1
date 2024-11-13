Feature: Plot

Scenario: Validate user is able to navigate to plot property with the given location.

Given Browser should be launched and URL should be navigated
When user should be able to mouse hover on location 
And click on pune city
And user should be able to mouse hover on Buy link
And user should be able to click on plot in buy link
And user should be able to navigate to plot page 
And user should be able to click on top localities
And select one in the preferred locations and click on done
And user should be able to select any one plotland provided below based on the given type
Then user is navigated to the required plotland page

				