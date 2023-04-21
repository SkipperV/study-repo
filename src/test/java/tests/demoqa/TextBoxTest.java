package tests.demoqa;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.demoqa.TextBoxPage;

public class TextBoxTest extends InitTest {

    @Test
    public void test_Submit() {
        TextBoxPage textBoxPage = new TextBoxPage(driver);
        openPage("https://demoqa.com/text-box");

        textBoxPage.submitData();

        Assert.assertTrue(textBoxPage.getSubmittedName().isEnabled());
    }
}
