package tests.rozetka;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.rozetka.*;

public class CheckoutContactsInfoTest extends BaseTest {

    @Test
    public void checkOrderTextFields() throws InterruptedException {
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
        checkoutPage.typeEmail("1234567890");

        Assert.assertTrue(checkoutPage.getSurNameInvalidInputMessage().isEnabled());
        Assert.assertTrue(checkoutPage.getNameInvalidInputMessage().isEnabled());
        Assert.assertTrue(checkoutPage.getPhoneNumberInvalidInputMessage().isEnabled());
        Assert.assertTrue(checkoutPage.getEmailInvalidInputMessage().isEnabled());

        checkoutPage.clearNameSurnameContactsFields();
        checkoutPage.typeSurname("Павло");
        checkoutPage.typeName("Павло");
        checkoutPage.typeRandomPhoneNumberAndEmail();

        Assert.assertTrue(checkoutPage.getSaveContactsButton().isEnabled());
    }
}
