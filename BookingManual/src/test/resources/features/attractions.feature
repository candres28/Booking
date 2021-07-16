Feature: Search tourist attractions
  As a user of the Booking website
  I need to search tourist attractions
  For my next trip

  Background:
    Given The user in the Booking website in the options attractions

  @manual-result:passed
  Scenario Outline: Search tourist attractions
    When The user search <attractions> for visit in the vacations
    Then The user will be able to see the information of the tourist site

    Examples:
      | attractions                       |
      | Reina Sofía Museum Admission      |
      | Museo de arte moderno de Medellin |
