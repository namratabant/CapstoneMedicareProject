@F_Login
Feature: This feature would be used to check the login functionality

  Background: Launch The browser
    When I have opened the mediCare application in browser
    And click on login link

  Scenario Outline: Validate the successful Login
    When I enter username "<username>" and password "<password>"
    And I click on the login Button
    Then I should be Landed on the products page

    Examples: 
      | username     | password |
      | kn@gmail.com |    12345 |
	
  Scenario Outline: Validate the Negative Login
    When I enter username "<username>" and password "<password>"
    And I click on the login Button
    Then I should get the error message "Username and Password is invalid!"

    Examples: 
      | username      | password |
      | kn1@gmail.com |   123456 |