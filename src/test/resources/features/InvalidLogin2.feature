@InvalidLogin2
Feature: InvalidLogin2

  Scenario Outline: Invalid login credentials should return error messages

    Given I am on the landing page
    And I press the SignIn link
#    When I enter username "<email>"
#    And I enter "<password>"
#    When I press login
#    Then I should get "<ErrorMessages>"

    Examples:
      |email                      |password                 |ErrorMessages               |
      |                           |training                 |An email address required.  |
      |lanre.ikuesan857@gmail.com |                         |Password is required.       |
      |                           |                         |An email address required.  |
      |lanre.ikuesan111@gmail.com |training                 |Authentication failed.      |
      |lanreikuesanA@gmail.com    |Julius                   |Authentication failed.      |