package com.pinnacle.pages;

import com.pinnacle.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
   public BasePage(){

      PageFactory.initElements(Driver.getDriver(),this);
   }
}
