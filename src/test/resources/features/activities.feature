@activities
Feature: External Learning Activities tab
 Background: Login to Admin Portal as an Assignment Administrator
    Given I am logged in the Pinnacle Home page as an Assignment Administrator
    And I click on the gear icon
    Then Administration Portal displays as a selectable option
    When I click on Administration Portal
    Then a secondary tab is launched and I am taken into the Administration Portal
    Then External Learning is displayed as a selectable option within the left-hand side menu
    And  I click on External Learning

#  4787
  Scenario: US 4787
    And I navigate to External Learning
    And click on Setup
    Then New External Leaning Activities tab opens
    And I click on sign out
##  2 n 3 AC together
    Scenario: Verify Training title and Provider
    Given I navigate to External Learning
    And click on Setup
    Then a tool tip is listed that reads "External Learning Activities allow your users to submit common learning activities. Without this set up, learners will need to manually fill in attributes for submission."
    Then  the column headers displayed are: Training Title and Training Provider

  Scenario: Verify the last column named Active
    Given I navigate to tooltip next to External Leaning Activities
    Then the text is shown
    When I navigate to column
    Then column headers are shown same as in Attributes in Attributes tab
    When I go to the last column
    Then the last column named Active

##  5066 - Reorder Attributes on Activity Page and Add/Edit Activity Module
   Scenario: Verify the Status column remains on the farthest right hand position
    Given a user clicks on Attributes tab
    When the user reorders at least one Attribute on the Attributes tab of External Learning Setup in Admin portal
    And user clicks on “Activities” tab
    Then the columns on the Activity tab are also reordered to match
    And the Status column remains on the farthest right hand position

  Scenario: Verify the order of the fields on the Add Activity module are reordered to match
    Given an assignment administrator reorders a External Learning Attributes
    When the user adds an Activity
    Then the order of the fields on the Add Activity module are reordered to match

  Scenario: US 5066
    Given an assignment administrator reorders a External Learning Attributes
    When the user edits an Activity
    Then the order of the fields on the Edit Activity module are reordered to match

##  4804 - Sort External Learning Activities
  Scenario: US 4804
    Given the user clicks any column header
    Then the results sort in ascending order based on the data in that column
    When the user clicks the Column Header that the results are already being sorted by
    Then the sort order toggles between ascending and descending

  Scenario: US 4804
    Given a new Learning Activity has been added
    When I view the External Learning Activities table
    Then the Status column remains on the farthest right hand position
    Then and the Status indicator toggle is turned ON by default for that Activity

  Scenario: US 4804
    Given the Status indicator toggle is ON for a Learning Activity
    When I click the Status indicator toggle
    Then the Status indicator toggle is turned OFF for the associated Learning Activity, and a "toast" confirmation is displayed - "Activity Status Updated"

  Scenario: US 4804

    And the Status indicator toggle is OFF for a Learning Activity
    When I click the Status indicator toggle
    Then the Status indicator toggle is turned ON for the associated Learning Activity, and a "toast" confirmation is displayed - "Activity Status Updated"

#US 5260
  Scenario: US 5260
    Given I have selected two or more Learning Activities
    When I click the Delete button
    Then the plural warning prompt appears

  Scenario: US 5260
    Given I have selected only one Learning Activity
    When I click the Delete button
    Then the singular warning prompt  appears

#  US 4696
  Scenario: Edit External Learning Activity - Single Edit Functionality
    Given I am on the External Learning Setup page>'Activities' tab
    When I click the text hitbox of the 'Training Title' OR the selection checkbox next to a 'Training Title'
    Then  the "pencil" icon becomes "active"

  Scenario: Verify multiple activities cannot editable
    Given I am on the External Learning Setup page>'Activities' tab
    When I click the text hitbox of the 'Training Title(s)' OR the selection checkbox(s) next to 'Training Title(s)' for MORE THAN one Learning Activity
    Then  the "pencil" icon (edit icon) becomes "deactivated" cannot be clicked

  Scenario: Verify the "pencil" icon (edit icon) is "deactivated"
    When I click the text hitbox of the 'Training Title' OR the selection checkbox of my previously selected Learning Activity
    Then the "pencil" icon (edit icon) is not clickable

  Scenario: Verify Edit Existing Activity modal
    Given I have selected an External Learning Activity
    When I click the "pencil" icon (edit icon)
    Then the 'Edit Activity' popup appears for the selected Learning Activity, the 'Save' button is "inactive" (cannot be clicked) by default, and the following fields are populated with existing values:
    Then the 'Edit Activity' popup appears for the selected Learning Activity, the 'Save' button is "inactive" (cannot be clicked)














#    This TC is verifying mandatory Attributes are exist in the Activities tab
#    Given I am logged in the Pinnacle Home page as an Assignment Administrator
#    When I click on the gear icon
#    And  I click on Administration Portal