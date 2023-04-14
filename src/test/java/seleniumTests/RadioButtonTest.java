package seleniumTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest extends InitMethods {

    @Test
    public void test_radioButton() {
        driver.get("https://demoqa.com/radio-button");

        driver.findElement(By.xpath("//label[@for='impressiveRadio']")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='impressiveRadio']")).isSelected());
        Assert.assertFalse(driver.findElement(By.xpath("//input[@id='yesRadio']")).isSelected());
        Assert.assertFalse(driver.findElement(By.xpath("//input[@id='noRadio']")).isEnabled());
    }
}
