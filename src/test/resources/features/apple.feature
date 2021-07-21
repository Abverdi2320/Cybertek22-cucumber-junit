Feature: Apple search Functionality

@applewip
  Scenario: Apple Search Functionality Title Verification
    Given User is on Apple home page
    When User types "iphone 12" in the apple search box and click enter
    And User choose "iphone 12" from the list
    Then User sees "iPhone 12 Pro and iPhone 12 Pro Max - Apple" is in the apple title

