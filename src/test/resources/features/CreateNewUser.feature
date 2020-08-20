@ignore
Feature: Create New User

Scenario: User should be able to register account

  Given I am on the application homescreen
  And I click on Sign In
  And I enter email address in the create account field
  And I click the create account button
  When I select gender
  And I enter my first name
  And I enter my last name
  #And I enter email in the email field
  And I enter my password
  When I enter first name for address
  And I enter  last name for address
  And I enter my address
  And I enter my city
  And I choose my state
  And I enter my postcode
  And I enter my mobile phone number
  And I enter my alias for address
  When I click the register button
  Then my account should be registered successfully