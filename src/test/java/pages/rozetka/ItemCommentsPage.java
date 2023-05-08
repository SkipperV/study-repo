package pages.rozetka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ItemCommentsPage extends BasePage {

    private static final String COMMENTS_FILTERS_BUTTON = "//button[@rziconbutton]";
    private static final String FILTER_FOUR_STARS = "//p[text()=' 4 зiрки ']/../..";
    private static final String FILTER_APPLY = "//button[@type='submit']";
    private static final String STAR_YELLOW = "//rz-gradient-star//*[@fill='#ffa900']";
    private static final String STAR_GREY = "//rz-gradient-star//*[@fill='#d2d2d2']";

    public ItemCommentsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getFiltersButton() {
        return getVisibleElementByXpath(COMMENTS_FILTERS_BUTTON);
    }

    public WebElement getFourStarsFilter() {
        return getVisibleElementByXpath(FILTER_FOUR_STARS);
    }

    public WebElement getApplyFilterButton() {
        return getVisibleElementByXpath(FILTER_APPLY);
    }

    public List<WebElement> getYellowStarsList() {
        return getListOfVisibleElementsByXpath(STAR_YELLOW);
    }

    public List<WebElement> getGreyStarsList() {
        return getListOfVisibleElementsByXpath(STAR_GREY);
    }

    public void openFilters() {
        getFiltersButton().click();
    }

    public void setFourStarsFilter() {
        openFilters();
        getFourStarsFilter().click();
        new Actions(driver)
                .moveToElement(getApplyFilterButton()).click().perform();
    }

    public boolean doesEveryCommentHaveFourStarsRating() {
        double yellowStarsQuantity = getYellowStarsList().size();
        double greyStarsQuantity = getGreyStarsList().size();
        double totalStarsQuantity = yellowStarsQuantity + greyStarsQuantity;

        return yellowStarsQuantity / totalStarsQuantity == 0.8;
    }
}
