package tests.rozetka;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.rozetka.HeaderPage;
import pages.rozetka.ItemCommentsPage;
import pages.rozetka.ItemHeaderPage;
import pages.rozetka.ItemsListPage;

public class CommentsRatingFilterTest extends BaseTest {

    @Test
    public void checkCommentsRatingFilter() throws InterruptedException {
        openPage("https://rozetka.com.ua/ua/");

        HeaderPage headerPage = new HeaderPage(driver);
        ItemsListPage itemsListPage = new ItemsListPage(driver);
        ItemHeaderPage itemHeaderPage = new ItemHeaderPage(driver);
        ItemCommentsPage itemCommentsPage = new ItemCommentsPage(driver);

        headerPage.openTabletsApplePage();
        itemsListPage.openPageOfFirstItem();
        itemHeaderPage.openCommentsTab();
        itemCommentsPage.setFourStarsFilter();

        Assert.assertTrue(itemCommentsPage.doesEveryCommentHaveFourStarsRating());
    }
}
