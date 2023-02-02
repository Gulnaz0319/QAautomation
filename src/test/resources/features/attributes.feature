#Feature:
#  Scenario: Verify the Attribute is deleted
#      Given I click the Delete icon next to non-mandatory Attribute with Activity Definition toggled OFF
#      Then a warning modal is shown and there "Cancel" and "Delete" options are present
#      And  I click on Delete button in the Warning popup message
#      Then Attribute is a successfully deleted toast message shown and the Attribute is no longer displayed on the Attribute tab
#      When I navigate to Activities tab
#      Then the Attribute is no longer displayed on the column header
#      When I select any activity and click on pencil icon
#      Then the Attribute is no longer displayed on Edit Activity modal
#      When I navigate to Pinnacle Home page
#      And I click on Submit New button
#      And I choose any Activity
#      Then the Attribute is no longer displayed on the submission form
#      Then the Attribute is no longer displayed on the end user widget
#
#      Scenario: Click on cancel button
#        Given I click on Cancel button in the Warning popup message
#       Then the Attribute is not deleted and the Attribute is still displayed on the Attribute tab
#
#  Scenario: Verify New Attribute entry row
#    Given I click on "Add Attribute" button
#    Then  cursor located in new Attribute name filed
#    Then Attribute Name is blank by default
#    When I navigate to Data type field
#    Then the Data Type is Short for Text by Default
#    When I navigate to Save button
#    Then the Save button is disabled
#
#  Scenario: Verify Cancel button works
#     Given I click on "Add Attribute" button
#     When Attribute Name is blank by default
#     And I click on the Cancel button
#     Then the new Attribute row is closed and I remain on the Attributes tab
#
#   Scenario: Verify user can add new Attribute
#     Given I click on "Add Attribute" button
#     When I enter unique Attribute name
#     And I select Long Form Text datatype
#     And I click on save button
#     Then the successful toast message is shown
#     Then new attribute remains on the Attributes tab
#
#   Scenario: Verify user is not able save with blank Attribute name filed
#     Given I click on "Add Attribute" button
#     When I select Long Form Text datatype
#     And Attribute Name is blank by default
#     Then Then the Save button is disabled
#
#   Scenario:
#     Given I click on "Add Attribute" button
#     When I enter existing Attribute Name to name filed
#     And I select Long Form Text datatype
#     And I click on the Save button
#     Then an error message stating "Attribute name and Data Type must be unique" is shown
#
