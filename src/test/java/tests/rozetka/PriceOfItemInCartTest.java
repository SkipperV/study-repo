package tests.rozetka;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.rozetka.CartPage;
import pages.rozetka.HeaderPage;
import pages.rozetka.ItemMainPage;
import pages.rozetka.ItemsListPage;

public class PriceOfItemInCartTest extends BaseTest {

    @Test
    public void checkEqualityOfItemPrice() throws InterruptedException {
        openPage("https://rozetka.com.ua/ua/");

        HeaderPage headerPage = new HeaderPage(driver);
        ItemsListPage itemsListPage = new ItemsListPage(driver);
        ItemMainPage itemMainPage = new ItemMainPage(driver);
        CartPage cartPage = new CartPage(driver);
        String itemPriceInPage;
        String itemPriceInCart;

        headerPage.openTabletsApplePage();
        itemsListPage.openPageOfFirstItem();

        itemPriceInPage = itemMainPage.getItemPrice();
        itemMainPage.clickBuyButton();
        itemPriceInCart = cartPage.getFirstItemInCartPrice();

        Assert.assertEquals(itemPriceInPage, itemPriceInCart);
    }
}
