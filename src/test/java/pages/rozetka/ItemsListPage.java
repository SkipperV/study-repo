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

    public List<WebElement> getListOfNamesOfItems() {
        return getListOfVisibleElementsByXpath(ITEMS_NAMES_LIST);
    }

    public List<WebElement> getListOfCurrentPricesOfItemsOnSale() {
        return getListOfVisibleElementsByXpath(ITEMS_DISCOUNT_CURRENT_PRICES_LIST);
    }

    public List<WebElement> getListOfOldPricesOfItemsOnSale() {
        return getListOfVisibleElementsByXpath(ITEMS_DISCOUNT_OLD_PRICES_LIST);
    }

    public List<WebElement> getListOfAllCurrentPricesOfItems() {
        return getListOfVisibleElementsByXpath(ITEMS_ALL_CURRENT_PRICES_LIST);
    }

    public List<WebElement> getListOfFilters() {
        return getListOfVisibleElementsByXpath(FILTERS_LIST);
    }

    public List<WebElement> getListOfFiltersItemsQuantity() {
        return getListOfVisibleElementsByXpath(FILTERS_ITEMS_QUANTITY_LIST);
    }

    public void openPageOfFirstItem() {
        getListOfNamesOfItems().get(0).click();
    }

    public boolean doesEveryItemContainInName(String string) {
        for (WebElement itemName : getListOfNamesOfItems()) {
            if (!itemName.getText().contains(string)) {
                return false;
            }
        }
        return true;
    }

    public boolean doesEveryItemOnSaleHaveLowerCurrentPrice() {
        List<WebElement> oldPrices = getListOfOldPricesOfItemsOnSale();
        List<WebElement> currentPrices = getListOfCurrentPricesOfItemsOnSale();

        for (int i = 0; i < oldPrices.size(); i++) {
            int oldPrice = Integer
                    .parseInt(oldPrices.get(i)
                            .getText()
                            .replace(" ", "")
                            .replace("₴", ""));
            int currentPrice = Integer
                    .parseInt(currentPrices.get(i)
                            .getText()
                            .replace(" ", "")
                            .replace("₴", ""));
            if (currentPrice >= oldPrice) {
                return false;
            }
        }
        return true;
    }
}
