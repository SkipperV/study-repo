package tests.rozetka;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.rozetka.FooterPage;
import pages.rozetka.HomePage;

public class AppLinksTest extends BaseTest{

    @Test
    public void checkDownloadAppLinks() throws InterruptedException {
        openPage("https://rozetka.com.ua/ua/");

        HomePage homePage = new HomePage(driver);
        FooterPage footerPage = new FooterPage(driver);

        homePage.openPageOfFirstItem();
        footerPage.openGooglePlayAppPage();
        switchTo(2);
        Assert.assertTrue(doesLinkContain("?id=ua.com.rozetka.shop"));

        closePage();
        footerPage.openAppleStoreAppPage();
        switchTo(2);
        Assert.assertTrue(doesLinkContain("id740469631"));
    }
}
