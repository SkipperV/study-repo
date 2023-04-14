package seleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class initMethods {
    WebDriver driver;

    @BeforeMethod
    public void openWindow() {
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void closeWindow() {
        driver.quit();
    }
}
