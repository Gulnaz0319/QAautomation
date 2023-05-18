import com.pinnacle.utilities.ConfigurationReader;
import com.pinnacle.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {
      WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.com/");
        Driver.getDriver().get(ConfigurationReader.getProperty("el.url"));
        Thread.sleep(2000);
        Driver.closeDriver();
        List<WebElement> rowsNumber = driver.findElements(By.xpath("//div[@class='existing-items-container']"));
        int rowCount = rowsNumber.size();
        System.out.println("No of rows in this table : " + rowCount);
    }
}
