package com.pinnacle.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminHomePage extends BasePage{
    @FindBy(xpath = "//a[@id='ExternalLearningDropDown']")
    public WebElement externalLearningBtn;

    @FindBy(xpath = "//a[.=\"Setup\"]")
    public WebElement setupBnt;

    @FindBy(xpath = "//span[contains(text(), 'External Learning Setup')]")
    public WebElement setupPageTitle;

    @FindBy(xpath = "//*[contains(text(), 'Attributes')]")
    public WebElement attributesBtn;

    @FindBy(xpath = "//*[contains(text(), 'Activities')]")
    public WebElement activitiesTab;

    @FindBy(xpath = "//div[@class='dropdown-toggle']")
    public WebElement signOutDropDown;

    @FindBy(xpath = "//a[contains(text(), 'Sign Out')]")
    public WebElement signOutBtn;

    @FindBy(xpath = "//select[@class='combobox form-control input-lg ng-untouched ng-pristine ng-valid']")
    public WebElement tenantSelectBox;


    @FindBy(xpath = " //div[@class='permissions_user'][1]")
    public WebElement AssignmentAdministratorBtn;
    //div[.=" Assignment Administrator "]

    @FindBy(xpath = "//span[.=\"Record Management\"]")
    public WebElement recordManagement;

    @FindBy(xpath = "//span[.=\"Setup\"]")
    public WebElement setUpOption;

}
