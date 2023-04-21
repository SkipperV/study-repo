package pages.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class LinksPage extends BasePage {

    public LinksPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getHomeLink() {
        return driver.findElement(By.xpath("//a[@id='simpleLink']"));
    }

    public WebElement getCreatedLink() {
        return driver.findElement(By.xpath("//a[@id='created']"));
    }

    public void openHomeLink() {
        getHomeLink().click();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public void clickCreatedLink() {
        getCreatedLink().click();
    }

    public String getStatusCode() {
        List<WebElement> gottenStatus = driver.findElements(By.xpath("//p[@id='linkResponse']/*"));
        return gottenStatus.get(0).getText();
    }

    public String getStatusText() {
        List<WebElement> gottenStatus = driver.findElements(By.xpath("//p[@id='linkResponse']/*"));
        return gottenStatus.get(1).getText();
    }
}
