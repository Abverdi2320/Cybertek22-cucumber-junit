
Feature: Vytrack login functionality
  Agile Story: As a user, I want to Log in to VyTrack Application,
  so that I have access to my account.


  @TruckDriver
  Scenario: Login as Truck Driver
    Given user is on the Vytrack login page
    When user enters valid username
    And user enters valid password
    Then user should see the dashboard

    @StoreManager
    Scenario: Login as Store Manager
      Given user is on the login page
      When user enters valid username
      And user enters valid password
      Then user should see the dashboard


  @SalesManager
  Scenario: Login as Sales Manager
    Given user is on the login page
    When user enters valid username
    And user enters valid password
    Then user should see the dashboard



