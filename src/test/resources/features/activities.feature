Feature: External Learning Activities tab
  Scenario:
    Given I am logged in the Pinnacle Home page as an Assignment Administrator
    When I click on the gear icon
    And  I click on Administration Portal
    And I navigate to External Learning
    And click on Setup
    Then New External Leaning Activities tab opens

  Scenario: Verify Activities tab
    Given I navigate to tooltip next to External Leaning Activities
    Then the text is shown
    When I navigate to column
    Then column headers are shown same as in Attributes in Attributes tab
    When I go to the last column
    Then the last column named Active

