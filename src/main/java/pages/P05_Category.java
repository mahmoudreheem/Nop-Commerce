package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static pages.PageBase.RandomHover;
import static util.Utility.*;

public class P05_Category {
    WebDriver driver;

    // constructor
    // Locators
    // Action Methods
    public P05_Category(WebDriver driver) {
        this.driver = driver;
    }

    private final By SELECT_Book_Tab = By.xpath("(//ul[@class=\"top-menu notmobile\"])/li[5]");
    private final By Book_Title_VISIBLE = By.xpath("(//div[@class=\"page category-page\"])/div[@class=\"page-title\"]");

    public P05_Category SelectBookCategory() throws InterruptedException {
        driver.findElement(this.SELECT_Book_Tab).click();
        return this;
    }

    public Boolean VerifyCategoryVisible() throws InterruptedException {
        return driver.findElement(this.Book_Title_VISIBLE).isDisplayed();
    }
}
