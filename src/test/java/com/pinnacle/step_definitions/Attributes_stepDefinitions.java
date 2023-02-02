package com.pinnacle.step_definitions;

import com.pinnacle.pages.AdminHomePage;
import com.pinnacle.pages.AttributesPage;
import com.pinnacle.pages.PinnacleHomePage;
import com.pinnacle.utilities.BrowserUtils;
import com.pinnacle.utilities.ConfigurationReader;
import com.pinnacle.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Attributes_stepDefinitions {
    PinnacleHomePage testPage = new PinnacleHomePage();
    AdminHomePage adminHomePage = new AdminHomePage();
    AttributesPage attributesPage = new AttributesPage();
    @Given("I am logged in the Pinnacle Home page as an Assignment Administrator")
    public void i_am_logged_in_the_pinnacle_home_page_as_an_assignment_administrator() {
        Driver.getDriver().get(ConfigurationReader.getProperty("el.url.beta"));
        testPage.username.sendKeys(ConfigurationReader.getProperty("username"));
        testPage.passwords.sendKeys(ConfigurationReader.getProperty("password"));
        BrowserUtils.sleep(3);
        testPage.signInBtn.click();

    }
    @When("I navigate to External Learning")
    public void i_navigate_to_external_learning_setup() {
        adminHomePage.externalLearningBtn.click();
    }
    @When("click on Setup")
    public void click_on_setup() {
        adminHomePage.setupBnt.click();

    }
    @Then("New External Leaning Setup tab opens")
    public void new_external_leaning_setup_tab_opens() {
        BrowserUtils.waitForVisibility(adminHomePage.externalLearningBtn, 3);
    }
    @When("I click on Attributes tab")
    public void i_click_on_attributes_tab() {
        adminHomePage.attributesBtn.click();
    }

    @Then("{string} tab is opened")
    public void tab_is_opened(String ExternalLearningAttributes) {
        BrowserUtils.verifyElementDisplayed(attributesPage.ExternalLearningAttributes);
    }
    @Given("I click the Delete icon next to non-mandatory Attribute with Activity Definition toggled OFF")
    public void i_click_the_delete_icon_next_to_any_non_mandatory_attribute() {

        //attributesPage.deleteBtn.click();

        List<WebElement> list = Driver.getDriver().findElements(By.xpath("//div[@class='colpadding col6Img']//img[@id]"));
        for(WebElement each : list) {
            each.click();
            BrowserUtils.sleep(3);
        }

    }
    @Then("a warning modal is shown and there {string} and {string} options are present")
    public void a_warning_modal_is_shown_and_there_and_options_are_present(String Cancel, String Delete) {
        //System.out.println(attributesPage.deleteBtn.getText());
        BrowserUtils.waitForVisibility(attributesPage.textOfModal,5);
        Assert.assertEquals("Are you sure you wish to delete the Attribute and all associated data? All related attribute data will be lost.", attributesPage.textOfModal.getText());
        BrowserUtils.verifyElementDisplayed(attributesPage.cancelOption);
        BrowserUtils.verifyElementDisplayed(attributesPage.deleteOption);

    }
    @Then("I click on Delete button in the Warning popup message")
    public void i_click_on_delete_button_in_the_warning_popup_message() {
        attributesPage.deleteOption.click();
    }
    @Then("Attribute is a successfully deleted toast message shown and the Attribute is no longer displayed on the Attribute tab")
    public void attribute_is_a_successfully_deleted_toast_message_shown_and_the_attribute_is_no_longer_displayed_on_the_attribute_tab() {
    }

    @When("I navigate to Activities tab")
    public void i_navigate_to_activities_tab() {

    }
    @Then("the Attribute is no longer displayed there")
    public void the_attribute_is_no_longer_displayed_there() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("select any activity and click on pencil icon")
    public void select_any_activity_and_click_on_pencil_icon() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the Attribute is no longer displayed on Edit Activity modal")
    public void the_attribute_is_no_longer_displayed_on_edit_activity_modal() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I navigate to Pinnacle Home page")
    public void i_navigate_to_pinnacle_home_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click on Submit New button")
    public void i_click_on_submit_new_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I choose any Activity")
    public void i_choose_any_activity() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the Attribute is no longer displayed on the submission form")
    public void the_attribute_is_no_longer_displayed_on_the_submission_form() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the Attribute is no longer displayed on the end user widget")
    public void the_attribute_is_no_longer_displayed_on_the_end_user_widget() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("I click on Cancel button in the Warning popup message")
    public void i_click_on_cancel_button_in_the_warning_popup_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the Attribute is not deleted and the Attribute is still displayed on the Attribute tab")
    public void the_attribute_is_not_deleted_and_the_attribute_is_still_displayed_on_the_attribute_tab() {

    }



    @Then("cursor located in new Attribute name filed")
    public void cursor_located_in_new_attribute_name_filed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Attribute Name is blank by default")
    public void attribute_name_is_blank_by_default() {

    }

    @When("I navigate to Data type field")
    public void i_navigate_to_data_type_field() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the Data Type is Short for Text by Default")
    public void the_data_type_is_short_for_text_by_default() {

    }

    @When("I navigate to Save button")
    public void i_navigate_to_save_button() {

    }

    @Then("the Save button is disabled")
    public void the_save_button_is_disabled() {

    }

    @When("I click on the Cancel button")
    public void i_click_on_the_cancel_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the new Attribute row is closed and I remain on the Attributes tab")
    public void the_new_attribute_row_is_closed_and_i_remain_on_the_attributes_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I enter unique Attribute name")
    public void i_enter_unique_attribute_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I select Long Form Text datatype")
    public void i_select_long_form_text_datatype() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I click on save button")
    public void i_click_on_save_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the successful toast message is shown")
    public void the_successful_toast_message_is_shown() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("new attribute remains on the Attributes tab")
    public void new_attribute_remains_on_the_attributes_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Then the Save button is disabled")
    public void then_the_save_button_is_disabled() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I enter existing Attribute Name to name filed")
    public void i_enter_existing_attribute_name_to_name_filed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I click on the Save button")
    public void i_click_on_the_save_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("an error message stating {string} is shown")
    public void an_error_message_stating_is_shown(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
