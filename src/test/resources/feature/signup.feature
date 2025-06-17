Feature: Sign Up Demo blaze
  Scenario: Sign Up with valid Credentials
    Given User is in home Page
    When user click sign Up Button
    And fill the username textbox with "adminRaize12"
    And i fill the password textbox with "admin123"
    And I click on the Sign Up Button
    Then I should see Message "Sign up successful."
