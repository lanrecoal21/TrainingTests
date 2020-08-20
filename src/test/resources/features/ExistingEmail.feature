@ignore
Feature: Create New User 2

  Scenario: Verify that a new user cannot be created with a pre existing email


    Given I am on the application homespage
    And I click on Sign in linktext
    And I enter  existing email address in the create account field
    When I click the create on account button
    Then I should get an error message