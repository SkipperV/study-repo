package pages.rozetka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ItemsListPage extends BasePage {

    private static final String ITEMS_NAMES_LIST = "//span[@class='goods-tile__title']";
    private static final String ITEMS_DISCOUNT_CURRENT_PRICES_LIST = "//div[@class='goods-tile__price price--red ng-star-inserted']//span[@class='goods-tile__price-value']";
    private static final String ITEMS_DISCOUNT_OLD_PRICES_LIST = "//div[contains(@class, 'goods-tile__price--old')]";
    private static final String ITEMS_ALL_CURRENT_PRICES_LIST = "//span[@class='goods-tile__price-value']";
    private static final String FILTERS_LIST = "//a[@class='checkbox-filter__link']";
    private static final String FILTERS_ITEMS_QUANTITY_LIST = "//a[@class='checkbox-filter__link']/span";

    public ItemsListPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getListOfItemsNames() {
        return getListOfVisibleElementsByXpath(ITEMS_NAMES_LIST);
    }

    public List<WebElement> getListOfItemsDiscountCurrentPrices() {
        return getListOfVisibleElementsByXpath(ITEMS_DISCOUNT_CURRENT_PRICES_LIST);
    }

    public List<WebElement> getListOfItemsDiscountOldPrices() {
        return getListOfVisibleElementsByXpath(ITEMS_DISCOUNT_OLD_PRICES_LIST);
    }

    public List<WebElement> getListOfItemsAllCurrentPrices() {
        return getListOfVisibleElementsByXpath(ITEMS_ALL_CURRENT_PRICES_LIST);
    }

    public List<WebElement> getListOfFilters() {
        return getListOfVisibleElementsByXpath(FILTERS_LIST);
    }

    public List<WebElement> getListOfFiltersItemsQuantity() {
        return getListOfVisibleElementsByXpath(FILTERS_ITEMS_QUANTITY_LIST);
    }

    public void openPageOfFirstItem() {
        getListOfItemsNames().get(0).click();
    }
}
