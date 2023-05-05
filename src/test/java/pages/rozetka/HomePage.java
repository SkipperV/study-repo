package pages.rozetka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {

    private static final String ITEMS_TITLES_LIST = "//li[@class='main-goods__cell ng-star-inserted']";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getItemsTitlesList() {
        return driver.findElements(By.xpath(ITEMS_TITLES_LIST));
    }
}
