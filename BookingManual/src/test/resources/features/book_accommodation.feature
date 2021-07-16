Feature: Book accommodation on the Booking
  As a user of the Booking website
  I need to book accommodation
  for my next travel in the family

  Background:
    Given The user on the main page and selects getaway offers
    Then You can view the information and details to choose the plan of your choice

  @manual-result:passed
  @BookHotelTheBestOffer
  Scenario: Book Hotel with the best offer
    When he select the best getaway offer offered in Santa Marta

  @manual-result:passed
  @BookHotelPrice
  Scenario: Book hotel in maximum $ COP 20000
    When he selects the hotel option for price of $ 200000

  @manual-result:passed
  @BookHotelWith2RoomsAndKitchen
  Scenario: Book hotel with 2 rooms with kitchen
    When he select the filter to select 2 rooms and have a kitchen included