Feature: Search Taxi
  As a user of Booking
  I need to find to taxi for airport
  For my next job trip


  @CarForSixWithSpecialAARPRate
  Scenario: Search a taxi to the airport
    Given The user is on the website of the reservation page and enters the data to search for a taxi
      | pickup                           | destination                                    | date           |  pickUpTime | passengers|
      | Hotel Dann Carlton Medellín      | Aeropuerto Internacional José María Córdova    | 26, Julio 2021 |  18         |  3        |
    When he need Add you return date 3, August 2021
    Then he can see the total price