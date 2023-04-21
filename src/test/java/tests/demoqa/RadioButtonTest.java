package tests.demoqa;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.demoqa.RadioButtonPage;

public class RadioButtonTest extends InitTest {

    @Test
    public void test_radioButton() {
        RadioButtonPage radioButtonPage = new RadioButtonPage(driver);
        openPage("https://demoqa.com/radio-button");

        radioButtonPage.clickImpressiveRadio();

        Assert.assertTrue(radioButtonPage.getImpressiveRadioButton().isSelected());
        Assert.assertFalse(radioButtonPage.getYesRadioButton().isSelected());
        Assert.assertFalse(radioButtonPage.getNoRadioButton().isEnabled());
    }
}
