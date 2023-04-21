package pages.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ButtonsPage extends BasePage {

    public ButtonsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getDoubleClickButton() {
        return driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
    }

    public WebElement getRightClickButton() {
        return driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
    }

    public WebElement getRegularButton() {
        return driver.findElement(By.xpath("//button[text()='Click Me']"));
    }

    public WebElement getDoubleClickMsg() {
        return driver.findElement(By.xpath("//p[@id='doubleClickMessage']"));
    }

    public WebElement getRightClickMsg() {
        return driver.findElement(By.xpath("//p[@id='rightClickMessage']"));
    }

    public WebElement getRegularClickMsg() {
        return driver.findElement(By.xpath("//p[@id='dynamicClickMessage']"));
    }


    public void clickButtons() {
        new Actions(driver)
                .doubleClick(getDoubleClickButton())
                .contextClick(getRightClickButton())
                .click(getRegularButton())
                .perform();
    }
}
