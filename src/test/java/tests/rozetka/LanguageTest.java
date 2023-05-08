package tests.rozetka;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.rozetka.HeaderPage;

public class LanguageTest extends BaseTest {

    @Test
    public void checkLanguageChange() {
        openPage("https://rozetka.com.ua/ua/");

        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.switchLanguage();

        Assert.assertEquals(getURL(), "https://rozetka.com.ua/");
    }
}
