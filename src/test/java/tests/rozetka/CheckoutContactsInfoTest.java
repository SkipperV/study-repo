package tests.rozetka;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.rozetka.*;

public class CheckoutContactsInfoTest extends BaseTest {

    @Test
    public void checkOrderTextFields() {
        openPage("https://rozetka.com.ua/ua/");

        HeaderPage headerPage = new HeaderPage(driver);
        ItemsListPage itemsListPage = new ItemsListPage(driver);
        ItemMainPage itemMainPage = new ItemMainPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        headerPage.openTabletsApplePage();
        itemsListPage.openPageOfFirstItem();
        itemMainPage.clickBuyButton();
        cartPage.clickCheckoutButton();

        checkoutPage.typeSurname("1234567890");
        checkoutPage.typeName("1234567890");
        checkoutPage.typePhoneNumber("1234567890");
        checkoutPage.typeEMail("1234567890");

        Assert.assertTrue(checkoutPage.getSurNameInvalidInputMessage().isEnabled());
        Assert.assertTrue(checkoutPage.getNameInvalidInputMessage().isEnabled());
        Assert.assertTrue(checkoutPage.getPhoneNumberInvalidInputMessage().isEnabled());
        Assert.assertTrue(checkoutPage.getEMailInvalidInputMessage().isEnabled());

        checkoutPage.clearContactsInfoFields();
        checkoutPage.typeSurname("абс");
        checkoutPage.typeName("абс");
        checkoutPage.typePhoneNumber("0950123445");
        checkoutPage.typeEMail("test@test.com");

        Assert.assertTrue(checkoutPage.getSaveContactsButton().isEnabled());
    }
}
