package pages.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxPage extends BasePage {

    public TextBoxPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getNameField() {
        return driver.findElement(By.xpath("//input[@id='userName']"));
    }

    public WebElement getEmailField() {
        return driver.findElement(By.xpath("//input[@id='userEmail']"));
    }

    public WebElement getCurrentAddressField() {
        return driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
    }

    public WebElement getPermanentAddressField() {
        return driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
    }

    public WebElement getSubmitBtn() {
        return driver.findElement(By.xpath("//button[@id='submit']"));
    }

    public WebElement getSubmittedName() {
        return driver.findElement(By.xpath("//p[@id='name']"));
    }

    public WebElement getSubmittedEmail() {
        return driver.findElement(By.xpath("//p[@id='email']"));
    }

    public WebElement getSubmittedCurrentAddress() {
        return driver.findElement(By.xpath("//p[@id='currentAddress']"));
    }

    public WebElement getSubmittedPermanentAddress() {
        return driver.findElement(By.xpath("//p[@id='permanentAddress']"));
    }

    public void submitData() {
        getNameField().sendKeys("Vlad Tymchuk");
        getEmailField().sendKeys("test@gmail.com");
        getCurrentAddressField().sendKeys("abcd");
        getPermanentAddressField().sendKeys("efgh");

        getSubmitBtn().click();
    }
}
