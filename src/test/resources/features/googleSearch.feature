Feature: Google search functionality
  Agile Story: As a user, when im on the google
  search page, I should be able to search whatever
  I want, and see relevant information

  Scenario: Search page title verification
    Given User is on Google home page
    Then User should see title is Google




@google
  Scenario: User search title verification
    Given User is on Google home page
    When User searches for "woodenspoon"
    Then User should see "something else" in the title
