package tests.rozetka;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.rozetka.HeaderPage;
import pages.rozetka.ItemsListPage;

public class SearchTest extends BaseTest {

    @Test
    public void checkSearch() {
        openPage("https://rozetka.com.ua/ua/");

        HeaderPage headerPage = new HeaderPage(driver);
        ItemsListPage itemsListPage = new ItemsListPage(driver);
        String searchText = "iPhone 14";

        headerPage.writeInSearchBar(searchText);
        headerPage.clickSearchButton();

        Assert.assertTrue(itemsListPage.doesEveryItemContainInName(searchText));
    }
}
