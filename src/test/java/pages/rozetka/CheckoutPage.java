package pages.rozetka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class CheckoutPage extends BasePage {
    private static final String TEXT_FIELD_SURNAME = "//input[@formcontrolname='surname']";
    private static final String TEXT_FIELD_NAME = "//input[@formcontrolname='name']";
    private static final String TEXT_FIELD_PHONE_NUMBER = "//input[@formcontrolname='phone']";
    private static final String TEXT_FIELD_EMAIL = "//rz-checkout-user-email-wrapper/*";
    private static final String TEXT_FIELD_SURNAME_INVALID_INPUT_MESSAGE = "//input[@formcontrolname='surname']/..//p";
    private static final String TEXT_FIELD_NAME_INVALID_INPUT_MESSAGE = "//input[@formcontrolname='name']/..//p";
    private static final String TEXT_FIELD_PHONE_NUMBER_INVALID_INPUT_MESSAGE = "//input[@formcontrolname='phone']/..//p";
    private static final String TEXT_FIELD_EMAIL_INVALID_INPUT_MESSAGE = "//rz-checkout-user-email-wrapper/..//p";
    private static final String BUTTON_SAVE_CONTACTS = "//button[@class='button button--navy button--medium']";
    private static final String WARNING_REGISTERED_USER = "//blockquote[@class='form__hint form__hint_type_warning']";

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSurnameTextField() {
        return getVisibleElementByXpath(TEXT_FIELD_SURNAME);
    }

    public WebElement getNameTextField() {
        return getVisibleElementByXpath(TEXT_FIELD_NAME);
    }

    public WebElement getPhoneNumberTextField() {
        return getVisibleElementByXpath(TEXT_FIELD_PHONE_NUMBER);
    }

    public WebElement getEmailTextField() {
        return getVisibleElementByXpath(TEXT_FIELD_EMAIL);
    }

    public WebElement getSurNameInvalidInputMessage() {
        return getVisibleElementByXpath(TEXT_FIELD_SURNAME_INVALID_INPUT_MESSAGE);
    }

    public WebElement getNameInvalidInputMessage() {
        return getVisibleElementByXpath(TEXT_FIELD_NAME_INVALID_INPUT_MESSAGE);
    }

    public WebElement getPhoneNumberInvalidInputMessage() {
        return getVisibleElementByXpath(TEXT_FIELD_PHONE_NUMBER_INVALID_INPUT_MESSAGE);
    }

    public WebElement getEmailInvalidInputMessage() {
        return getVisibleElementByXpath(TEXT_FIELD_EMAIL_INVALID_INPUT_MESSAGE);
    }

    public WebElement getSaveContactsButton() {
        return getVisibleElementByXpath(BUTTON_SAVE_CONTACTS);
    }

    public List<WebElement> getRegisteredUserWarning() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        try {
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(WARNING_REGISTERED_USER)));
        } catch (Exception e) {
            return null;
        }
        return driver.findElements(By.xpath(WARNING_REGISTERED_USER));
    }

    public void typeSurname(String string) {
        getSurnameTextField().sendKeys(string);
    }

    public void typeName(String string) {
        getNameTextField().sendKeys(string);
    }

    public void typePhoneNumber(String string) {
        getPhoneNumberTextField().sendKeys(string);
    }

    public void typeEmail(String string) {
        getEmailTextField().sendKeys(string);
    }

    public void typeRandomPhoneNumberAndEmail() {
        do {
            int randomizedInt = new Random().nextInt(9000000) + 1000000;

            getPhoneNumberTextField().clear();
            getEmailTextField().clear();

            typePhoneNumber("093" + randomizedInt);
            typeEmail(randomizedInt + "@test.com");
        } while (getRegisteredUserWarning() != null);
    }

    public void clearNameSurnameContactsFields() throws InterruptedException {
        Thread.sleep(1000);
        if (!getSurnameTextField().getAttribute("value").equals("")) {
            getSurnameTextField().clear();
        }
        if (!getNameTextField().getAttribute("value").equals("")) {
            getNameTextField().clear();
        }
    }
}
