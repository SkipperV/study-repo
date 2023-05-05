package tests.rozetka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void openWindow() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void closeWindow() {
//        driver.quit();
    }

    public void openPage(String url) {
        driver.get(url);
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }
}
