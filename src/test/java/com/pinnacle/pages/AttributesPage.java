package com.pinnacle.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AttributesPage extends BasePage {
    @FindBy(xpath = "//*[contains(text(), 'External Learning Attributes')]")
    public WebElement ExternalLearningAttributes;

    @FindBy(xpath = "//img[@id= 'attrTrashImage_18acaaed-e94c-402b-9eca-d03dc91aff33']")
    public WebElement deleteBtn;

    @FindBy(xpath = "//div[@class='modal-header m_content pad15']")
    public WebElement deleteModal;

    @FindBy(xpath = "//div[.='Are you sure you wish to delete the Attribute and all associated data? All related attribute data will be lost.']")
    public WebElement textOfModal;

    @FindBy(xpath = "//button[@buttontype='normal']")
    public WebElement cancelOption;

    @FindBy(xpath = "//button[@buttontype='danger']")
    public WebElement deleteOption;

}
