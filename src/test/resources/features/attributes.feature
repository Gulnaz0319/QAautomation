Feature: Attributes Tab
  Background: Verify
    Given I am logged in the Pinnacle Home page as an Assignment Administrator
    When I click on the gear icon
    And I click on Administration Portal
    When I click on External Learning
    And I click on Setup
    And I click on Attributes tab
    Then the External Learning Attributes page is successfully opens

    Scenario: Verify Attribute page tooltip
      Given I click on the tooltip icon next to External Learning Attributes tab
      Then the expected message is shown
      And I click on sign out

#    US 4737
  Scenario: Verify New Attribute entry row
    Given I click on Add Attribute button
    Then  cursor located in new Attribute name filed
    Then Attribute Name is blank by default
    When I navigate to Data type field
    Then the Data Type is Short for Text by Default
    Then I navigate to Save button and the Save button is disabled
    And I click on sign out

  Scenario: Verify Cancel button works
     Given I click on Add Attribute button
     When Attribute Name is blank by default
     And I click on the Cancel button
     Then the new Attribute row is closed and I remain on the Attributes tab
    And I click on sign out

   Scenario: Verify user can add new Attribute
     Given I click on Add Attribute button
     When I enter unique Attribute name
     And I select Long Form Text datatype
     And I click on save button
     Then new attribute remains on the Attributes tab
     And I click on sign out

   Scenario: Verify user is not able save with blank Attribute name filed
     Given I click on Add Attribute button
     When Attribute Name is blank by default
     And I select Long Form Text datatype
     Then the Save button is disabled
     And I click on sign out

   Scenario:
     Given I click on Add Attribute button
     When I enter existing Attribute Name to name filed
     And I select Long Form Text datatype
     And I click on the Save button
     Then an error message stating "Attribute Name and Data Type must be unique." is shown
     And I click on sign out

##  US 4736
  Scenario: Verify the Attribute is deleted
    Given I click the Delete icon next to non-mandatory Attribute with Activity Definition toggled OFF
    Then a warning modal is shown and there "Cancel" and "Delete" options are present
    And  I click on Delete button in the Warning popup message
    Then Attribute is a successfully deleted toast message shown and the Attribute is no longer displayed on the Attribute tab
#    When I navigate to Activities tab
#    When I select any activity and click on pencil icon
#    Then the Attribute is no longer displayed on Edit Activity modal
#    When I navigate to Pinnacle Home page
#    And I click on Submit New button
#    And I choose any Activity
#    Then the Attribute is no longer displayed on the submission form
#    Then the Attribute is no longer displayed on the end user widget
#    And I click on sign out
#
#  Scenario: Click on cancel button
#    Given I click on Cancel button in the Warning popup message
#    Then the Attribute is not deleted and the Attribute is still displayed on the Attribute tab
#
#
#    #    Then the Attribute is no longer displayed on the column header

