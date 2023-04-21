package tests.demoqa;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.demoqa.ButtonsPage;

public class ButtonsTest extends InitTest {

    @Test
    public void test_Buttons() {
        openPage("https://demoqa.com/buttons");
        ButtonsPage buttonsPage = new ButtonsPage(driver);

        buttonsPage.clickButtons();

        Assert.assertTrue(buttonsPage.getDoubleClickMsg().isDisplayed());
        Assert.assertTrue(buttonsPage.getRightClickMsg().isDisplayed());
        Assert.assertTrue(buttonsPage.getRegularClickMsg().isDisplayed());
    }
}
