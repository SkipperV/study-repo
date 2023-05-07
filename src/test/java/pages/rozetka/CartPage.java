package pages.rozetka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage {
    private static final String ITEMS_NAMES_IN_CART = "//a[@class='cart-product__title']";
    private static final String ITEMS_PRICES_IN_CART = "//p[@data-testid='cost']";
    private static final String CHECKOUT_BUTTON = "//a[@data-testid='cart-receipt-submit-order']";

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getListOfItemsNamesInCart() {
        return getListOfVisibleElementsByXpath(ITEMS_NAMES_IN_CART);
    }

    public List<WebElement> getListOfItemsPricesInCart() {
        return getListOfVisibleElementsByXpath(ITEMS_PRICES_IN_CART);
    }

    public WebElement getCheckoutButton() {
        return getVisibleElementByXpath(CHECKOUT_BUTTON);
    }

    public String getFirstItemInCartName() {
        return getListOfItemsNamesInCart().get(0).getText();
    }

    public String getFirstItemInCartPrice() {
        return getListOfItemsPricesInCart().get(0).getText();
    }

    public void clickCheckoutButton() {
        getCheckoutButton().click();
    }
}
