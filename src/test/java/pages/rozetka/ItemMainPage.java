package pages.rozetka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ItemMainPage extends BasePage {
    private static final String ITEM_COLORS = "//li[@class='var-options__item ng-star-inserted']";
    private static final String REVIEWS_TAB = "//a[text()=' Характеристики ']";
    private static final String BUY_BUTTON = "//span[@class='buy-button__label ng-star-inserted']";
    private static final String ITEM_ID = "//span[@class='product__code-accent']";

    public ItemMainPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getReviewsTab() {
        return getVisibleElementByXpath(REVIEWS_TAB);
    }

    public List<WebElement> getItemColorsList() {
        return getListOfVisibleElementsByXpath(ITEM_COLORS);
    }

    public WebElement getBuyButton() {
        return getVisibleElementByXpath(BUY_BUTTON);
    }

    public WebElement getProductID() {
        return getVisibleElementByXpath(ITEM_ID);
    }

    public void clickBuyButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(getBuyButton()).click().perform();
    }
}
