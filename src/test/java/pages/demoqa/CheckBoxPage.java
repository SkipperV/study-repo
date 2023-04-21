package pages.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPage extends BasePage {

    public CheckBoxPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getHomeContainer() {
        return driver.findElement(By.xpath("//label[@for='tree-node-home']/preceding-sibling::button"));
    }

    public WebElement getDesktopContainer() {
        return driver.findElement(By.xpath("//label[@for='tree-node-desktop']/preceding-sibling::button"));
    }

    public WebElement getDesktopCheckBox() {
        return driver.findElement(By.xpath("//label[@for='tree-node-desktop']//child::span[@class='rct-checkbox']"));
    }

    public WebElement getNotesCheckBox_checked() {
        return driver.findElement(By.xpath("//label[@for='tree-node-notes']//*[@class='rct-icon rct-icon-check']"));
    }

    public WebElement getCommandsCheckBox_checked() {
        return driver.findElement(By.xpath("//label[@for='tree-node-commands']//*[@class='rct-icon rct-icon-check']"));
    }

    public void releaseHomeContainer() {
        getHomeContainer().click();
    }

    public void releaseDesktopContainer() {
        getDesktopContainer().click();
    }

    public void clickDesktopCheckBox() {
        getDesktopCheckBox().click();
    }
}
