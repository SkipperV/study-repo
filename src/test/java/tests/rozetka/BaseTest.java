package tests.rozetka;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.List;

public class BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void openWindow() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void closeWindow() {
        driver.quit();
    }

    public void openPage(String url) {
        driver.get(url);
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }

    public List<String> getPages() {
        return new ArrayList<>(driver.getWindowHandles());
    }

    public void closePage() {
        new Actions(driver)
                .keyDown(Keys.CONTROL).sendKeys("w").keyUp(Keys.CONTROL).perform();
        driver.close();
        switchTo(1);
    }

    public void switchTo(int i) {
        driver.switchTo().window(getPages().get(i-1));
    }

    public boolean doesLinkContain(String string) {
        return getURL().contains(string);
    }
}
