package tests.rozetka;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.rozetka.HeaderPage;
import pages.rozetka.HomePage;

public class MainLogoTest extends BaseTest {

    @Test
    public void checkMainLogoRedirect() throws InterruptedException {
        openPage("https://rozetka.com.ua/ua/");

        HeaderPage headerPage = new HeaderPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.openPageOfFirstItem();
        Thread.sleep(2000);
        headerPage.clickOnMainLogo();

        Assert.assertEquals(getURL(), "https://rozetka.com.ua/ua/");
    }
}
