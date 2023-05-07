package pages.rozetka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getVisibleElementByXpath(String element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
        return driver.findElement(By.xpath(element));
    }

    public List<WebElement> getListOfVisibleElementsByXpath(String element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(element)));
        return driver.findElements(By.xpath(element));
    }

    public void scrollTo(WebElement webElement) {
        new Actions(driver)
                .scrollToElement(webElement)
                .perform();
    }
}
