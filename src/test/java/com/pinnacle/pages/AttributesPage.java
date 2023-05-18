package com.pinnacle.pages;

import com.pinnacle.utilities.Driver;
import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;
import java.util.List;

public class AttributesPage extends BasePage {
    @FindBy(xpath = "//*[contains(text(), 'External Learning Attributes')]")
    public WebElement ExternalLearningAttributes;

    @FindBy(xpath = "//p[contains(text(), ' Attributes')]")
    public WebElement Attributes;


    @FindBy(xpath = "//img[@id= 'attrTrashImage_18acaaed-e94c-402b-9eca-d03dc91aff33']")
    public WebElement deleteBtn;

    @FindBy(xpath = "//div[@class='modal-header m_content pad15']")
    public WebElement deleteModal;

    @FindBy(xpath = "//div[.='Are you sure you wish to delete the Attribute and all associated data? All related attribute data will be lost.']")
    public WebElement textOfModal;

    @FindBy(xpath = "//div[@id='confirm-delete-attribute']//button[@buttontype='normal']")
    public WebElement cancelOption;

    @FindBy(xpath = "//button[@buttontype='danger']")
    public WebElement deleteOption;

    @FindBy(xpath = "//div[@class='cdk-drag extLearningAttr row disabled-attribute-row ng-star-inserted'][1]")
    public WebElement mouseHover;

    @FindBy(xpath = "//*[@id='attrName_51bb12f4-64b6-4f02-99ed-5fd131a4e75a']")
    public WebElement attribute;

    @FindBy(xpath = "//*[@id='newAttrNameInput']")
    public WebElement newAttributeInput;

    @FindBy(xpath = "//*[@id='dropdownMenu1']")
public WebElement datatypeDropDown;

    @FindBy(xpath = "//*[contains(text(), ' Long Form Text')]")
    public WebElement longFormTextDatatype;

    @FindBy(xpath = "//*[@src='assets/images/check-mark.svg']")
    public WebElement textCheckMark;

    @FindBy(xpath = "//*[contains(text(), ' Text')]")
    public WebElement textDataType;

    @FindBy(xpath = "//div[@class='colpadding col6Img center']//*[contains(text(), ' Save ')]")
    public WebElement saveBtn;

    @FindBy(xpath = "//*[@id='attrName_3718f22c-dd9a-4b82-b777-f45385965828']")
    public WebElement newAttribute;

    @FindBy(xpath = "//*[contains(text(), 'Attribute Name and Data Type must be unique.')]")
    public WebElement sameNameErrorToast;
    @FindBy(xpath = "//img[@src='assets/images/Information.svg']")
    public WebElement attributesTooltip;

    @FindBy(xpath = "//span[contains(text(), 'Training Title')]")
    public WebElement trainingTitle;

    @FindBy (xpath = "//label[.='Attribute']//..//input")
    public List<WebElement>attributes;

    @FindBy(xpath = "//span[contains(text(), 'Training Provider')]")
    public WebElement trainingProvider;

    @FindBy(xpath = "//*[contains(text(), ' Add Attribute ')]")
    public WebElement addNewAttribute;

    @FindBy(xpath = "//*[contains(text(), ' External Learning Attributes ')]")
    public WebElement getExternalLearningAttributes;

    @FindBy(xpath = "//*[@class='attrHeader']//*[@src='assets/images/Information.svg']")
    public WebElement getAttributesPageTooltip;

    @FindBy(xpath = "//div[@class='attrHeader']")
    public WebElement  toolTip;
    @FindBy (xpath = "//div[@class='colpadding col6Img']//img[@id]//..//..//input")
    public WebElement deletedAttributeId;

    public String GetTheIdOfAnElement()
    {
        WebElement getId = Driver.getDriver().findElement(By.xpath("//div[@class='colpadding col6Img']//img[@id]//..//..//input"));
        return getId.getAttribute("id");

    }
    public WebElement LocateWebElement(String id)
    {
        return Driver.getDriver().findElement(By.xpath("//div[@class='colpadding col6Img']//img[@id]//..//..//input[@id='"+id+"']"));
    }



    public void isAttributeDisplayed(String newId){
        WebElement dynamicAttribute = Driver.getDriver().findElement(By.xpath("//*[@id='"+newId+"']"));
        Assert.assertFalse(dynamicAttribute.isDisplayed());
    }


}
