package tests.rozetka;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.rozetka.HeaderPage;
import pages.rozetka.ItemsListPage;

public class FiltersTest extends BaseTest {

    @Test
    public void checkFiltersForApplication() throws InterruptedException {
        openPage("https://rozetka.com.ua/ua/");

        HeaderPage headerPage = new HeaderPage(driver);
        ItemsListPage itemsListPage = new ItemsListPage(driver);
        int shownItems_1;
        int shownItems_2;

        headerPage.openPhonesApplePage();
        shownItems_1 = itemsListPage.getQuantityOfShownItems();

        itemsListPage.checkFilterBrandSamsung();
        shownItems_2 = itemsListPage.getQuantityOfShownItems();

        Assert.assertNotEquals(shownItems_1, shownItems_2);
    }
}
