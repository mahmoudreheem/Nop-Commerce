package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P11_Checkout {
    WebDriver driver;

    public P11_Checkout(WebDriver driver) {
        this.driver = driver;
    }

    private final By AGREE_CHECKBOX = By.xpath("(//div[@class=\"terms-of-service\"])/input[@id=\"termsofservice\"]");
    private final By CHECKOUT_BUTTON = By.xpath("(//button[@id=\"checkout\"])");


    // TODO: step3 define action methods
    public P11_Checkout clickCheckBox() throws InterruptedException {

        driver.findElement(this.AGREE_CHECKBOX).click();
        Thread.sleep(7000);
        return this;
    }

    public P11_Checkout clickCheckoutButton() throws InterruptedException {
        driver.findElement(this.CHECKOUT_BUTTON).click();
        Thread.sleep(3000);
        return this;
    }

}