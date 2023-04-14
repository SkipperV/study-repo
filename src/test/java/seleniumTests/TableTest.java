package seleniumTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TableTest extends initMethods {

    @Test
    public void test_WebTable() {
        driver.get("https://demoqa.com/webtables");

        driver.findElement(By.xpath("(//span[contains(@id, 'edit-record')])[1]/*")).click();
        driver.findElement(By.xpath("//input[@placeholder='Salary']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Salary']")).sendKeys("9999");
        driver.findElement(By.xpath("//button[@id='submit']")).click();

        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='rt-tbody']/div[1]//div[5]")).getText(), "9999");
    }
}
