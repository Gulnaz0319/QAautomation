package com.pinnacle.pages;

import com.pinnacle.utilities.Driver;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RecordManagementPage extends BasePage{

    @FindBy(xpath = "//div[@class='topmenu']//span[contains(text(), 'External Learning Record Management')]")
    public WebElement recordManagementPage;
    @FindBy(xpath = "//*[contains(text(),'Add New')]" )
    public WebElement addNewRecordBtn;

    @FindBy(xpath = "//*[contains(text(), ' Add Record Manually ')]")
    public WebElement addRecordManuallyBtn;

    @FindBy(xpath = "//input[@class='floating-input ng-untouched ng-pristine ng-valid']")
    public WebElement userInputField;

    @FindBy(xpath = "//*[contains(text(), ' Create Record ')]")
    public WebElement createRecordInAddNewRecordModal;

    @FindBy(xpath = "//*[contains(text(), '*Select Activity')]")
    public WebElement selectActivityDropDown;

    @FindBy(xpath = "//div[@class='attributes-body']//div[@class='floating-label ff']")
    public WebElement userListDropDown;

    @FindBy(xpath = "//div[@class='userListDisplay']")
    public WebElement myUser;

    @FindBy(xpath = "//*[@class='activity-scroll-menu-item']")
    public WebElement randomActivity;

    @FindBy(xpath = "//*[@class='floating-input ng-untouched ng-pristine ng-invalid']")
    public WebElement completedDateField;

    @FindBy(xpath = "//*[contains(text(), ' Record added.')]")
    public WebElement successToastMessage;

    //>>>    //*[contains(text(), ' Record added.')]
//*[@class='ng-tns-c47-2 toast-message ng-star-inserted']
    @FindBy(xpath = "//*[contains(text(), ' Other ')]")
    public WebElement otherActivity;

    @FindBy(xpath = "//*[@class='form-row']//*[contains(text(), '*Training Title')]")
   public WebElement trainingTitleField;

//    @FindBy(xpath = "//div[@class='floating-label ff']//*[contains(text(), '*Training Title')]")
//    public WebElement trainingTitleField;

    @FindBy(xpath = " //*[contains(text(),' Records from Spreadsheet ')]")
    public WebElement importRecordBtn;

    @FindBy(xpath = " //*[contains(text(),' Import Records from Spreadsheet ')]")   //not unique
    public WebElement importRecordModal;

    @FindBy(xpath = " //*[contains(text(),' Drag and Drop files here ')]")
    public WebElement dragAndDrop;

    @FindBy(xpath = "//span[@class='drag-and-drop-text-color']")
    public WebElement dragAndDrop2;

    @FindBy(xpath = "//*[contains(text(),' Import Records Options ')] ")
    public WebElement importRecordsOptionModal;

    @FindBy(xpath = "//table[@id='user-virtual-table']//tr[@id='EERow0']//td[1]//img[1]")
    public  WebElement firstRecordCheckBox;

    @FindBy(xpath = "//button[@data-original-title='Edit Record']")
    public WebElement editRecordBtn;

    @FindBy(xpath = "//button[@data-original-title='Delete Record']")
    public WebElement deleteRecordOpn;

    @FindBy(xpath = "//button[@data-original-title='Export Records']")
    public WebElement exportBtn;

    @FindBy(xpath = "//table[@id='user-virtual-table']//tr[@id='EERow0']")
    public WebElement firstRecordRow;

    @FindBy(xpath = "//div[@class='modal-dialog modal-dialog-centered']//div[@class='modal-content confirmation-modal pad15'")
    public WebElement deleteRecordModal;

    //DELETE RECORD MODAL
    @FindBy(xpath = "//div[@id='confirm-delete-single-modal']//div[@class='modal-content confirmation-modal pad15']//*[@class='btn btn-light']")
    public WebElement cancelBtnOnDRModalFromEllipsis;

    @FindBy(xpath = "//div[@class='modal-dialog modal-dialog-centered']//div[@class='modal-content confirmation-modal pad15']//*[@class='btn btn-light']")
    public WebElement cancelBtnOnDRModal;

    @FindBy(xpath = "//div[@class='modal fade show']//button[@buttontype='danger']//div[contains(text(), ' Delete ')]")
    public WebElement deleteBtnOnDRModal;

    @FindBy(xpath = "//div[@class='modal-dialog modal-dialog-centered']//p[contains(text(), 'Delete Record')]")
    public WebElement deleteRecordModal2;

    @FindBy(xpath = "//div[contains(text(), ' Record deleted successfully. ')]")
    public WebElement recordDeletedToast;

    @FindBy(xpath = "//div[contains(text(), ' Records deleted successfully. ')]")
    public WebElement recordsDeletedToast;

//ELLIPSIS MENU -- > first Record
    @FindBy(xpath = "//table[@id='user-virtual-table']//tr[@id='EERow0']//td[@style='position: sticky; right: 0px; overflow: visible; background-color: rgb(255, 255, 255);']")
    public WebElement firstRecordEllipsis;

    @FindBy(xpath = "//table[@id='user-virtual-table']//tr[@id='EERow0']//td[@style='position: sticky; right: 0px; overflow: visible; background-color: rgb(255, 255, 255);']//li[@data-toggle='modal']//*[contains(text(), ' Delete ')]")
    public WebElement deleteBtnFromEllipsisMenu;

    @FindBy(xpath = "//div[@id='confirm-delete-single-modal']//div[@class='modal-content confirmation-modal pad15']")
    public WebElement deleteRecordModalFromEllipsis;

    @FindBy(xpath = "//table[@id='user-virtual-table']//tr[@class='EERow unselected']//td[@class='check-column-cell']")
    public WebElement allRowCheckboxes;
    // Delete Modal - > //div[@class='modal-dialog modal-dialog-centered']//div[@class='modal-content confirmation-modal pad15']

    @FindBy(xpath = "//*[contains(text(), 'Delete Records')]")
    public WebElement deleteRecordsModal;

    @FindBy(xpath = "//button[@data-original-title='Edit Record']")
    public WebElement editRecordOpn;

    //EDIT  EXISTING RECORD MODAL
    @FindBy(xpath = "//div[@id='add-record-manually']//*[contains(text(), ' Edit Existing Record ')]")
    public WebElement editExistingRecordModal;
    //  //div[@class='modal-dialog modal-dialog-centered ng-star-inserted']//*[contains(text(), ' Edit Existing Record ')]

    //  //div[@id='add-record-manually']//*[contains(text(), ' Edit Existing Record ')]
    @FindBy(xpath = "//*[contains(text(), ' Save ')]")
    public  WebElement saveBtnOnTheEditExistingRecordModal;

    @FindBy(xpath = "//div[@class='scroll-menu']//*[@class='floating-label ff']//*[@class='floating-input ng-untouched ng-pristine ng-valid']")
    public WebElement completedDateOnEditRcrModal;
}
