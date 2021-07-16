Feature: Change language of page
  As a user of the Booking page
  I want change language of page
  To validate content in different languages

  Background:
    Given The user in the Booking website

  @manual-result:passed
  Scenario Outline: Change languages
    When The user change <languages>
    Then User will be able to see specific language change

    Examples:
      | languages    |
      | English (US) |
      | Deutsch      |
      | Nederlands   |