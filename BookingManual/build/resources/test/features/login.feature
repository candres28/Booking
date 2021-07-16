Feature: Login with my user
  As a user of the Booking page
  I want to log in
  To manage my user account

  Background:
    Given The user in the Booking website

  @manual-result:passed
  @SuccessfulLogin
  Scenario: Successful login
    When User logs in with correct credentials
    Then Successful login on the web page will be verified

  @manual-result:passed
  @FailedLogin
  Scenario: Failed login
    When User logs in with incorrect credentials
    Then he will verify that the data entered does not match