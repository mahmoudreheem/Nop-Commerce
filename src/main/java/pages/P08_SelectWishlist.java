package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P08_SelectWishlist {
    WebDriver driver;

    public P08_SelectWishlist(WebDriver driver) {
        this.driver = driver;
    }

    private final By ADD_WISHLIST_BUTTON = By.xpath("(//button[@class=\"button-2 add-to-wishlist-button\"])[1]");
    private final By VERIFY_WISHLIST_ALERT_VISIBLE= By.xpath("(//div[@class=\"bar-notification success\"])");


    // TODO: step3 define action methods
    public P08_SelectWishlist clickAddWishlistButton() throws InterruptedException {
        driver.findElement(this.ADD_WISHLIST_BUTTON).click();
        Thread.sleep(1000);
        return this;
    }
    public Boolean verifyAddWishListVisible(String successmessage) throws InterruptedException {
        return driver.findElement(this.VERIFY_WISHLIST_ALERT_VISIBLE).getText().contains(successmessage);

    }


}