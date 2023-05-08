package tests.rozetka;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.rozetka.HeaderPage;
import pages.rozetka.ItemsListPage;

public class SortingByAscendingPriceTest extends BaseTest {

    @Test
    public void checkSortingByAscendingPrice() throws InterruptedException {
        openPage("https://rozetka.com.ua/ua/");

        HeaderPage headerPage = new HeaderPage(driver);
        ItemsListPage itemsListPage = new ItemsListPage(driver);

        headerPage.openTabletsApplePage();
        itemsListPage.setSortByAscendingPrice();

        Assert.assertTrue(itemsListPage.areItemsSortedByAscendingPrice());
    }
}
