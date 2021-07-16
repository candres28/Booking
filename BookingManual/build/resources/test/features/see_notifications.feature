Feature: View my notifications
  As a user of the Booking page
  I want to see my notifications
  To be visualize the best offers offered

  Background:
    Given The user in the Booking website and successfully logged in

  @manual-result:passed
  @ViewNotifications
  Scenario: View my notifications
    When User logs in with correct credentials
    Then I can see the number of unread notifications