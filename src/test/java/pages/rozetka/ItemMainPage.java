package pages.rozetka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ItemMainPage extends BasePage {
    private static final String ITEM_OTHER_COLORS = "//a[@class='var-options__color ng-star-inserted']";
    private static final String BUY_BUTTON = "//span[@class='buy-button__label ng-star-inserted']";
    private static final String ITEM_NAME = "//h1[@class='product__title']";
    private static final String ITEM_CURRENT_PRICE = "//p[contains(@class, 'product-price__big')]";
    private static final String NOTIFY_WHEN_AVAILABLE_BUTTON = "//button[@_ngcontent-rz-client-c58]";

    public ItemMainPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getNotifyWhenAvailableButton() {
        return getVisibleElementByXpath(NOTIFY_WHEN_AVAILABLE_BUTTON);
    }

    public List<WebElement> getListOfAvailableOtherItemColors() {
        return getListOfVisibleElementsByXpath(ITEM_OTHER_COLORS);
    }

    public WebElement getBuyButton() {
        return getVisibleElementByXpath(BUY_BUTTON);
    }

    public WebElement getItemTitle() {
        return getVisibleElementByXpath(ITEM_NAME);
    }

    public WebElement getItemPriceElement() {
        return getVisibleElementByXpath(ITEM_CURRENT_PRICE);
    }

    public String getItemName() {
        return getItemTitle().getText().strip();
    }

    public String getItemPrice() {
        return getItemPriceElement().getText().strip();
    }

    public void clickBuyButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(getBuyButton()).click().perform();
    }

    public void openAnotherColoredItemPage() throws InterruptedException {
        getListOfAvailableOtherItemColors().get(0).click();
        Thread.sleep(1000);
    }
}
