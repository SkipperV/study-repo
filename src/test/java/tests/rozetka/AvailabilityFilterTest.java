package tests.rozetka;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.rozetka.HeaderPage;
import pages.rozetka.ItemsListPage;

public class AvailabilityFilterTest extends BaseTest {

    @Test
    public void checkAvailabilityFilter() throws InterruptedException {
        openPage("https://rozetka.com.ua/ua/");

        HeaderPage headerPage = new HeaderPage(driver);
        ItemsListPage itemsListPage = new ItemsListPage(driver);

        headerPage.openTabletsApplePage();
        itemsListPage.clickFilterStatusInStock();

        Assert.assertEquals(itemsListPage.getQuantityOfShownItems(), itemsListPage.getQuantityOfAvailableItems());
        Assert.assertTrue(itemsListPage.isFilterStatusInStockEnabled());
    }
}
