package tests.rozetka;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.rozetka.CartPage;
import pages.rozetka.HeaderPage;
import pages.rozetka.ItemMainPage;
import pages.rozetka.ItemsListPage;

public class AddToCartButtonTest extends BaseTest{

    @Test
    public void checkAddToCartButton() throws InterruptedException {
        openPage("https://rozetka.com.ua/ua/");

        HeaderPage headerPage = new HeaderPage(driver);
        ItemsListPage itemsListPage = new ItemsListPage(driver);
        ItemMainPage itemMainPage = new ItemMainPage(driver);
        CartPage cartPage = new CartPage(driver);
        String itemNameInPage;
        String itemNameInCart;

        headerPage.openTabletsApplePage();
        itemsListPage.openPageOfFirstItem();

        itemNameInPage=itemMainPage.getItemName();
        itemMainPage.clickBuyButton();
        itemNameInCart=cartPage.getFirstItemNameInCart();

        Assert.assertEquals(itemNameInPage, itemNameInCart);
        Assert.assertTrue(cartPage.getCheckoutButton().isEnabled());
    }
}
