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
    private static final String FILTER_STATUS_IN_STOCK = "//a[@data-id='Є в наявності']";
    private static final String FILTER_STATUS_RUNNING_OUT = "//a[@data-id='Закінчується']";
    private static final String FILTER_STATUS_EXPECTED = "//a[@data-id='Очікується']";
    private static final String FILTER_STATUS_OUT_OF_STOCK = "//a[@data-id='Немає в наявності']";
    private static final String FILTER_STATUS_RAN_OUT = "//a[@data-id='Закінчився']";

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

    public WebElement getFilterStatusInStock() {
        return getVisibleElementByXpath(FILTER_STATUS_IN_STOCK);
    }

    public WebElement getFilterStatusRunningOut() {
        return getVisibleElementByXpath(FILTER_STATUS_RUNNING_OUT);
    }

    public WebElement getFilterStatusExpected() {
        return getVisibleElementByXpath(FILTER_STATUS_EXPECTED);
    }

    public WebElement getFilterStatusOutOfStock() {
        return getVisibleElementByXpath(FILTER_STATUS_OUT_OF_STOCK);
    }

    public WebElement getFilterStatusRanOut() {
        return getVisibleElementByXpath(FILTER_STATUS_RAN_OUT);
    }

    public void openPageOfFirstItem() {
        getListOfNamesOfItems().get(0).click();
    }

    public void checkFilterStatusInStock() throws InterruptedException {
        getFilterStatusInStock().click();
        Thread.sleep(1000);
    }

    public void checkFilterStatusRunningOut() throws InterruptedException {
        getFilterStatusRunningOut().click();
        Thread.sleep(1000);
    }

    public void checkFilterStatusExpected() throws InterruptedException {
        getFilterStatusExpected().click();
        Thread.sleep(1000);
    }

    public void checkFilterStatusOutOfStock() throws InterruptedException {
        getFilterStatusOutOfStock().click();
        Thread.sleep(1000);
    }

    public void checkFilterStatusRanOut() throws InterruptedException {
        getFilterStatusRanOut().click();
        Thread.sleep(1000);
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
