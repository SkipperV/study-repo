package tests.rozetka;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.rozetka.HeaderPage;
import pages.rozetka.ItemsListPage;

public class ItemsSalePricesTest extends BaseTest {

    @Test
    public void checkItemsSalePrices() throws InterruptedException {
        openPage("https://rozetka.com.ua/ua/");

        HeaderPage headerPage = new HeaderPage(driver);
        ItemsListPage itemsListPage = new ItemsListPage(driver);

        headerPage.openTabletsApplePage();

        Assert.assertTrue(itemsListPage.doesEveryItemOnSaleHaveLowerCurrentPrice());
    }
}
