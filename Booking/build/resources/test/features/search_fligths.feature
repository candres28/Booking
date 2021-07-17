Feature: Search flights
  As a Booking user
  I need to find a flights
  For my next trip to Tourist

  @SearchFlight
  Scenario: Find my outbound flight for my tourist trip
    Given The user is on the Booking Webpage in the flights option and enters the search parameters
      | from | to  | option   | type             | date           |
      | MDE  | DXB | Solo ida | Turista superior | agosto-30-2021 |
    When he enters filters for Precio
    Then you can see the list of options and the Ver oferta button