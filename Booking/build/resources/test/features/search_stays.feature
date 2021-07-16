Feature: Search Stays
  As a Booking user
  I need to find a hotel to stay
  For my next trip

  Scenario: Search hotel deals for accommodation
    Given The user is on the Booking Webpage in the accommodation option and enters the search parameters
      | destination                          | checkin    | checkout   |
      | San Andrés, Islas Canarias, España   | 2021-07-18 | 2021-08-02 |
    When he enters filters for points Muy bien and Menos de 3 km
    Then you can see the list of filtered options encontrado
