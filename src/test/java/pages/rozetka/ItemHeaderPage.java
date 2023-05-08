package pages.rozetka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemHeaderPage extends BasePage {

    private static final String ITEM_TAB_GENERAL_INFO = "//a[text()=' Усе про товар ']";
    private static final String ITEM_TAB_CHARACTERISTICS = "//a[text()=' Характеристики ']";
    private static final String ITEM_TAB_COMMENTS = "//a[text()=' Відгуки ']";

    public ItemHeaderPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getGeneralInfoTab() {
        return getVisibleElementByXpath(ITEM_TAB_GENERAL_INFO);
    }

    public WebElement getCharacteristicsTab() {
        return getVisibleElementByXpath(ITEM_TAB_CHARACTERISTICS);
    }

    public WebElement getCommentsTab() {
        return getVisibleElementByXpath(ITEM_TAB_COMMENTS);
    }

    public void openGeneralInfoTab() throws InterruptedException {
        getGeneralInfoTab().click();
        Thread.sleep(1000);
    }

    public void openCharacteristicsTab() throws InterruptedException {
        getCharacteristicsTab().click();
        Thread.sleep(1000);
    }

    public void openCommentsTab() throws InterruptedException {
        getCommentsTab().click();
        Thread.sleep(1000);
    }
}
