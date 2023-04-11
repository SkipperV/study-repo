package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Automation {
    @Test
    public void checkLoginAmazon() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/ref=nav_bb_logo");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone 13 case");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Iphone+13+case"));
        Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(), 'Iphone 13')]")).isDisplayed());

        driver.quit();
    }
}
