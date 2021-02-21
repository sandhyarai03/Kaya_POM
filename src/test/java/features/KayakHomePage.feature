Feature: Kayak Flight search feature

Scenario Outline: Flight search functionality
Given user is on Kayak Application
When user clicks on Flight button
And user enter the "<originCityAirport>" also selects the nearAll airport
And user enters the"<destinationCityAirport>" and selects the nearAll airport
And user selects the startDate and endDate
And user clicks on search button
And user unselects the two Stop Option
Then user should be able to see the search result based on "<originCityCode>" and "<destinationCityCode>"

Examples:

| originCityAirport          | destinationCityAirport |  originCityCode| destinationCityCode |
| San Francisco (SFO)     | Hyderabad (HYD)      | SFO                |  HYD                       |
#| San Diego (SAN)     		| New Delhi (DEL)        | SAN                |  DEL                       |
