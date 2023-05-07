package pages.rozetka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HeaderPage extends BasePage {

    private static final String MENU_TOGGLE = "//button[@class='header__button ng-tns-c33-1']";
    private static final String MAIN_LOGO = "//a[@class='header__logo']";
    private static final String CATALOG = "//button[@id='fat-menu']";
    private static final String SEARCH_BAR = "//input[@name='search']";
    private static final String SEARCH_BUTTON = "//button[@class='button button_color_green button_size_medium search-form__submit ng-star-inserted']";
    private static final String SHOPPING_CART_BUTTON = "//button[@rzopencart]";
    private static final String MENU_CATEGORY_LAPTOPS_AND_COMPUTERS = "//a[contains(@class, 'js-menu-categories__link') and text()='Ноутбуки та комп’ютери']";
    private static final String MENU_CATEGORY_SMARTPHONES_TV_ELECTRONICS = "//a[contains(@class, 'js-menu-categories__link') and text()='Смартфони, ТВ і електроніка']";
    private static final String MENU_SUBCATEGORY_PHONES = "//a[@class='menu__hidden-title' and text()='Телефони']";
    private static final String MENU_ITEM_LAPTOPS_ASUS = "//a[@class='menu__hidden-title' and text()='Ноутбуки']/..//*[text()=' Asus ']";
    private static final String MENU_ITEM_TABLETS_APPLE = "//a[@class='menu__hidden-title' and text()='Планшети']/..//*[text()=' Apple iPad ']";
    private static final String MENU_ITEM_PHONES_APPLE = "//a[@class='menu__hidden-title' and text()='Телефони']/..//*[text()=' Apple ']";
    private static final String MENU_ITEM_POWERBANKS = "//a[@class='menu__hidden-title' and text()='Повербанки та зарядні станції']/..//*[text()=' Універсальні мобільні батареї ']";

    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getMenuToggle() {
        return driver.findElement(By.xpath(MENU_TOGGLE));
    }

    public WebElement getMainLogo() {
        return driver.findElement(By.xpath(MAIN_LOGO));
    }

    public WebElement getCatalogButton() {
        return driver.findElement(By.xpath(CATALOG));
    }

    public WebElement getSearchBar() {
        return driver.findElement(By.xpath(SEARCH_BAR));
    }

    public WebElement getSearchButton() {
        return driver.findElement(By.xpath(SEARCH_BUTTON));
    }

    public WebElement getShoppingCartButton() {
        return driver.findElement(By.xpath(SHOPPING_CART_BUTTON));
    }

    public WebElement getMenuCategoryLaptopsAndPCs() {
        return driver.findElement(By.xpath(MENU_CATEGORY_LAPTOPS_AND_COMPUTERS));
    }

    public WebElement getMenuCategorySmartphonesAndTVs() {
        return driver.findElement(By.xpath(MENU_CATEGORY_SMARTPHONES_TV_ELECTRONICS));
    }

    public WebElement getMenuSubcategoryPhones() {
        return driver.findElement(By.xpath(MENU_SUBCATEGORY_PHONES));
    }

    public WebElement getMenuItemLaptopsAsus() {
        return driver.findElement(By.xpath(MENU_ITEM_LAPTOPS_ASUS));
    }

    public WebElement getMenuItemTabletsAppleIPad() {
        return driver.findElement(By.xpath(MENU_ITEM_TABLETS_APPLE));
    }

    public WebElement getMenuItemPhonesApple() {
        return driver.findElement(By.xpath(MENU_ITEM_PHONES_APPLE));
    }

    public WebElement getMenuItemPowerbanks() {
        return driver.findElement(By.xpath(MENU_ITEM_POWERBANKS));
    }

    public void openCatalog() throws InterruptedException {
        getCatalogButton().click();
        Thread.sleep(200);
    }

    public void openTabletsApplePage() throws InterruptedException {
        openCatalog();
        Actions actions = new Actions(driver);

        actions
                .moveToElement(getMenuCategoryLaptopsAndPCs())
                .moveToElement(getMenuItemTabletsAppleIPad())
                .click()
                .perform();
    }
}
