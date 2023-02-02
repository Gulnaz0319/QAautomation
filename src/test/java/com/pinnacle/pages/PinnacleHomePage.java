package com.pinnacle.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PinnacleHomePage extends BasePage{
    @FindBy(xpath= "//input[@name='Email']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='Password']")
    public WebElement passwords;

    @FindBy(xpath = "//button[@class='btn btn-lg btn-block themed-button']")
    public WebElement signInBtn;

    @FindBy(xpath = "//i[@title='Home']")
    public WebElement homePage;
    @FindBy(xpath = "//i[@class = 'fa fa-cog iconHeight']")
    public WebElement config;

    @FindBy(xpath = "//a[contains(text(),'Administration Portal')]")
    public WebElement adminPortal;

    @FindBy(xpath = "//*[contains(text(),'Admin Home')]")
    public WebElement pageTitle;

    @FindBy(xpath = "//i[@class='fa fa-cog iconHeight']")
    public WebElement gearIcon;

    @FindBy(xpath="//a[@id='ExternalLearningDropDown']")
    public WebElement externalLearningBtn;


}



