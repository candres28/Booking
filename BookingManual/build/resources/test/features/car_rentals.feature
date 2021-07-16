Feature: Search a car to rent
  As a user of the Booking website
  I need to search a car to rent
  For my next travel

  @manual-result:passed
  @RentCarAndDriver3065Years
  Scenario: Rent a car and the age of the driver is between 30-65 years
    Given The user in the Booking website
    When the User enters the search parameters
    Then you will be able to validate the car options available

  @manual-result:passed
  @RentCarAndDriverAgeRandom
  Scenario: Rent a car and the age of the driver is random
    Given The user in the Booking website and changes the language option to Italiano
    When the User enters the search parameters with age is random
    Then you will be able to validate the car options available