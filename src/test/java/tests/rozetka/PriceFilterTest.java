package tests.rozetka;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.rozetka.HeaderPage;
import pages.rozetka.ItemsListPage;

public class PriceFilterTest extends BaseTest {

    @Test
    public void checkPriceFilter() throws InterruptedException {
        openPage("https://rozetka.com.ua/ua/");

        HeaderPage headerPage = new HeaderPage(driver);
        ItemsListPage itemsListPage = new ItemsListPage(driver);
        int minimumPrice = 80000;
        int maximumPrice = 80500;

        headerPage.openLaptopsCategoryPage();
        itemsListPage.setPriceFilter(minimumPrice, maximumPrice);

        Assert.assertTrue(itemsListPage.isEveryItemPricePlacedInBounds(minimumPrice, maximumPrice));
        Assert.assertTrue(itemsListPage.isPriceFilterEnabled(minimumPrice, maximumPrice));
    }
}
