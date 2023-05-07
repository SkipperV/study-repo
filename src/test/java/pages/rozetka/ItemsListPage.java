package pages.rozetka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ItemsListPage extends BasePage {

    private static final String SHOWN_ITEMS_QUANTITY = "//p[@class='catalog-selection__label ng-star-inserted']";
    private static final String SORTING_DROPLIST = "//select[@class='select-css ng-untouched ng-pristine ng-valid ng-star-inserted']";
    private static final String SORTING_DROPLIST_RULES_LIST = "//select/option";
    private static final String ITEMS_NAMES_LIST = "//span[@class='goods-tile__title']";
    private static final String ITEMS_DISCOUNT_CURRENT_PRICES_LIST = "//div[@class='goods-tile__price price--red ng-star-inserted']//span[@class='goods-tile__price-value']";
    private static final String ITEMS_DISCOUNT_OLD_PRICES_LIST = "//div[contains(@class, 'goods-tile__price--old')]";
    private static final String ITEMS_ALL_CURRENT_PRICES_LIST = "//span[@class='goods-tile__price-value']";
    private static final String ITEMS_AVAILABILITY_AVAILABLE = "//div[contains(@class, 'goods-tile__availability--available')]";
    private static final String ITEMS_AVAILABILITY_WAITING_FOR_SUPPLY = "//div[@class='goods-tile__availability goods-tile__availability--waiting_for_supply ng-star-inserted']";
    private static final String FILTERS_LIST = "//a[@class='checkbox-filter__link']";
    private static final String FILTERS_ITEMS_QUANTITY_LIST = "//a[@class='checkbox-filter__link']/span";
    private static final String FILTERS_ACTIVE_LIST = "//a[@class='catalog-selection__link']";
    private static final String FILTERS_SELLER_ROZETKA = "//a[@data-id='Rozetka']";
    private static final String FILTER_BRAND_SAMSUNG = "//a[@data-id='Samsung']";
    private static final String FILTER_BRAND_XIAOMI = "//a[@data-id='Xiaomi']";
    private static final String FILTER_PRICE_MINIMUM = "//input[@formcontrolname='min']";
    private static final String FILTER_PRICE_MAXIMUM = "//input[@formcontrolname='max']";
    private static final String FILTER_PRICE_APPLY_BUTTON = "//button[@type='submit']";
    private static final String FILTER_STATUS_IN_STOCK = "//a[@data-id='Є в наявності']";
    private static final String FILTER_STATUS_RUNNING_OUT = "//a[@data-id='Закінчується']";
    private static final String FILTER_STATUS_WAITING_FOR_SUPPLY = "//a[@data-id='Очікується']";
    private static final String FILTER_STATUS_OUT_OF_STOCK = "//a[@data-id='Немає в наявності']";
    private static final String FILTER_STATUS_RAN_OUT = "//a[@data-id='Закінчився']";

    public ItemsListPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getQuantityOfShownItemsContainer() {
        return getVisibleElementByXpath(SHOWN_ITEMS_QUANTITY);
    }

    public WebElement getSortingRuleDropList() {
        return getVisibleElementByXpath(SORTING_DROPLIST);
    }

    public List<WebElement> getListOfSortingRules() {
        return getListOfVisibleElementsByXpath(SORTING_DROPLIST_RULES_LIST);
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

    public List<WebElement> getListOfItemsAvailableStatuses() {
        return getListOfVisibleElementsByXpath(ITEMS_AVAILABILITY_AVAILABLE);
    }

    public List<WebElement> getListOfItemsWaitingForSupplyStatuses() {
        return getListOfVisibleElementsByXpath(ITEMS_AVAILABILITY_WAITING_FOR_SUPPLY);
    }


    public List<WebElement> getListOfFilters() {
        return getListOfVisibleElementsByXpath(FILTERS_LIST);
    }

    public List<WebElement> getListOfFiltersItemsQuantity() {
        return getListOfVisibleElementsByXpath(FILTERS_ITEMS_QUANTITY_LIST);
    }

    public List<WebElement> getListOfActiveFilters() {
        return getListOfVisibleElementsByXpath(FILTERS_ACTIVE_LIST);
    }

    private WebElement getFilterSellerRozetka() {
        return getVisibleElementByXpath(FILTERS_SELLER_ROZETKA);
    }

    public WebElement getFilterBrandSamsung() {
        return getVisibleElementByXpath(FILTER_BRAND_SAMSUNG);
    }

    public WebElement getFilterBrandXiaomi() {
        return getVisibleElementByXpath(FILTER_BRAND_XIAOMI);
    }

    public WebElement getFilterPriceMinimum() {
        return getVisibleElementByXpath(FILTER_PRICE_MINIMUM);
    }

    public WebElement getFilterPriceMaximum() {
        return getVisibleElementByXpath(FILTER_PRICE_MAXIMUM);
    }

    public WebElement getFilterPriceApplyButton() {
        return getVisibleElementByXpath(FILTER_PRICE_APPLY_BUTTON);
    }

    public WebElement getFilterStatusInStock() {
        return getVisibleElementByXpath(FILTER_STATUS_IN_STOCK);
    }

    public WebElement getFilterStatusRunningOut() {
        return getVisibleElementByXpath(FILTER_STATUS_RUNNING_OUT);
    }

    public WebElement getFilterStatusWaitingForSupply() {
        return getVisibleElementByXpath(FILTER_STATUS_WAITING_FOR_SUPPLY);
    }

    public WebElement getFilterStatusOutOfStock() {
        return getVisibleElementByXpath(FILTER_STATUS_OUT_OF_STOCK);
    }

    public WebElement getFilterStatusRanOut() {
        return getVisibleElementByXpath(FILTER_STATUS_RAN_OUT);
    }

    public int getQuantityOfShownItems() {
        return Integer.parseInt(getQuantityOfShownItemsContainer().getText().split(" ")[1]);
    }

    public int getQuantityOfAvailableItems() {
        return getListOfItemsAvailableStatuses().size();
    }

    public int getQuantityOfWaitingForSupplyItems() {
        return getListOfItemsWaitingForSupplyStatuses().size();
    }

    public boolean doesEveryItemContainStringInName(String string) {
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
        int oldPrice;
        int currentPrice;

        for (int i = 0; i < oldPrices.size(); i++) {
            oldPrice = Integer
                    .parseInt(oldPrices.get(i)
                            .getText()
                            .replace(" ", "")
                            .replace("₴", ""));
            currentPrice = Integer
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

    public boolean isEveryItemPricePlacedInBounds(int min, int max) {
        List<WebElement> allPricesList = getListOfAllCurrentPricesOfItems();
        int price;

        for (WebElement priceWebElement : allPricesList) {
            price = Integer
                    .parseInt(priceWebElement
                            .getText()
                            .replace(" ", "")
                            .replace("₴", ""));
            if (price < min || price > max) {
                return false;
            }
        }
        return true;
    }

    public boolean isFilterStatusInStockEnabled() {
        for (WebElement webElement : getListOfActiveFilters()) {
            if (webElement.getText().equals("Є в наявності")) {
                return true;
            }
        }
        return false;
    }

    public boolean isFilterBrandXiaomiEnabled() {
        for (WebElement webElement : getListOfActiveFilters()) {
            if (webElement.getText().equals("Xiaomi")) {
                return true;
            }
        }
        return false;
    }

    public boolean isPriceFilterEnabled(int min, int max) {
        for (WebElement webElement : getListOfActiveFilters()) {
            if (webElement.getText().contains(min + " - " + max)) {
                return true;
            }
        }
        return false;
    }

    public boolean areItemsSortedByAscendingPrice() {
        List<WebElement> allPricesList = getListOfAllCurrentPricesOfItems();
        int price;
        int prevPrice = Integer
                .parseInt(allPricesList.get(0)
                        .getText()
                        .replace(" ", "")
                        .replace("₴", ""));
        for (int i = 1; i < allPricesList.size(); i++) {
            price = Integer
                    .parseInt(allPricesList.get(i)
                            .getText()
                            .replace(" ", "")
                            .replace("₴", ""));
            if (price < prevPrice) {
                if (!(getQuantityOfAvailableItems() == i - 1)) {
                    if (!(getQuantityOfWaitingForSupplyItems() + getQuantityOfAvailableItems() == i - 1)) {
                        return false;
                    }
                }
            }
            prevPrice = price;
        }
        return true;
    }

    public void openPageOfFirstItem() {
        getListOfNamesOfItems().get(0).click();
    }

    public void clickFilterSellerRozetka() throws InterruptedException {
        getFilterSellerRozetka().click();
        Thread.sleep(1000);
    }

    public void clickFilterBrandSamsung() throws InterruptedException {
        getFilterBrandSamsung().click();
        Thread.sleep(1000);
    }

    public void clickFilterBrandXiaomi() throws InterruptedException {
        getFilterBrandXiaomi().click();
        Thread.sleep(1000);
    }

    public void typeInFilterMinimumPrice(String string) {
        getFilterPriceMinimum().clear();
        getFilterPriceMinimum().sendKeys(string);
    }

    public void typeInFilterMaximumPrice(String string) {
        getFilterPriceMaximum().clear();
        getFilterPriceMaximum().sendKeys(string);
    }

    public void clickSetFilterPriceApplyButton() {
        getFilterPriceApplyButton().click();
    }

    public void setPriceFilter(int min, int max) throws InterruptedException {
        typeInFilterMinimumPrice(Integer.toString(min));
        typeInFilterMaximumPrice(Integer.toString(max));
        clickSetFilterPriceApplyButton();
        Thread.sleep(1000);
    }

    public void clickFilterStatusInStock() throws InterruptedException {
        getFilterStatusInStock().click();
        Thread.sleep(1000);
    }

    public void clickFilterStatusRunningOut() throws InterruptedException {
        getFilterStatusRunningOut().click();
        Thread.sleep(1000);
    }

    public void clickFilterStatusWaitingForSupply() throws InterruptedException {
        getFilterStatusWaitingForSupply().click();
        Thread.sleep(1000);
    }

    public void clickFilterStatusOutOfStock() throws InterruptedException {
        getFilterStatusOutOfStock().click();
        Thread.sleep(1000);
    }

    public void clickFilterStatusRanOut() throws InterruptedException {
        getFilterStatusRanOut().click();
        Thread.sleep(1000);
    }

    public void setSortByAscendingPrice() throws InterruptedException {
        getSortingRuleDropList().click();
        getListOfSortingRules().get(1).click();
        Thread.sleep(1000);
    }
}
