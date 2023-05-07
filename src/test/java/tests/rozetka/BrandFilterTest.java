package tests.rozetka;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.rozetka.HeaderPage;
import pages.rozetka.ItemsListPage;

public class BrandFilterTest extends BaseTest {

    @Test
    public void checkBrandFilter() throws InterruptedException {
        openPage("https://rozetka.com.ua/ua/");

        HeaderPage headerPage = new HeaderPage(driver);
        ItemsListPage itemsListPage = new ItemsListPage(driver);

        headerPage.openPowerbanksPage();
        itemsListPage.clickFilterBrandXiaomi();
        itemsListPage.clickFilterSellerRozetka();

        Assert.assertTrue(itemsListPage.doesEveryItemContainStringInName("Xiaomi"));
        Assert.assertTrue(itemsListPage.isFilterBrandXiaomiEnabled());
    }
}
