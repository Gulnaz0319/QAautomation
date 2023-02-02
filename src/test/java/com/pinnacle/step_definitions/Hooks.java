package com.pinnacle.step_definitions;

import com.pinnacle.pages.BasePage;
import com.pinnacle.utilities.Driver;
import io.cucumber.java.Scenario;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends BasePage {
    @BeforeClass
    public void setUp(){

        System.out.println("BEFORE - setup method is running before the scenario");
    }
    @AfterClass
    public void tearDownScenario(Scenario scenario){
        /**
         * Scenario scaenario: represents current running cucumber scenario
         * -cast webdriver to TakeScreenshots interface(TakeScreenshot)Driver.getDriver()
         * -call getScreenShotAs method and output type as OutputType.BYTES
         * - save the result into array: byte[] image
         * attach the image into the scenario html report: scenario.attach(image, "image/png", scenario.getName());
         */
        byte[] image = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(image, "image/png", scenario.getName());

        System.out.println("AFTER - tearDown method is running after the scenario:" + scenario.getName());
        Driver.closeDriver();

    }

}
