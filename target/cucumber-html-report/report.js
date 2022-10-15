$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/featureFiles/CreateBooking.feature");
formatter.feature({
  "name": "Verify that the create booking API is working fine",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "verify if booking is being successfully added using CreateBookingAPI",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Add booking payload with \u0027\u003cfirstname\u003e\u0027 \u0027\u003clastname\u003e\u0027 \u0027\u003ctotalprice\u003e\u0027 \u0027\u003cdepositpaid\u003e\u0027 \u0027\u003ccheckin\u003e\u0027 \u0027\u003ccheckout\u003e\u0027 \u0027\u003cadditionalneeds\u003e\u0027 booking api",
  "keyword": "Given "
});
formatter.step({
  "name": "the user \u0027\u003cRequest\u003e\u0027 for create a booking api",
  "keyword": "When "
});
formatter.step({
  "name": "the API call is success with status code 200",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "totalprice",
        "depositpaid",
        "checkin",
        "checkout",
        "additionalneeds"
      ]
    },
    {
      "cells": [
        "Arslan",
        "Noor",
        "100",
        "true",
        "2018-01-01",
        "2019-01-01",
        "Breakfast"
      ]
    },
    {
      "cells": [
        "Arslan",
        "Noor",
        "100",
        "1",
        "2018-01-01",
        "2019-01-01",
        "Breakfast"
      ]
    }
  ]
});
formatter.scenario({
  "name": "verify if booking is being successfully added using CreateBookingAPI",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Add booking payload with \u0027Arslan\u0027 \u0027Noor\u0027 \u0027100\u0027 \u0027true\u0027 \u00272018-01-01\u0027 \u00272019-01-01\u0027 \u0027Breakfast\u0027 booking api",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateBookingStepDefination.add_Booking(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user \u0027\u003cRequest\u003e\u0027 for create a booking api",
  "keyword": "When "
});
formatter.match({
  "location": "CreateBookingStepDefination.user_Send_Request(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API call is success with status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateBookingStepDefination.api_call_success(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify if booking is being successfully added using CreateBookingAPI",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Add booking payload with \u0027Arslan\u0027 \u0027Noor\u0027 \u0027100\u0027 \u00271\u0027 \u00272018-01-01\u0027 \u00272019-01-01\u0027 \u0027Breakfast\u0027 booking api",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateBookingStepDefination.add_Booking(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user \u0027\u003cRequest\u003e\u0027 for create a booking api",
  "keyword": "When "
});
formatter.match({
  "location": "CreateBookingStepDefination.user_Send_Request(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API call is success with status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateBookingStepDefination.api_call_success(Integer)"
});
formatter.result({
  "status": "passed"
});
});