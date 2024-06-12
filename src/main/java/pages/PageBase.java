package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

    // constructor
    // locators
    // action methos
    WebDriver driver;

    public PageBase(WebDriver driver) {
        this.driver = driver;
    }

    private final By SEARCH_INPUT = By.xpath("//input[@id=\"small-searchterms\"]");
    private final By SEARCH_BUTTON = By.xpath("(//button[@class=\"button-1 search-box-button\"])");
    private final By ADD_TO_CART_BUTTON = By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[1]");

    public PageBase searchFunction(String search) {
        driver.findElement(this.SEARCH_INPUT).sendKeys(search);
        return this;
    }

    public PageBase clickSearch() {
        driver.findElement(this.SEARCH_BUTTON).click();
        return this;
    }

    public Boolean VerifySearchResultVisible() {
        return driver.findElement(this.ADD_TO_CART_BUTTON).isDisplayed();
    }

    public static void RandomHover(WebDriver driver, WebElement RandomCategory) throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(RandomCategory).perform();
        Thread.sleep(10000);
    }
}
