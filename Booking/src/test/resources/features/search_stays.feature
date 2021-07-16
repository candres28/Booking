Feature: Search Stays
  As a Booking user
  I need to find a hotel to stay
  For my next trip

  @SuccessfulStay
  Scenario: Search hotel deals for accommodation
    Given The user is on the Booking Webpage in the accommodation option and enters the search parameters
      | destination                        | checkin            | checkout        |
      | San Andrés, Islas Canarias, España | Septiembre-26-2021 | Octubre-10-2021 |
    When he enters points filters Precio (más bajo primero)
    Then you can see the list of filtered options encontrado

  @Max30days
  Scenario: Search hotel deals for accommodation for more than 30 days
    Given that the user is on the main page
    When The user is on the Booking Webpage in the accommodation option and enters the search parameters
      | destination                   | checkin       | checkout     |
      | Medellín, Antioquia, Colombia | agosto-7-2021 | Enero-2-2022 |
    Then he can see Lo sentimos, no es posible realizar reservas para más de 30 noches
