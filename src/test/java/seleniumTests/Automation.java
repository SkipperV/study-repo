package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class Automation {
    WebDriver driver;
    @BeforeMethod
    public void beforeTest() {
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void closeWindow() {
        driver.quit();
    }
    @Test
    public void checkSubmit() throws InterruptedException {
        driver.get("https://demoqa.com/text-box");

        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Vlad Tymchuk");
        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("abcd");
        driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("efgh");
        driver.findElement(By.xpath("//button[@id='submit']")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//p[@id='name']")).isEnabled());
    }

    @Test
    public void checkCheckBox() throws InterruptedException {
        driver.get("https://demoqa.com/checkbox");

        driver.findElement(By.xpath("//label[@for='tree-node-home']/preceding-sibling::button")).click();
        driver.findElement(By.xpath("//label[@for='tree-node-desktop']//child::span")).click();
        driver.findElement(By.xpath("//label[@for='tree-node-desktop']/preceding-sibling::button")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//label[@for='tree-node-notes']//*[@class='rct-icon rct-icon-check']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//label[@for='tree-node-commands']//*[@class='rct-icon rct-icon-check']")).isDisplayed());
    }
}
