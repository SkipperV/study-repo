package tests.rozetka;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.rozetka.HeaderPage;
import pages.rozetka.ItemMainPage;
import pages.rozetka.ItemsListPage;

public class NotifyWhenAvailableTest extends BaseTest {

    @Test
    public void checkIfButtonNotifyWhenAvailableExists() throws InterruptedException {
        openPage("https://rozetka.com.ua/ua/");

        HeaderPage headerPage = new HeaderPage(driver);
        ItemsListPage itemsListPage = new ItemsListPage(driver);
        ItemMainPage itemMainPage = new ItemMainPage(driver);

        headerPage.openTabletsApplePage();
        itemsListPage.clickFilterStatusOutOfStock();
        itemsListPage.openPageOfFirstItem();

        Assert.assertTrue(itemMainPage.getNotifyWhenAvailableButton().isEnabled());
    }
}
