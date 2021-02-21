$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("KayakHomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Kayak Flight search feature",
  "description": "",
  "id": "kayak-flight-search-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Flight search functionality",
  "description": "",
  "id": "kayak-flight-search-feature;flight-search-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is on Kayak Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on Flight button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter the \"\u003coriginCityAirport\u003e\" also selects the nearAll airport",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user enters the\"\u003cdestinationCityAirport\u003e\" and selects the nearAll airport",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user selects the startDate and endDate",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user clicks on search button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user unselects the two Stop Option",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user should be able to see the search result based on \"\u003coriginCityCode\u003e\" and \"\u003cdestinationCityCode\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "kayak-flight-search-feature;flight-search-functionality;",
  "rows": [
    {
      "cells": [
        "originCityAirport",
        "destinationCityAirport",
        "originCityCode",
        "destinationCityCode"
      ],
      "line": 15,
      "id": "kayak-flight-search-feature;flight-search-functionality;;1"
    },
    {
      "cells": [
        "San Francisco (SFO)",
        "Hyderabad (HYD)",
        "SFO",
        "HYD"
      ],
      "line": 16,
      "id": "kayak-flight-search-feature;flight-search-functionality;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2039009228,
  "status": "passed"
});
formatter.before({
  "duration": 3865934511,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Flight search functionality",
  "description": "",
  "id": "kayak-flight-search-feature;flight-search-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is on Kayak Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on Flight button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter the \"San Francisco (SFO)\" also selects the nearAll airport",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user enters the\"Hyderabad (HYD)\" and selects the nearAll airport",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user selects the startDate and endDate",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user clicks on search button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user unselects the two Stop Option",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user should be able to see the search result based on \"SFO\" and \"HYD\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "KayakStepDefTest.user_is_on_Kayak_Application()"
});
formatter.result({
  "duration": 80512894,
  "status": "passed"
});
formatter.match({
  "location": "KayakStepDefTest.user_clicks_on_Flight_button()"
});
formatter.result({
  "duration": 736509589,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "San Francisco (SFO)",
      "offset": 16
    }
  ],
  "location": "KayakStepDefTest.user_enter_the_also_selects_the_nearAll_airport(String)"
});
formatter.result({
  "duration": 2684485111,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hyderabad (HYD)",
      "offset": 16
    }
  ],
  "location": "KayakStepDefTest.user_enters_the_and_selects_the_nearAll_airport(String)"
});
formatter.result({
  "duration": 1423854645,
  "status": "passed"
});
formatter.match({
  "location": "KayakStepDefTest.user_selects_the_startDate_and_endDate()"
});
formatter.result({
  "duration": 1648365417,
  "status": "passed"
});
formatter.match({
  "location": "KayakStepDefTest.user_clicks_on_search_button()"
});
formatter.result({
  "duration": 3557943805,
  "status": "passed"
});
formatter.match({
  "location": "KayakStepDefTest.user_unselects_the_two_Stop_Option()"
});
formatter.result({
  "duration": 383217896,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SFO",
      "offset": 55
    },
    {
      "val": "HYD",
      "offset": 65
    }
  ],
  "location": "KayakStepDefTest.user_should_be_able_to_see_the_search_result_based_on_and(String,String)"
});
formatter.result({
  "duration": 276624614,
  "status": "passed"
});
formatter.after({
  "duration": 128724561,
  "status": "passed"
});
formatter.after({
  "duration": 54863,
  "status": "passed"
});
});