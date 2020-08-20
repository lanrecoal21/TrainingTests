@ignore
Feature: Retrieve Forgotten Password

  Scenario: User should be able to recover forgotten password

    Given I am on the app homepage
    And I click on the sign in link
    When I click on the Forgot your password link
    And I enter my email address
    When I click on the retrieve password button
    Then i should get a success message