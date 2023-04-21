package tests.demoqa;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.demoqa.CheckBoxPage;

public class CheckBoxTest extends InitTest {

    @Test
    public void test_CheckBox() {
        CheckBoxPage checkBoxPage = new CheckBoxPage(driver);
        openPage("https://demoqa.com/checkbox");

        checkBoxPage.releaseHomeContainer();
        checkBoxPage.releaseDesktopContainer();
        checkBoxPage.clickDesktopCheckBox();

        Assert.assertTrue(checkBoxPage.getNotesCheckBox_checked().isDisplayed());
        Assert.assertTrue(checkBoxPage.getCommandsCheckBox_checked().isDisplayed());
    }
}
