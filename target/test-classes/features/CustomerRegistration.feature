Feature: This feature would be used to add new user

  Background: Launch the browser
    When I have opened the mediCare application in browser
    And click on Sign Up link
@Sanity
  Scenario: Adding new customer
    When user enter all customer details
    And click on Next button
    When user enter sign up address details
    And click on Next-Confirm button
    Then user details will be displayed
    And click on confirm button
    Then user can see the confirmation message "You can use your email address as username to login!"
    