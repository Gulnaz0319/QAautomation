package com.pinnacle.step_definitions;

import com.github.javafaker.Faker;
import com.pinnacle.pages.*;
import com.pinnacle.utilities.BrowserUtils;
import com.pinnacle.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Attributes_stepDefinitions {
    PinnacleHomePage pinnacleHomePage = new PinnacleHomePage();
    AdminHomePage adminHomePage = new AdminHomePage();
    AttributesPage attributesPage = new AttributesPage();

    ActivitiesPage activitiesPage = new ActivitiesPage();
    RecordManagementPage recordManagementPage = new RecordManagementPage();
    BrowserUtils browserUtils = new BrowserUtils();
    String oldId;
    String newId;


    @When("I click on Setup")
    public void i_click_on_setup() {
        adminHomePage.setupBnt.click();

    }
    @When("I click on Attributes tab")
    public void i_click_attributes_tab() {
        activitiesPage.attributesTab.click();

    }
    @Then("the External Learning Attributes page is successfully opens")
    public void the_external_learning_attributes_page_is_successfully_opens() {
        BrowserUtils.verifyElementDisplayed(attributesPage.getExternalLearningAttributes);

    }
    @Given("I click on the tooltip icon next to External Learning Attributes tab")
    public void i_click_on_the_tooltip_icon_next_to_external_learning_attributes_tab() {
        attributesPage.getAttributesPageTooltip.click();


    }
    @Then("the expected message is shown")
    public void the_expected_message_is_shown() {
        String expected = "External Learning Attributes are used to provide additional information about the learning experience. 'Required' field indicator applies to end-user record submission and Activity Definition. This does not apply to manager-created records. 'Activity Definition' field indicator is used to populate the Attributes.<br/><br/>Activity Definition state may not be edited once saved.";
        String actual = attributesPage.getAttributesPageTooltip.getAttribute( "data-original-title");
        System.out.println(actual);
        System.out.println(actual);
        Assert.assertEquals("", expected,actual);
    }

    @Given("I click on Add Attribute button")
    public void i_click_on_add_attribute_button() {
        attributesPage.addNewAttribute.click();

    }
    @Then("cursor located in new Attribute name filed")
    public void cursor_located_in_new_attribute_name_filed() {
        BrowserUtils.waitForClickability(attributesPage.newAttributeInput,30);
    }

    @Then("Attribute Name is blank by default")
    public void attribute_name_is_blank_by_default() {
        attributesPage.newAttributeInput.getText();
//        System.out.println(attributesPage.newAttribute.getText() + "Gulnaz");
        Assert.assertEquals("", attributesPage.newAttributeInput.getText());
    }

    @When("I navigate to Data type field")
    public void i_navigate_to_data_type_field() {
        attributesPage.datatypeDropDown.click();

    }

    @Then("the Data Type is Short for Text by Default")
    public void the_data_type_is_short_for_text_by_default() {
        attributesPage.textDataType.isDisplayed();
        attributesPage.textCheckMark.isDisplayed();
        attributesPage.datatypeDropDown.click();
    }

    @When("I navigate to Save button and the Save button is disabled")
    public void i_navigate_to_save_button() {
        assert !attributesPage.saveBtn.isEnabled() : "Element is clickable but should not be.";
    }

    @When("I click on the Cancel button")
    public void i_click_on_the_cancel_button() {
        attributesPage.cancelOption.click();
    }

    @Then("the new Attribute row is closed and I remain on the Attributes tab")
    public void the_new_attribute_row_is_closed_and_i_remain_on_the_attributes_tab() {
        assert !attributesPage.newAttributeInput.isDisplayed() : "New Attribute entry row is displayed but should not be";
        attributesPage.getExternalLearningAttributes.isDisplayed();

    }

    @When("I enter unique Attribute name")
    public void i_enter_unique_attribute_name() {
        Faker faker = new Faker();
        attributesPage.newAttributeInput.sendKeys(faker.name().title());
    }

    @When("I select Long Form Text datatype")
    public void i_select_long_form_text_datatype() {
        attributesPage.datatypeDropDown.click();
        attributesPage.longFormTextDatatype.click();
    }

    @When("I click on save button")
    public void i_click_on_save_button() {
        attributesPage.saveBtn.click();
    }

    @Then("new attribute remains on the Attributes tab")
    public void new_attribute_remains_on_the_attributes_tab() {
        String newId = attributesPage.attributes.get(attributesPage.attributes.size() - 1).getAttribute("id");
        attributesPage.isAttributeDisplayed(newId);
        System.out.println(newId);
    }


    @Then("the Save button is disabled")
    public void the_save_button_is_disabled() {
        assert !attributesPage.saveBtn.isEnabled() : "Element is clickable but should not be.";
    }



    @Then("New External Leaning Setup tab opens")
    public void new_external_leaning_setup_tab_opens() {
        BrowserUtils.waitForVisibility(adminHomePage.externalLearningBtn,5);
    }

    @Then("the Attribute is no longer displayed on the column header")
    public void the_attribute_is_no_longer_displayed_on_the_column_header() {


    }
    @When("I select any activity and click on pencil icon")
    public void i_select_any_activity_and_click_on_pencil_icon() {

    }


    @Then("{string} tab is opened")
    public void tab_is_opened(String ExternalLearningAttributes) {
        BrowserUtils.verifyElementDisplayed(attributesPage.ExternalLearningAttributes);
    }
    @Given("I click the Delete icon next to non-mandatory Attribute with Activity Definition toggled OFF")
    public void i_click_the_delete_icon_next_to_any_non_mandatory_attribute() {
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("//div[@class='colpadding col6Img']//img[@id]"));
        for(WebElement each : list) {
            each.click();
            BrowserUtils.sleep(3);
            break;
        }

    }
    @Then("a warning modal is shown and there {string} and {string} options are present")
    public void a_warning_modal_is_shown_and_there_and_options_are_present(String Cancel, String Delete) {

       oldId = attributesPage.GetTheIdOfAnElement();

        BrowserUtils.waitForVisibility(attributesPage.textOfModal,30);
        Assert.assertEquals("Are you sure you wish to delete the Attribute and all associated data? All related attribute data will be lost.", attributesPage.textOfModal.getText());
        BrowserUtils.verifyElementDisplayed(attributesPage.cancelOption);
        BrowserUtils.verifyElementDisplayed(attributesPage.deleteOption);

    }
    @Then("I click on Delete button in the Warning popup message")
    public void i_click_on_delete_button_in_the_warning_popup_message() {
        BrowserUtils.waitForClickability(attributesPage.deleteOption, 30);
        browserUtils.clickWithJS(attributesPage.deleteOption);
//        attributesPage.deleteOption.click();


    }
    @Then("Attribute is a successfully deleted toast message shown and the Attribute is no longer displayed on the Attribute tab")
    public void attribute_is_a_successfully_deleted_toast_message_shown_and_the_attribute_is_no_longer_displayed_on_the_attribute_tab() throws InterruptedException {
        Thread.sleep(2000);
try {
    Driver.getDriver().findElement(By.xpath("//div[@class='colpadding col6Img']//img[@id]//..//..//input[@id='"+oldId +"']"));
}catch (NoSuchElementException e)
{
    System.out.println("The element is not present, the test is pass " + e.getMessage());
}
    }

    @When("I navigate to Activities tab")
    public void i_navigate_to_activities_tab() {

    }
    @Then("the Attribute is no longer displayed there")
    public void the_attribute_is_no_longer_displayed_there() {
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("//div[@class='colpadding col6Img']//img[@id]"));
        for (WebElement each : list) {
            each.click();
            BrowserUtils.sleep(3);
        }
    }
//    Hard coded
    @When("select any activity and click on pencil icon")
    public void select_any_activity_and_click_on_pencil_icon() {
        activitiesPage.activityCheckBox.click();
        activitiesPage.editActivityBtn.click();


    }
//    Hard coded
    @Then("the Attribute is no longer displayed on Edit Activity modal")
    public void the_attribute_is_no_longer_displayed_on_edit_activity_modal() {
        Assert.assertFalse(activitiesPage.attributesBtn.isDisplayed());

    }
    @When("I navigate to Pinnacle Home page")
    public void i_navigate_to_pinnacle_home_page() {
        pinnacleHomePage.externalLearningBtn.click();


    }
    @When("I click on Submit New button")
    public void i_click_on_submit_new_button() {
        recordManagementPage.addNewRecordBtn.click();
//        recordManagementPage.addRecordManuallyBtn.click();
//
    }
    @When("I choose any Activity")
    public void i_choose_any_activity() {
        recordManagementPage.addRecordManuallyBtn.click();
    }
    @Then("the Attribute is no longer displayed on the submission form")
    public void the_attribute_is_no_longer_displayed_on_the_submission_form() {
        Assert.assertFalse(attributesPage.attribute.isDisplayed());
    }
    @Then("the Attribute is no longer displayed on the end user widget")
    public void the_attribute_is_no_longer_displayed_on_the_end_user_widget() {


    }
    @Given("I click on Cancel button in the Warning popup message")
    public void i_click_on_cancel_button_in_the_warning_popup_message() {
        attributesPage.cancelOption.click();

    }

    @Then("the Attribute is not deleted and the Attribute is still displayed on the Attribute tab")
    public void the_attribute_is_not_deleted_and_the_attribute_is_still_displayed_on_the_attribute_tab() {
        attributesPage.attribute.isDisplayed();

    }



    @When("I enter existing Attribute Name to name filed")
    public void i_enter_existing_attribute_name_to_name_filed() {
      attributesPage.newAttributeInput.sendKeys("Feedback");
    }

    @When("I click on the Save button")
    public void i_click_on_the_save_button() {
        attributesPage.saveBtn.click();
    }

    @Then("an error message stating {string} is shown")
    public void an_error_message_stating_is_shown(String toastText) {
        BrowserUtils.verifyElementDisplayed(attributesPage.sameNameErrorToast);
        Assert.assertEquals(toastText, attributesPage.sameNameErrorToast.getText());
        System.out.println(attributesPage.sameNameErrorToast.getText());
    }

}
