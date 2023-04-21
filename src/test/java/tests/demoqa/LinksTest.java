package tests.demoqa;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.demoqa.LinksPage;

import static java.lang.Thread.sleep;

public class LinksTest extends InitTest {

    @Test
    public void test_homePageLink() {
        LinksPage linksPage = new LinksPage(driver);
        openPage("https://demoqa.com/links");

        linksPage.openHomeLink();
        Assert.assertEquals(getURL(), "https://demoqa.com/");
    }

    @Test
    public void test_createdLink() throws InterruptedException {
        LinksPage linksPage = new LinksPage(driver);
        openPage("https://demoqa.com/links");

        linksPage.clickCreatedLink();

        sleep(500);
        Assert.assertEquals(linksPage.getStatusCode(), "201");
        Assert.assertEquals(linksPage.getStatusText(), "Created");
    }
}
