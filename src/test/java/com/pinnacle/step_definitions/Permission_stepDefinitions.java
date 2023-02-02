package com.pinnacle.step_definitions;

import com.pinnacle.pages.AdminHomePage;
import com.pinnacle.pages.AttributesPage;
import com.pinnacle.pages.GroupsPage;
import com.pinnacle.pages.PinnacleHomePage;
import com.pinnacle.utilities.BrowserUtils;
import com.pinnacle.utilities.ConfigurationReader;
import com.pinnacle.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Permission_stepDefinitions extends Hooks {
    PinnacleHomePage testPage = new PinnacleHomePage();
    AdminHomePage adminHomePage = new AdminHomePage();
    GroupsPage groupsPage = new GroupsPage();
    @Given("I am on the login page Pinnacle")
    public void i_am_on_the_login_page_pinnacle() {
        BrowserUtils.sleep(3);
        Driver.getDriver().get(ConfigurationReader.getProperty("el.url"));
    }
    @When("I enter username")
    public void i_enter_username() {
        testPage.username.sendKeys(ConfigurationReader.getProperty("username1"));
    }
    @When("I enter password")
    public void i_enter_password() {
        testPage.passwords.sendKeys(ConfigurationReader.getProperty("password"));
        BrowserUtils.sleep(3);

    }
    @When("I click sign in button")
    public void i_click_sign_in_button() {
        BrowserUtils.waitForClickability(testPage.signInBtn,2);
        testPage.signInBtn.click();


    }
    @Then("the gear icon displays within the upper right-hand corner of my header toolbar")
    public void the_gear_icon_displays_within_the_upper_right_hand_corner_of_my_header_toolbar() {
        BrowserUtils.verifyElementDisplayed(testPage.gearIcon);
    }
    @Then("I click on the gear icon")
    public void i_click_on_the_gear_icon() {
        testPage.gearIcon.click();

    }
    @Then("Administration Portal displays as a selectable option")
    public void administration_portal_displays_as_a_selectable_option() {
        Assert.assertTrue("Hey, Admin portal is not displayed",testPage.adminPortal.isDisplayed());

    }
    @When("I click on Administration Portal")
        public void i_click() throws InterruptedException {
            testPage.adminPortal.click();
            List<String> listOfTabs = new ArrayList<>(Driver.getDriver().getWindowHandles());
            Driver.getDriver().switchTo().window(listOfTabs.get(1));
        }
    @Then("a secondary tab is launched and I am taken into the Administration Portal")
    public void a_secondary_tab_is_launched_and_i_am_taken_into_the_administration_portal() {
        String actualResult = Driver.getDriver().getTitle();
        String expectedResult = "Pinnacle Series - Administration";
        Assert.assertEquals("This is fail", expectedResult, actualResult);
    }
    @Then("External Learning is displayed as a selectable option within the left-hand side menu")
    public void is_displayed_as_a_selectable_option_within_the_left_hand_side_menu() {
       // BrowserUtils.verifyElementDisplayed(adminHomePage.externalLearningBtn);
        Assert.assertTrue("Hey, External Learning is not displayed", adminHomePage.externalLearningBtn.isDisplayed());

    }
    @When("I click on External Learning")
    public void i_click_on_external_learning() {
        adminHomePage.externalLearningBtn.click();
        BrowserUtils.waitForVisibility(adminHomePage.recordManagement,2);
    }
    @Then("The Records Management and Setup Options are displayed")
    public void the_records_management_and_setup_options_are_displayed() {
        BrowserUtils.verifyElementDisplayed(adminHomePage.recordManagement);
        BrowserUtils.verifyElementDisplayed(adminHomePage.setupBnt);
    }
    @Then("I click on sign out")
    public void i_click_on_sign_out() {
        adminHomePage.signOutDropDown.click();
        adminHomePage.signOutBtn.click();
        Driver.closeDriver();

    }
    @When("I enter System Admin username")
    public void i_enter_system_admin_username() {
        testPage.username.sendKeys(ConfigurationReader.getProperty("username"));
    }
    @When("I select Qa testing tenant")
    public void i_select_qa_testing_tenant() {
        BrowserUtils.verifyElementDisplayed(adminHomePage.tenantSelectBox);
        Select select = new Select(adminHomePage.tenantSelectBox);
        select.selectByVisibleText("QA Testing");
    }
    @When("I click on Group tab")
    public void i_click_on_group_tab() {
     groupsPage.groupsBtn.click();
    }
    @When("click on any group")
    public void click_on_any_group() {
        for(WebElement each : groupsPage.nameTags) {
            if(!each.getText().equals("Administrator") && !each.getText().equals("Assignment Administrator Group Level")) {
                each.click();
                break;
            }
        }
    }
    @Then("the {string} button is displayed")
    public void the_button_is_displayed(String arg0) {
        BrowserUtils.verifyElementDisplayed(groupsPage.editGroupBtn);


    }
    @When("I click on {string} button")
    public void i_click_on_button(String arg0) {
        BrowserUtils.waitForClickability(groupsPage.editGroupBtn,2);
        groupsPage.editGroupBtn.click();
    }
    @Then("there is new {string} permission is displayed")
    public void there_is_new_permission_is_displayed(String string) {
        adminHomePage.AssignmentAdministratorBtn.getText();
        BrowserUtils.waitForVisibility(adminHomePage.AssignmentAdministratorBtn, 3);
      //  BrowserUtils.verifyElementDisplayed(adminHomePage.AssignmentAdministratorBtn);
    }

    @When("I enter Assignor username")
    public void i_enter_assignor_username() {
        testPage.username.sendKeys(ConfigurationReader.getProperty("username2"));

    }

    @Then("The Records Management is displayed")
    public void the_records_management_is_displayed() {
        adminHomePage.recordManagement.isDisplayed();
    }



}



