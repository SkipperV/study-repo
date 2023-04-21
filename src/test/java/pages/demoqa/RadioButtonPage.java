package pages.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RadioButtonPage extends BasePage {

    public RadioButtonPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getYesRadioButton() {
        return driver.findElement(By.xpath("//input[@id='yesRadio']"));
    }

    public WebElement getImpressiveRadioButton() {
        return driver.findElement(By.xpath("//input[@id='impressiveRadio']"));
    }

    public WebElement getNoRadioButton() {
        return driver.findElement(By.xpath("//input[@id='noRadio']"));
    }

    public void clickImpressiveRadio() {
        new Actions(driver).click(getImpressiveRadioButton()).perform();
    }
}
