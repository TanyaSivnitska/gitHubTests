Feature: GitHub Search Repository test

  @smoke
  Scenario: GitHub search repository test
    Given open GitHub page
    When open login form
    And login to GitHub
    Then check Repository Page is opened
    And check needed repository is present
    And Sign out from GitHub
