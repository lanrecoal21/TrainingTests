@ignore
Feature: Create Multiple Users

  Scenario Outline: As an admin, I want to create multiple users

    Given Im on Homepage
    And I press sign in link
    And I enter "<email>" address
    And I enter all mandatory details
    When I click on the register button
    Then new user account should be successfully created


    Examples:
    | email                     |
    |lanreikuesanF1@gmail.com   |
    |lanreikuesanG1@gmail.com   |
    |lanreikuesanH1@gmail.com   |
    |lanreikuesanJ1@gmail.com   |
    |lanreikuesanK1@gmail.com   |