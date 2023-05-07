package tests.rozetka;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.rozetka.HeaderPage;
import pages.rozetka.ItemsListPage;

import java.util.List;

public class PriceTagsExistenceTest extends BaseTest {

    @Test
    public void checkExistenceOfPriceTagsOnAvailableItems() throws InterruptedException {
        openPage("https://rozetka.com.ua/ua/");

        List<WebElement> items;
        List<WebElement> priceTags;
        HeaderPage headerPage = new HeaderPage(driver);
        ItemsListPage itemsListPage = new ItemsListPage(driver);

        headerPage.openPhonesApplePage();
        itemsListPage.clickFilterStatusInStock();

        items = itemsListPage.getListOfNamesOfItems();
        priceTags = itemsListPage.getListOfAllCurrentPricesOfItems();

        Assert.assertEquals(items.size(), priceTags.size());
    }
}
