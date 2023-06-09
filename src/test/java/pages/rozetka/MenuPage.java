package pages.rozetka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage extends BasePage {

    private static final String CHANGE_CITY_BUTTON = "//button[@class='city-toggle button button--small button--white']";
    private static final String PICKED_CITY = "//span[@class='city-toggle__text']";

    public MenuPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getChangeCityButton() {
        return getVisibleElementByXpath(CHANGE_CITY_BUTTON);
    }

    public WebElement getPickedCity() {
        return getVisibleElementByXpath(PICKED_CITY);
    }

    public String getPickedCityString() {
        return getPickedCity().getText();
    }

    public void pickCity() {
        getChangeCityButton().click();
    }
}
