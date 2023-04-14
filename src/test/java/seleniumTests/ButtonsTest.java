package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsTest extends InitMethods {

    @Test
    public void test_Buttons() {
        driver.get("https://demoqa.com/buttons");

        new Actions(driver)
                .contextClick(driver.findElement(By.xpath("//button[@id='rightClickBtn']")))
                .doubleClick(driver.findElement(By.xpath("//button[@id='doubleClickBtn']")))
                .click(driver.findElement(By.xpath("//button[text()='Click Me']")))
                .perform();

        Assert.assertTrue(driver.findElement(By.xpath("//p[@id='doubleClickMessage']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//p[@id='rightClickMessage']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//p[@id='dynamicClickMessage']")).isDisplayed());
    }
}
