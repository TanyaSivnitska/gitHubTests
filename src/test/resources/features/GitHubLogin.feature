Feature: GitHub login test

  @smoke
  Scenario: GitHub login test
    Given open GitHub page
    When open login form
    And login to GitHub
    Then check Repository Page is opened
    And Sign out from GitHub