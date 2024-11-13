Feature: Property type House Filtering

Scenario Outline: Validate user should be able to filter the properties for house in property type
Given Browser should be launched and URL should be navigated
When user should be able to mouse hover on location 
And click on pune city
And user should be able to mouse hover on Buy link
And user should be able to click on House for sale in buy link
And user should be able to navigate to house for sale page 
And user should click on top localities
Then the user should select <Locality> from the top localities filter


Examples:
|   Locality   |
|      1       |
|      2       |
|      3       |