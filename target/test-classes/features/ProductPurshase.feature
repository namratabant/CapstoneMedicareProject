
Feature: Product Purchase

  Background: Launch the browser
    When I have opened the mediCare application in browser
    And click on login link
    When user enters username as "kn@gmail.com" and password as "12345"
    And click on the login button
    @Regression
  Scenario: Adding products to the cart
    When user click on View Products tab
    And click on cart icon of the selected product
    And click on Continue shopping button
    Then user goes back to products page
    When user click on cart icon
    And click on checkout button
    Then check shipping address and click on select button
    And provide Card number expiry date and CVV code
    And click on Pay button
    Then user should get the confirmation message "Your Order is Confirmed!!"