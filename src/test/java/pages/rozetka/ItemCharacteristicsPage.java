package pages.rozetka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemCharacteristicsPage extends BasePage {

    private static final String CHARACTERISTICS_VALUE_SCREEN_SIZE = "//span[text()='Діагональ екрана']/../..//a";
    private static final String CHARACTERISTICS_VALUE_SCREEN_RESOLUTION = "//span[text()='Роздільна здатність екрана']/../..//a";
    private static final String CHARACTERISTICS_VALUE_WEIGHT = "//span[text()='Вага']/../..//span[@class='ng-star-inserted']";
    private static final String CHARACTERISTICS_VALUE_COLOR = "//span[text()='Колір']/../..//a";

    public ItemCharacteristicsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getScreenSize() {
        return getVisibleElementByXpath(CHARACTERISTICS_VALUE_SCREEN_SIZE);
    }

    public WebElement getScreenResolution() {
        return getVisibleElementByXpath(CHARACTERISTICS_VALUE_SCREEN_RESOLUTION);
    }

    public WebElement getWeight() {
        return getVisibleElementByXpath(CHARACTERISTICS_VALUE_WEIGHT);
    }

    public WebElement getColor() {
        return getVisibleElementByXpath(CHARACTERISTICS_VALUE_COLOR);
    }

    public String getScreenSizeString() {
        return getScreenSize().getText();
    }

    public String getScreenResolutionString() {
        return getScreenResolution().getText();
    }

    public String getWeightString() {
        return getWeight().getText();
    }

    public String getColorString() {
        return getColor().getText();
    }
}
