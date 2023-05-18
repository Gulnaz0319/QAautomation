package com.pinnacle.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivitiesPage extends BasePage {
    @FindBy(xpath = "//img[@src='assets/img/associated-learning/checkbox_checked.svg']")
    public WebElement activityCheckBox;

    @FindBy(xpath = "//button[@iconuri='assets/images/Edit.svg']")
    public WebElement editBtn;

    @FindBy(xpath = "//img[@src='assets/images/Information.svg']")
    public WebElement tooltip;

    @FindBy(xpath = "//p[contains(text(), ' Activities ')]")
    public WebElement activitiesPage;

    @FindBy(xpath = "//img[@src='assets/images/Information.svg']")
    public WebElement activitiesTextTooltip;

    @FindBy(xpath = "//span[contains(text(), 'Training Title')]")
    public WebElement trainingTitle;

    @FindBy(xpath = "//span[contains(text(), 'Training Provider')]")
    public WebElement trainingProvider;

    @FindBy(xpath = "//span[contains(text(), 'Active')]")
    public WebElement activeStatusColumn;

    @FindBy(xpath = "//button[@iconuri='assets/img/associated-learning/plus.svg']")
    public WebElement AddNewActivityBtn;

    @FindBy(xpath = "//button[@iconuri='assets/images/Edit.svg']")
    public WebElement editActivityBtn;

    @FindBy(xpath = "//img[@src='assets/img/associated-learning/toggle_on.svg']")
    public WebElement activityStatus;

    @FindBy(xpath = "//a[.=\"Setup\"]")
    public WebElement setupBnt;

    @FindBy(xpath = "//span[contains(text(), 'External Learning Setup')]")
    public WebElement setupPageTitle;

    @FindBy(xpath = "//*[contains(text(), 'Attributes')]")
    public WebElement attributesBtn;

    @FindBy(xpath = "//*[contains(text(), 'Activities')]")
    public WebElement activitiesTab;

    @FindBy(xpath = "//*[contains(text(), ' Attributes ')]")
    public WebElement attributesTab;
}
