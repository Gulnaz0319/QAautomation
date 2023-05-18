package com.pinnacle.step_definitions;

import com.pinnacle.pages.ActivitiesPage;
import com.pinnacle.pages.AdminHomePage;
import com.pinnacle.pages.AttributesPage;
import com.pinnacle.utilities.BrowserUtils;
import com.pinnacle.utilities.Driver;
import com.sun.webkit.dom.DOMWindowImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class Activities_stepDefinitions extends Hooks{
    ActivitiesPage activitiesPage = new ActivitiesPage();
    AttributesPage attributesPage = new AttributesPage();

    AdminHomePage adminHomePage = new AdminHomePage();
 Driver driver;

    @Then("New External Leaning Activities tab opens")
    public void new_external_leaning_activities_tab_opens() {
     activitiesPage.activitiesPage.isDisplayed();
    }

    @Then("the user is defaulted to the Activities tab")
    public void the_user_is_defaulted_to_the_activities_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("a tool tip is listed that reads {string}")
    public void a_tool_tip_is_listed_that_reads(String string) {
        activitiesPage.activitiesTextTooltip.getText();

    }
    @Then("the column headers displayed are: Training Title and Training Provider")
    public void the_column_headers_displayed_are_training_title_and_provider() {
    activitiesPage.trainingTitle.isDisplayed();
    activitiesPage.trainingProvider.isDisplayed();
    }

    @Given("a user clicks on Attributes tab")
    public void a_user_clicks_on_attributes_tab() {
       attributesPage.Attributes.click();
    }
    @When("the user reorders at least one Attribute on the Attributes tab of External Learning Setup in Admin portal")
    public void the_user_reorders_at_least_one_attribute_on_the_attributes_tab_of_external_learning_setup_in_admin_portal() {
        attributesPage.mouseHover.click();
    }
    @When("user clicks on “Activities” tab")
    public void user_clicks_on_activities_tab() {
     activitiesPage.activitiesPage.click();
    }
    @Then("the columns on the Activity tab are also reordered to match")
    public void the_columns_on_the_activity_tab_are_also_reordered_to_match() {

    }
    @Then("the Status column remains on the farthest right hand position")
    public void the_status_column_remains_on_the_farthest_right_hand_position() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        activitiesPage.activeStatusColumn.isDisplayed();
    }
    @Given("an assignment administrator reorders a External Learning Attributes")
    public void an_assignment_administrator_reorders_a_external_learning_attributes() {
        attributesPage.mouseHover.click();

    }
    @When("the user adds an Activity")
    public void the_user_adds_an_activity() {
        activitiesPage.AddNewActivityBtn.click();
    }
    @Then("the order of the fields on the Add Activity module are reordered to match")
    public void the_order_of_the_fields_on_the_add_activity_module_are_reordered_to_match() {
        throw new io.cucumber.java.PendingException();
    }

    @When("the user edits an Activity")
    public void the_user_edits_an_activity() {
     activitiesPage.activityCheckBox.click();
    }
    @Then("the order of the fields on the Edit Activity module are reordered to match")
    public void the_order_of_the_fields_on_the_edit_activity_module_are_reordered_to_match() {
    }

    //US4804
    @When("the user clicks any column header")
    public void the_user_clicks_any_column_header() {
        activitiesPage.trainingTitle.click();
    }
    @Then("the results sort in ascending order based on the data in that column")
    public void the_results_sort_in_ascending_order_based_on_the_data_in_that_column() {
        ArrayList list = new ArrayList();
        list.add("");
    }

    @When("the user clicks the Column Header that the results are already being sorted by")
    public void the_user_clicks_the_column_header_that_the_results_are_already_being_sorted_by() {
     activitiesPage.trainingTitle.click();
    }
    @Then("the sort order toggles between ascending and descending")
    public void the_sort_order_toggles_between_ascending_and_descending() {

    }
    @Then("and the Status indicator toggle is turned ON by default for that Activity")
    public void and_the_status_indicator_toggle_is_turned_on_by_default_for_that_activity() {
        activitiesPage.activeStatusColumn.isEnabled();
    }

    @Given("a new Learning Activity has been added")
    public void a_new_learning_activity_has_been_added() {
        BrowserUtils.verifyElementDisplayed(activitiesPage.AddNewActivityBtn);
        activitiesPage.AddNewActivityBtn.click();

    }
    @When("I view the External Learning Activities table")
    public void i_view_the_external_learning_activities_table() {

    BrowserUtils.waitForVisibility(activitiesPage.activeStatusColumn,5);
    }

        @When("I navigate to External Learning")
    public void i_navigate_to_external_learning_setup() {
        adminHomePage.externalLearningBtn.click();
    }
    @When("click on Setup")
    public void click_on_setup() {
        adminHomePage.setupBnt.click();

    }
    @Then("the {string} column appears to the furthermost right of all existing columns, and the Status indicator toggle is turned ON by default for all new or unactioned Learning Activities")
    public void the_column_appears_to_the_furthermost_right_of_all_existing_columns_and_the_status_indicator_toggle_is_turned_on_by_default_for_all_new_or_unactioned_learning_activities(String string) {


    }
    @Given("the Status indicator toggle is ON for a Learning Activity")
    public void the_status_indicator_toggle_is_on_for_a_learning_activity() {
        activitiesPage.activityStatus.isEnabled();
    }

    @When("I click the Status indicator toggle")
    public void i_click_the_status_indicator_toggle() {
       activitiesPage.activityStatus.click();
    }
    @Then("the Status indicator toggle is turned OFF for the associated Learning Activity, and a {string} confirmation is displayed - {string}")
    public void the_status_indicator_toggle_is_turned_off_for_the_associated_learning_activity_and_a_confirmation_is_displayed(String string, String string2) {

    }
    @Given("the Status indicator toggle is OFF for a Learning Activity")
    public void the_status_indicator_toggle_is_off_for_a_learning_activity() {
        Assert.assertFalse(activitiesPage.activityStatus.isEnabled());
    }
    @Then("the Status indicator toggle is turned ON for the associated Learning Activity, and a {string} confirmation is displayed - {string}")
    public void the_status_indicator_toggle_is_turned_on_for_the_associated_learning_activity_and_a_confirmation_is_displayed(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("I have selected two or more Learning Activities")
    public void i_have_selected_two_or_more_learning_activities() {

    }
    @When("I click the Delete button")
    public void i_click_the_delete_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("I am on the External Learning Setup page>{string} tab")
    public void i_am_on_the_external_learning_setup_page_tab(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click the text hitbox of the {string} OR the selection checkbox next to a {string}")
    public void i_click_the_text_hitbox_of_the_or_the_selection_checkbox_next_to_a(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the {string} icon becomes {string}")
    public void the_icon_becomes(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



    @Then("the plural warning prompt appears")
    public void the_plural_warning_prompt_activities_appears() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("I have selected only one Learning Activity")
    public void i_have_selected_only_one_learning_activity() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the singular warning prompt  appears")
    public void the_singular_warning_prompt_activity_appears() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I click the text hitbox of the {string} OR the selection checkbox\\(s) next to {string} for MORE THAN one Learning Activity")
    public void i_click_the_text_hitbox_of_the_or_the_selection_checkbox_s_next_to_for_more_than_one_learning_activity(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the {string} icon \\(edit icon) becomes {string} cannot be clicked")
    public void the_icon_edit_icon_becomes_cannot_be_clicked(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click the text hitbox of the {string} OR the selection checkbox of my previously selected Learning Activity")
    public void i_click_the_text_hitbox_of_the_or_the_selection_checkbox_of_my_previously_selected_learning_activity(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the {string} icon \\(edit icon) is not clickable")
    public void the_icon_edit_icon_is_not_clickable(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("I have selected an External Learning Activity")
    public void i_have_selected_an_external_learning_activity() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click the {string} icon \\(edit icon)")
    public void i_click_the_icon_edit_icon(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the {string} popup appears for the selected Learning Activity, the {string} button is {string} \\(cannot be clicked) by default, and the following fields are populated with existing values:")
    public void the_popup_appears_for_the_selected_learning_activity_the_button_is_cannot_be_clicked_by_default_and_the_following_fields_are_populated_with_existing_values(String string, String string2, String string3) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the {string} popup appears for the selected Learning Activity, the {string} button is {string} \\(cannot be clicked)")
    public void the_popup_appears_for_the_selected_learning_activity_the_button_is_cannot_be_clicked(String string, String string2, String string3) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }





    @Given("I navigate to tooltip next to External Leaning Activities")
    public void i_navigate_to_tooltip_next_to_external_leaning_activities() {


    }

    @Then("the text is shown")
    public void the_text_is_shown() {

    }
    @When("I navigate to column")
    public void i_navigate_to_column() {

    }
    @Then("column headers are shown same as in Attributes in Attributes tab")
    public void column_headers_are_shown_same_as_in_attributes_in_attributes_tab() {

    }
    @When("I go to the last column")
    public void i_go_to_the_last_column() {

    }
    @Then("the last column named Active")
    public void the_last_column_named_active() {

    }



}
