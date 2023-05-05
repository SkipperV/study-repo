package pages.rozetka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

    public WebElement getEMailTextField() {
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

    public WebElement getEMailInvalidInputMessage() {
        return getVisibleElementByXpath(TEXT_FIELD_EMAIL_INVALID_INPUT_MESSAGE);
    }

    public WebElement getSaveContactsButton() {
        return getVisibleElementByXpath(BUTTON_SAVE_CONTACTS);
    }

    public void typeSurname(String input) {
        getSurnameTextField().sendKeys(input);
    }

    public void typeName(String input) {
        getNameTextField().sendKeys(input);
    }

    public void typePhoneNumber(String input) {
        getPhoneNumberTextField().sendKeys(input);
    }

    public void typeEMail(String input) {
        getEMailTextField().sendKeys(input);
    }

    public void clearContactsInfoFields() {
        getSurnameTextField().clear();
        getNameTextField().clear();
        getPhoneNumberTextField().clear();
        getEMailTextField().clear();
    }
}
