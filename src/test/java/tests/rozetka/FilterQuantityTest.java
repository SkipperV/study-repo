package tests.rozetka;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.rozetka.HeaderPage;
import pages.rozetka.ItemsListPage;

public class FilterQuantityTest extends BaseTest{

    @Test
    public void checkFilterForRightItemQuantity() throws InterruptedException {
        openPage("https://rozetka.com.ua/ua/");

        HeaderPage headerPage = new HeaderPage(driver);
        ItemsListPage itemsListPage = new ItemsListPage(driver);
        int filterItemsQuantity;
        int shownItemsQuantity;

        headerPage.openTabletsCategoryPage();
        filterItemsQuantity = itemsListPage.getFilterItemsQuantity(itemsListPage.getFilterPosition("Apple"));
        itemsListPage.clickFilterBrandApple();
        shownItemsQuantity = itemsListPage.getQuantityOfShownItems();

        Assert.assertEquals(shownItemsQuantity, filterItemsQuantity);
    }
}
