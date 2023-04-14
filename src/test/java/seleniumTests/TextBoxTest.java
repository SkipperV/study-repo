package seleniumTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxTest extends initMethods {

    @Test
    public void checkSubmit() {
        driver.get("https://demoqa.com/text-box");

        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Vlad Tymchuk");
        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("abcd");
        driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("efgh");
        driver.findElement(By.xpath("//button[@id='submit']")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//p[@id='name']")).isEnabled());
    }
}
