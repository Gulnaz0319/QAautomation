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

}
