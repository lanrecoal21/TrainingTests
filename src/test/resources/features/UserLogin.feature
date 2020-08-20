@ignore
Feature: Valid Login

  Scenario: User Should be able to login with valid credentials

    Given I successfully navigate to hompage
    When I Input my valid credentials
    And I click on the login button
    Then I should be logged in successfully
