package pages.rozetka;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FooterPage extends BasePage {

    private static final String APP_GOOGLE_PLAY = "//a[@aria-label='Додаток для Android']";
    private static final String APP_APPLE_STORE = "//a[@aria-label='Додаток для iOS']";

    public FooterPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getGooglePlayLink() {
        return getVisibleElementByXpath(APP_GOOGLE_PLAY);
    }

    public WebElement getAppleStoreLink() {
        return getVisibleElementByXpath(APP_APPLE_STORE);
    }

    public void openGooglePlayAppPage() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        Actions actions = new Actions(driver);
        Thread.sleep(1000);
        actions.moveToElement(new ItemMainPage(driver).getBuyButton());
        for (int i = 0; i < 3; i++) {
//        while (!getGooglePlayLink().isDisplayed()) {
            jse.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        }
        actions.moveToElement(getGooglePlayLink()).click().perform();
    }

    public void openAppleStoreAppPage() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        Actions actions = new Actions(driver);
        Thread.sleep(1000);
        actions.moveToElement(new ItemMainPage(driver).getBuyButton());

        for (int i = 0; i < 3; i++) {
//        while (!getGooglePlayLink().isDisplayed()) {
            jse.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        }
        actions.moveToElement(getAppleStoreLink()).click().perform();
        Thread.sleep(1000);
    }
}
