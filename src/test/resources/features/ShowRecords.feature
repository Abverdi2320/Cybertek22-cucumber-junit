
Feature: Show Records



  Scenario: Verify default values in users page
    When User clicks "Users" link
    And Show records value should be 10
    Then show records should have following options:
      | 5   |
      | 10  |
      | 15  |
      | 50  |
      | 100 |
      | 200 |
      | 500 |