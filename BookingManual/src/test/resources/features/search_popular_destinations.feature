Feature: Find popular destinations
  As a user of the Booking website
  I need to see the most popular destinations
  for my next travel in the family

  Background:
    Given The user on the main page and visualize the places to be inspired for the next trip

  @manual-result:passed
  @PlacesColombia
  Scenario: Visualize the most special places in Colombia
    When he select the accommodations in Colombia that offer a private pool
    Then You can see the list of cities in detail

  @manual-result:passed
  @PlacesEuropa
  Scenario: Visualize the most special places in Europa
    When he select the accommodations in Europa that offering lakes and forests
    Then You can see the list of cities in detail
