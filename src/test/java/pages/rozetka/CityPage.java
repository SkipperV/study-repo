package pages.rozetka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CityPage extends BasePage {

    private static final String CITY_SEARCH_BAR = "//input[@_ngcontent-rz-client-c26]";
    private static final String SEARCH_AUTOCOMPLETE_LIST = "//ul[@_ngcontent-rz-client-c26]/*";
    private static final String APPLY_BUTTON = "//button[@_ngcontent-rz-client-c27]";

    public CityPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getCitySearchBar() {
        return getVisibleElementByXpath(CITY_SEARCH_BAR);
    }

    public List<WebElement> getSearchAutocompleteList() {
        return getListOfVisibleElementsByXpath(SEARCH_AUTOCOMPLETE_LIST);
    }

    public WebElement getApplyButton() {
        return getVisibleElementByXpath(APPLY_BUTTON);
    }

    public void typeInCitySearchBar(String string) {
        getCitySearchBar().clear();
        getCitySearchBar().sendKeys(string);
    }

    public void pickFirstSuggestion() {
        getSearchAutocompleteList().get(0).click();
    }

    public void clickApplyButton() {
        getApplyButton().click();
    }
}
