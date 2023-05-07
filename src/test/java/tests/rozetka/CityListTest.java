package tests.rozetka;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.rozetka.CityPage;
import pages.rozetka.HeaderPage;
import pages.rozetka.MenuPage;

public class CityListTest extends BaseTest {

    @Test
    public void checkCityList() throws InterruptedException {
        openPage("https://rozetka.com.ua/ua/");

        HeaderPage headerPage = new HeaderPage(driver);
        MenuPage menuPage = new MenuPage(driver);
        CityPage cityPage = new CityPage(driver);

        headerPage.openMenu();
        menuPage.pickCity();
        cityPage.typeInCitySearchBar("Луцьк");
        cityPage.pickFirstSuggestion();
        cityPage.clickApplyButton();

        headerPage.openMenu();

        Assert.assertEquals(menuPage.getPickedCityString(), "Луцьк - Волинська обл.");
    }
}
