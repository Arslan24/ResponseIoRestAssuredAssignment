Feature: Verify that the create booking API is working fine

  Scenario Outline: verify if booking is being successfully added using CreateBookingAPI
    Given Add booking payload with '<firstname>' '<lastname>' '<totalprice>' '<depositpaid>' '<checkin>' '<checkout>' '<additionalneeds>' booking api
    When the user '<Request>' for create a booking api
    Then the API call is success with status code 200

    Examples: 
      | firstname | lastname | totalprice | depositpaid | checkin    | checkout   | additionalneeds |
      | Arslan    | Noor     |        100 | true        | 2018-01-01 | 2019-01-01 | Breakfast       |
      | Arslan    | Noor     |        100 |           1 | 2018-01-01 | 2019-01-01 | Breakfast       |
