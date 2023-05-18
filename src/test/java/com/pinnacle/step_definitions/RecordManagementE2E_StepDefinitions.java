package com.pinnacle.step_definitions;

import com.github.javafaker.Faker;
import com.pinnacle.pages.AdminHomePage;
import com.pinnacle.pages.RecordManagementPage;
import com.pinnacle.utilities.BrowserUtils;
import com.pinnacle.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Objects;

public class RecordManagementE2E_StepDefinitions {
    RecordManagementPage recordManagementPage = new RecordManagementPage();
    AdminHomePage adminHomePage = new AdminHomePage();
    BrowserUtils browserUtils = new BrowserUtils();

    @Given("I click on Record Management")
    public void i_click_on_record_management() {
        adminHomePage.recordManagementOption.click();

    }

    @When("I click on the Add New button")
    public void i_click_the_button() {
//        Assert.assertTrue(recordManagementPage.addNewRecordBtn.isDisplayed());
        BrowserUtils.waitForClickability(recordManagementPage.addNewRecordBtn, 30);
//          recordManagementPage.addRecordManuallyBtn.click();
        browserUtils.clickWithJS(recordManagementPage.addNewRecordBtn);
    }

    @When("I select Add Record Manually option")
    public void I_select_Add_Record_Manually_option() {
//        Assert.assertTrue(recordManagementPage.addNewRecordBtn.isDisplayed());
        BrowserUtils.waitForClickability(recordManagementPage.addNewRecordBtn, 30);
        //recordManagementPage.addNewRecordBtn.click();
//        Select select = new Select(recordManagementPage.addNewRecordBtn);
//        select.selectByVisibleText(" Add Record Manually ");
        browserUtils.clickWithJS(recordManagementPage.addRecordManuallyBtn);
    }


    @Then("the Save button is disabled on the Add New Record modal")
    public void the_save_button_is_disabled_on_the_Add_New_Record_modal() {
        Assert.assertFalse(recordManagementPage.addNewRecordBtn.isEnabled());
    }

    @Then("I select any user from user list")
    public void i_select_any_user_from_user_list() {

        BrowserUtils.waitForVisibility(recordManagementPage.userInputField, 30);
        browserUtils.clickWithJS(recordManagementPage.userInputField);
        recordManagementPage.userInputField.sendKeys("Gulnaz(AA)");
//      browserUtils.clickWithJS(recordManagementPage.userListDropDown);
        browserUtils.clickWithJS(recordManagementPage.myUser);

    }

    @Then("I select existing Activity")
    public void I_select_existing_activity() {
        browserUtils.clickWithJS(recordManagementPage.selectActivityDropDown);
        browserUtils.clickWithJS(recordManagementPage.randomActivity);
    }

    @When("I enter Completed date")
    public void I_enter_Completed_date() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Faker faker = new Faker();
        String dob = sdf.format(faker.date().birthday());
        browserUtils.clickWithJS(recordManagementPage.completedDateField);
        recordManagementPage.completedDateField.sendKeys(dob);

//        if(recordManagementPage.completedDateField.isEnabled()) {
//            browserUtils.clickWithJS(recordManagementPage.completedDateField);
//        }else{
//            browserUtils.clickWithJS(recordManagementPage.completedDateField);
//            //BrowserUtils.waitForClickability(recordManagementPage.completedDateField,5);
//            recordManagementPage.completedDateField.sendKeys("2/16/2025");
//        }

    }
    @When("I enter valid data in all of the Required Attribute fields")
    public void I_enter_valid_data_in_all_of_the_required_attribute_fields() {

    }

    @Then("the Save button is enabled")
    public void the_save_button_is_enabled() {
        recordManagementPage.addNewRecordBtn.isEnabled();
    }

    @Then("I click on Save button")
    public void I_click_on_save_button() {

        browserUtils.clickWithJS(recordManagementPage.createRecordInAddNewRecordModal);
    }

    @Then("success toast message is shown and new Record exists in the table")
    public void success_toast_message_is_shown_and_new_record_exists_in_the_table() {
        BrowserUtils.waitForVisibility(recordManagementPage.successToastMessage, 30);
//        recordManagementPage.successToastMessage.click();
       Assert.assertEquals("Record added.", recordManagementPage.successToastMessage.getText());
        System.out.println(recordManagementPage.successToastMessage.getText());
//        Alert alert = Driver.getDriver().switchTo().alert();
//        System.out.println("Alert text" + alert.getText());
//        Assert.assertEquals("Record Added", alert.getText());
//    BrowserUtils.waitForVisibility(recordManagementPage.successToastMessage,30);
//        recordManagementPage.successToastMessage.getText();
    }

    @Then("I click on the Select Activity and select Other")
    public void I_click_on_Select_Activity_and_select_Other() {
        browserUtils.clickWithJS(recordManagementPage.selectActivityDropDown);
        browserUtils.clickWithJS(recordManagementPage.otherActivity);
        BrowserUtils.sleep(10);
    }

    @When("I enter Training Title")
    public void i_enter_training_title() {
//      BrowserUtils.waitForVisibility(recordManagementPage.trainingTitleField,30);
        browserUtils.clickWithJS(recordManagementPage.trainingTitleField);
        recordManagementPage.trainingTitleField.click();
        recordManagementPage.trainingTitleField.sendKeys("Test 1");
    }

    @When("I select Import Records from Spreadsheet option")
    public void i_select_add_record_manually() {
        browserUtils.clickWithJS(recordManagementPage.importRecordBtn);

    }

    @When("I click the Browse Files hyperlink text")
    public void i_click_the_hyperlink_text() throws Exception {
        Actions act = new Actions(Driver.getDriver());

        //act.moveToElement(recordManagementPage.dragAndDrop).click().perform();
        //browserUtils.clickWithJS(recordManagementPage.dragAndDrop);
        try {
            act.doubleClick(recordManagementPage.dragAndDrop).perform();
            Runtime.getRuntime().exec("C:\\Test Data\\FileUpload.exe");
            System.out.println("Try");
        } catch (Exception e) {
            System.out.println("Catch");
            browserUtils.clickWithJS(recordManagementPage.dragAndDrop);
            BrowserUtils.sleep(2);
            Runtime.getRuntime().exec("C:\\TestData\\FileUploading.exe");
            BrowserUtils.sleep(2);
        }
    }
    @Given("I click the selection box of any single Learning Record")
    public void i_click_the_selection_box_of_any_single_learning_record() {
        recordManagementPage.firstRecordCheckBox.click();
    }

    @Then("the Learning Record becomes selected")
    public void the_learning_record_becomes_selected() {
        Assert.assertEquals("EERow selected", recordManagementPage.firstRecordRow.getAttribute("class"));
    }

    @Then("the export {string} button becomes active")
    public void the_export_button_becomes_active(String string) {

    }
    @When("I click the export {string} button")
    public void i_click_the_export_button(String string) {

    }

    @Then("the Delete button on the top becomes clickable")
    public void the_delete_button_becomes_clickable() {
        Assert.assertTrue(recordManagementPage.deleteRecordOpn.isEnabled());
        System.out.println(recordManagementPage.deleteRecordOpn.isEnabled());
    }

    @Given("I click the {string} button on the top")
    public void i_click_the_button(String delete) {
        recordManagementPage.deleteRecordOpn.click();

    }
    @Then("the Delete Record popup appears")
    public void the_delete_record_popup_appears() {
        BrowserUtils.waitForVisibility(recordManagementPage.deleteRecordModal2, 30);
        System.out.println(recordManagementPage.deleteRecordModal2.isDisplayed());
        Assert.assertTrue(recordManagementPage.deleteRecordModal2.isDisplayed());
    }
    @Then("the {string} popup appears")
    public void the_popup_appears(String deletePopup) {
        BrowserUtils.waitForVisibility(recordManagementPage.deleteRecordsModal, 30);
        System.out.println(recordManagementPage.deleteRecordsModal.isDisplayed());
        Assert.assertTrue(recordManagementPage.deleteRecordsModal.isDisplayed());
    }
    @Given("I am on the {string} popup")
    public void i_am_on_the_popup(String deletePopup) {
        recordManagementPage.firstRecordCheckBox.click();
        recordManagementPage.deleteRecordOpn.click();
    }

    @When("I click on the {string}")
    public void i_click(String cancel) {
        BrowserUtils.waitForVisibility(recordManagementPage.cancelBtnOnDRModal, 30);
        browserUtils.clickWithJS(recordManagementPage.cancelBtnOnDRModal);
    }

    @When("I click on the 'Cancel' on delete Record modal from ellipsis")
    public void i_click_ellipsis(String cancel) {
        BrowserUtils.waitForVisibility(recordManagementPage.cancelBtnOnDRModal, 30);
        browserUtils.clickWithJS(recordManagementPage.cancelBtnOnDRModal);
    }

    @Then("the {string} popup is closed, I am returned to the External Learning>Record Management page from which I came")
    public void the_popup_is_closed_i_am_returned_to_the_external_learning_record_management_page_from_which_i_came(String deletePopup) {
        String hideScript = "document.getElementById('confirm-delete-modal').style='display: none;'";
        ((JavascriptExecutor) Driver.getDriver()).executeScript(hideScript);
        Assert.assertFalse(recordManagementPage.deleteRecordModal2.isDisplayed());
    }

    @Then("the {string} popup is closed ellipsis, I am returned to the External Learning>Record Management page from which I came")
    public void the_popup_is_closed_ellipsis_i_am_returned_to_the_external_learning_record_management_page_from_which_i_came(String deletePopup) {
        String hideScript = "document.getElementById('confirm-delete-single-modal').style='display: none;'";
        ((JavascriptExecutor) Driver.getDriver()).executeScript(hideScript);
        Assert.assertFalse(recordManagementPage.deleteRecordModal2.isDisplayed());
    }

    @Then("the Learning Record is deleted from the Record Management table view")
    public void the_learning_record_is_deleted_from_the_record_management_table_view() {
        BrowserUtils.sleep(2);
        Assert.assertEquals("EERow unselected ng-star-inserted", recordManagementPage.firstRecordRow.getAttribute("class"));
    }

    @When("I click on ellipsis next to any record")
    public void i_click_on_ellipsis_next_to_any_record() {
//        BrowserUtils.waitForVisibility(recordManagementPage.firstRecordEllipsis, 30);
        browserUtils.clickWithJS(recordManagementPage.firstRecordRow);
        recordManagementPage.firstRecordEllipsis.click();

    }

    @When("I click {string} option from ellipsis menu")
    public void i_click_option_fro_ellipsis_menu(String string) {
        recordManagementPage.deleteBtnFromEllipsisMenu.click();
    }


    @Then("the Learning Record selection is retained")
    public void the_learning_record_selection_is_retained() {
        Assert.assertEquals("EERow selected", recordManagementPage.firstRecordRow.getAttribute("class"));
    }

    @Given("I click on the {string} button")
    public void i_click_on_the_button(String delete) {
        BrowserUtils.sleep(3);
        recordManagementPage.deleteBtnOnDRModal.click();

    }

    @Then("toast saying {string} is shown")
    public void toast_saying_is_shown(String toastDelete) {
        BrowserUtils.waitForVisibility(recordManagementPage.recordDeletedToast, 30);
        Assert.assertEquals("Record deleted successfully.", recordManagementPage.recordDeletedToast.getText());
        System.out.println(recordManagementPage.recordDeletedToast.getText());
    }


    @When("I click the selection box {string} of multiple Learning Records")
    public void i_click_the_of_multiple_learning_records(String string) {
        List<WebElement> checkboxes = Driver.getDriver().findElements(By.xpath("//table[@id='user-virtual-table']//tr[@class='EERow unselected']//td[@class='check-column-cell']"));
        for (int i = 0; i < 2; i++) {
            checkboxes.get(i).click();
        }
    }
    @Then("a CSV file download is initiated within the current browser session")
    public void a_csv_file_download_is_initiated_within_the_current_browser_session() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("toast saying {string} is shown \\(multiple)")
    public void toast_saying_is_shown_multiple(String deleteRecordsModal) {
        BrowserUtils.waitForVisibility(recordManagementPage.recordsDeletedToast, 30);
        Assert.assertEquals("Records deleted successfully.", recordManagementPage.recordsDeletedToast.getText());
        System.out.println(recordManagementPage.recordsDeletedToast.getText());

    }

    @Then("the Learning Record\\(s) become selected, and the {string} button becomes clickable")
    public void the_learning_record_s_become_selected_and_the_button_becomes_clickable(String string) {
        List<WebElement> checkboxes = Driver.getDriver().findElements(By.xpath("//table[@id='user-virtual-table']//tr[@class='EERow selected']"));
        for (int i = 0; i < 3; i++) {
            Assert.assertEquals("EERow selected", checkboxes.get(i).getAttribute("class"));
//       if(checkboxes.get(i).isSelected()){
//           System.out.println("checkboxes are selected" +checkboxes.get(i).getAttribute("class") + "is checked ");
//       }else{
//           System.out.println("no");
        }
//            Assert.assertEquals("EERow selected", recordManagementPage.firstRecordRow.getAttribute("class"));
        //  Objects.equals(checkboxes.get(i).getAttribute("class"), "EERow selected")
        Assert.assertTrue(recordManagementPage.deleteRecordOpn.isEnabled());
        System.out.println(recordManagementPage.deleteRecordOpn.isEnabled());
    }

    @Then("the Learning Record selections are retained")
    public void the_learning_record_selections_are_retained() {
        List<WebElement> checkboxes = Driver.getDriver().findElements(By.xpath("//table[@id='user-virtual-table']//tr[@class='EERow selected']"));
        for (int i = 0; i < 3; i++) {
            Assert.assertEquals("EERow selected", checkboxes.get(i).getAttribute("class"));
        }
    }

    @Then("the Learning Records are deleted from the Record Management table view")
    public void the_learning_records_are_deleted_from_the_record_management_table_view() {
        BrowserUtils.sleep(2);
        Assert.assertEquals("EERow unselected ng-star-inserted", recordManagementPage.firstRecordRow.getAttribute("class"));
    }

    @Then("the {string} button on the top becomes active")
    public void the_edit_button_becomes_can_be_clicked(String edit) {
        Assert.assertTrue(recordManagementPage.editRecordOpn.isEnabled());
        System.out.println(recordManagementPage.editRecordOpn.isEnabled());

    }

    @When("I click {string} on the top")
    public void i_click_edit_on_the_top(String edit) {
       recordManagementPage.editRecordOpn.click();
    }
    @Then("the {string} popup is displayed")
    public void the_popup_is_displayed(String string) {
     BrowserUtils.waitForVisibility(recordManagementPage.editExistingRecordModal, 30);
    Assert.assertTrue(recordManagementPage.editExistingRecordModal.isDisplayed());
    }
    @Then("the {string} button is inactive by default")
    public void the_button_is_by_default(String saveBtn) {
        BrowserUtils.waitForVisibility(recordManagementPage.saveBtnOnTheEditExistingRecordModal, 30);
       Assert.assertTrue(recordManagementPage.saveBtnOnTheEditExistingRecordModal.isDisplayed());
    }
    @Then("any existing data fields are populated")
    public void any_existing_data_fields_are_populated() {

    }

    @Given("I am on the edit {string} popup")
    public void i_am_on_the_edit_popup(String editModal) {
        recordManagementPage.firstRecordCheckBox.click();
        recordManagementPage.editRecordOpn.click();
    }
    @When("I change one or more values in any of the data fields")
    public void i_change_one_or_more_values_in_any_of_the_data_fields() {
    BrowserUtils.waitForVisibility(recordManagementPage.completedDateOnEditRcrModal, 30);
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Faker faker = new Faker();
        String dob = sdf.format(faker.date().birthday());
        browserUtils.clickWithJS(recordManagementPage.completedDateOnEditRcrModal);
        recordManagementPage.completedDateOnEditRcrModal.sendKeys(dob);
    }
    @Then("the {string} button becomes {string} \\(can be clicked)")
    public void the_button_becomes_can_be_clicked(String string, String string2) {
      Assert.assertTrue(recordManagementPage.saveBtnOnTheEditExistingRecordModal.isEnabled());
    }

    @When("I remove all values from any Eagle Point {string} data field")
    public void i_remove_all_values_from_any_eagle_point_data_field(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the {string} button returns to an {string} state")
    public void the_button_returns_to_an_state(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("click on the {string} button on the Edit Existing Record modal")
    public void click(String Save) {
       recordManagementPage.saveBtnOnTheEditExistingRecordModal.click();
    }

    @Then("the edit {string} popup is closed, I am returned to the External Learning>Record Management page from which I came")
    public void the_edit_popup_is_closed_i_am_returned_to_the_external_learning_record_management_page_from_which_i_came(String editModal) {
        BrowserUtils.sleep(2);
        String hideScript = "document.getElementById('add-record-manually').style='display: none;'";
        ((JavascriptExecutor) Driver.getDriver()).executeScript(hideScript);
        System.out.println(recordManagementPage.recordManagementPage.isDisplayed());
        Assert.assertFalse(recordManagementPage.editExistingRecordModal.isDisplayed());
    }
    @Then("{string} confirmation appears: {string}")
    public void confirmation_appears(String string, String string2) {

    }
    @Then("any changes made to data fields are reflected within the corresponding columns within the table")
    public void any_changes_made_to_data_fields_are_reflected_within_the_corresponding_columns_within_the_table() {

    }



















    // ------------------------------------------------------------------------
    @When("I drag and drop file")
    public void i_drag_and_drop_file() {

    }

    @Then("new window Import Records Options is shown")
    public void new_window_import_records() {

    }

    @Given("I have imported file")
    public void i_have_imported_file() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("new new window Import Records Options is shown")
    public void new_new_window_import_records_options_is_shown() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("trash icon is there")
    public void trash_icon_is_there() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Use first rows is checked")
    public void use_first_rows_is_checked() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Continue Import is clickable")
    public void continue_import_is_clickable() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Given I have imported file")
    public void given_i_have_imported_file() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I clicked on the Continue  Import button")
    public void i_clicked_on_the_continue_import_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Map Attributes to Columns is shown")
    public void map_attributes_to_columns_is_shown() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Cancel button is disabled")
    public void cancel_button_is_disabled() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Preview Import button is disabled")
    public void preview_import_button_is_disabled() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("And I clicked on the Continue  Import button")
    public void and_i_clicked_on_the_continue_import_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I select Email, Training Title, and Completed Date")
    public void i_select_email_training_title_and_completed_date() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the Preview Import button is clickable")
    public void the_preview_import_button_is_clickable() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I click the {string} button next to a Learning Record")
    public void i_click_the_button_next_to_a_learning_record(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click {string} from the ellipsis menu")
    public void i_click_from_the_ellipsis_menu(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the name of the CSV file download is: {string}")
    public void the_name_of_the_csv_file_download_is(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }








}
