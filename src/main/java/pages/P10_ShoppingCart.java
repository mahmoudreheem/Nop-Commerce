package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P10_ShoppingCart {

    WebDriver driver;

    public P10_ShoppingCart(WebDriver driver) {
        this.driver = driver;
    }

    private final By CLICK_SHOPPING_CART = By.xpath("(//div[@class=\"header-links\"])/ul/li[4]");
    private final By VERIFY_SHOPPING_PAGE_VISIBLE= By.xpath("(//div[@class=\"page-title\"])");


    // TODO: step3 define action methods
    public P10_ShoppingCart clickShoppingButton() throws InterruptedException {
        driver.findElement(this.CLICK_SHOPPING_CART).click();
        Thread.sleep(1000);
        return this;
    }
    public Boolean verifyShoppingTitleVisible(String pagetitle) throws InterruptedException {
        return driver.findElement(this.VERIFY_SHOPPING_PAGE_VISIBLE).getText().contains(pagetitle);

    }


}
