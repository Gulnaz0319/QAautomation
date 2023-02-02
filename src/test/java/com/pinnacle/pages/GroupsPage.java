package com.pinnacle.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GroupsPage extends BasePage{
    @FindBy(xpath = "//*[contains(text(), 'Groups')]")
    public WebElement groupsBtn;

    @FindBy(xpath = "//div[@class='activeHightlight']")
    public List<WebElement> nameTags;


    @FindBy(xpath = "//div[.=\"Edit Group \"]")
    public WebElement editGroupBtn;

    @FindBy(xpath = "//div[@data-original-title=\"Content Manager\"]")
    public WebElement contentManagerGroup;

    @FindBy(xpath = "//div[.=\" Assignment Administrator \"]//img")
    public WebElement assignmentAdminToggleOnBtn;

    @FindBy(xpath = "//button[.=\"Save Changes\"]")
    public WebElement saveChangesBtn;

    @FindBy(xpath = "//div[.=\" Record Updated Successfully \"]")
    public WebElement toastSuccess;

    @FindBy(xpath = "//div[.=\"Assignment Administrator\"]//img")
    public WebElement AssigmentAdminIsEnabled;

}
