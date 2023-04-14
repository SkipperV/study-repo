package seleniumTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest extends InitMethods {

    @Test
    public void test_CheckBox() {
        driver.get("https://demoqa.com/checkbox");

        driver.findElement(By.xpath("//label[@for='tree-node-home']/preceding-sibling::button")).click();
        driver.findElement(By.xpath("//label[@for='tree-node-desktop']//child::span")).click();
        driver.findElement(By.xpath("//label[@for='tree-node-desktop']/preceding-sibling::button")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//label[@for='tree-node-notes']//*[@class='rct-icon rct-icon-check']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//label[@for='tree-node-commands']//*[@class='rct-icon rct-icon-check']")).isDisplayed());
    }
}
