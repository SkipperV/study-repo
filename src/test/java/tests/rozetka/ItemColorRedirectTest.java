package tests.rozetka;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.rozetka.*;

public class ItemColorRedirectTest extends BaseTest {

    @Test
    public void checkPickingColorRedirect() throws InterruptedException {
        openPage("https://rozetka.com.ua/ua/");

        HeaderPage headerPage = new HeaderPage(driver);
        ItemsListPage itemsListPage = new ItemsListPage(driver);
        ItemHeaderPage itemHeaderPage = new ItemHeaderPage(driver);
        ItemMainPage itemMainPage = new ItemMainPage(driver);
        ItemCharacteristicsPage itemCharacteristicsPage = new ItemCharacteristicsPage(driver);

        String screenSize_1;
        String screenResolution_1;
        String weight_1;
        String color_1;
        String screenSize_2;
        String screenResolution_2;
        String weight_2;
        String color_2;

        headerPage.openTabletsApplePage();
        itemsListPage.openPageOfFirstItem();
        itemHeaderPage.openCharacteristicsTab();

        screenSize_1 = itemCharacteristicsPage.getScreenSizeString();
        screenResolution_1 = itemCharacteristicsPage.getScreenResolutionString();
        weight_1 = itemCharacteristicsPage.getWeightString();
        color_1 = itemCharacteristicsPage.getColorString();

        itemHeaderPage.openGeneralInfoTab();
        itemMainPage.openAnotherColoredItemPage();
        itemHeaderPage.openCharacteristicsTab();

        screenSize_2 = itemCharacteristicsPage.getScreenSizeString();
        screenResolution_2 = itemCharacteristicsPage.getScreenResolutionString();
        weight_2 = itemCharacteristicsPage.getWeightString();
        color_2 = itemCharacteristicsPage.getColorString();

        Assert.assertEquals(screenSize_1, screenSize_2);
        Assert.assertEquals(screenResolution_1, screenResolution_2);
        Assert.assertEquals(weight_1, weight_2);
        Assert.assertNotEquals(color_1, color_2);
    }
}
