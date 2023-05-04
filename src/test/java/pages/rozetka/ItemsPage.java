package pages.rozetka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ItemsPage extends BasePage {

    private static final String ITEMS_NAMES_LIST = "//span[@class='goods-tile__title']";
    private static final String ITEMS_DISCOUNT_CURRENT_PRICES_LIST = "//div[@class='goods-tile__price price--red ng-star-inserted']//span[@class='goods-tile__price-value']";
    private static final String ITEMS_DISCOUNT_OLD_PRICES_LIST = "//div[contains(@class, 'goods-tile__price--old')]";
    private static final String ITEMS_ALL_CURRENT_PRICES_LIST = "//span[@class='goods-tile__price-value']";
    private static final String FILTERS_LIST = "//a[@class='checkbox-filter__link']";
    private static final String FILTERS_ITEMS_QUANTITY_LIST = "//a[@class='checkbox-filter__link']/span";

    public ItemsPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getItemsNamesList() {
        return driver.findElements(By.xpath(ITEMS_NAMES_LIST));
    }

    public List<WebElement> getItemsDiscountCurrentPricesList() {
        return driver.findElements(By.xpath(ITEMS_DISCOUNT_CURRENT_PRICES_LIST));
    }

    public List<WebElement> getItemsDiscountOldPricesList() {
        return driver.findElements(By.xpath(ITEMS_DISCOUNT_OLD_PRICES_LIST));
    }

    public List<WebElement> getItemsAllCurrentPricesList() {
        return driver.findElements(By.xpath(ITEMS_ALL_CURRENT_PRICES_LIST));
    }

    public List<WebElement> getFiltersList() {
        return driver.findElements(By.xpath(FILTERS_LIST));
    }

    public List<WebElement> getFiltersItemsQuantityList() {
        return driver.findElements(By.xpath(FILTERS_ITEMS_QUANTITY_LIST));
    }
}
