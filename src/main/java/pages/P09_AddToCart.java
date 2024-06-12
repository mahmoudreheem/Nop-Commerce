package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P09_AddToCart {
WebDriver driver;
    public P09_AddToCart(WebDriver driver) {
        this.driver = driver;
    }

    private final By ADD_TO_CART= By.xpath("(//button[@id=\"add-to-cart-button-37\"])");
    private final By VERIFY_WISHLIST_ALERT_VISIBLE= By.xpath("(//p[@class=\"content\"])/a[@href=\"/cart\"]");

    // TODO: step3 define action methods
    public P09_AddToCart AddToCart() throws InterruptedException {
driver.findElement(this.ADD_TO_CART).click();
        Thread.sleep(1000);
        return this;
    }
    public String verifySuccessMessageVisible() throws InterruptedException {
        return driver.findElement(this.VERIFY_WISHLIST_ALERT_VISIBLE).getText();

    }


}