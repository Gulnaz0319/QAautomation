@test
Feature: Permissions for External Learning
  Scenario: Login to Admin Portal as an Assignment Administrator
    Given I am on the login page Pinnacle
      When I enter username
      And I enter password
      And I click sign in button
      Then the gear icon displays within the upper right-hand corner of my header toolbar
      And I click on the gear icon
      Then Administration Portal displays as a selectable option
      When I click on Administration Portal
      Then a secondary tab is launched and I am taken into the Administration Portal
      Then External Learning is displayed as a selectable option within the left-hand side menu
      When I click on External Learning
      Then The Records Management and Setup Options are displayed
      And I click on sign out

  Scenario: Login to Admin Portal a System Admin
    Given I am on the login page Pinnacle
    When I enter System Admin username
    And I enter password
    And I select Qa testing tenant
    And I click sign in button
    Then the gear icon displays within the upper right-hand corner of my header toolbar
    And I click on the gear icon
    Then Administration Portal displays as a selectable option
    When I click on Administration Portal
    Then a secondary tab is launched and I am taken into the Administration Portal
    When I click on Group tab
    And click on any group
    Then the "Edit Group" button is displayed
    When I click on "Edit Group" button
    Then there is new "Assignment Administrator" permission is displayed
    And I click on sign out

  Scenario: Login to Admin Portal as an Assignor
    Given I am on the login page Pinnacle
    When I enter Assignor username
    And I enter password
    And I click sign in button
    Then the gear icon displays within the upper right-hand corner of my header toolbar
    And I click on the gear icon
    Then Administration Portal displays as a selectable option
    When I click on Administration Portal
    Then a secondary tab is launched and I am taken into the Administration Portal
    Then External Learning is displayed as a selectable option within the left-hand side menu
    When I click on External Learning
    Then The Records Management is displayed
    And I click on sign out
#
#  Scenario:
#    Given I am on the login page Pinnacle
#    When I enter System Admin username
#    And I enter password
#    And I select Qa testing tenant
#    And I click sign in button
#    Then the gear icon displays within the upper right-hand corner of my header toolbar
#    And I click on the gear icon
#    When I click on Administration Portal
#    When I click on Group tab
#    When I select a Group that has Assignment Administrator permissions enabled
#    Then the "Edit Group" button is displayed
#    When I click on "Edit Group" button
#    And  the I disable the “Assignment Administrator” permission in the Group
#    And I click the Save Changes button
#    Then the changes are successfully saved and permission is disabled
#    And I click on sign out
