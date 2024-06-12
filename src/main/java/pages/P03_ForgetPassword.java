package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P03_ForgetPassword {
    WebDriver driver;

    // TODO: Step1: Constructor
    public P03_ForgetPassword(WebDriver driver) {
        this.driver = driver;
    }

    // TODO step2: define locators
    private final By FORGET_PASSWORD_TAB = By.xpath("//a[@href=\"/passwordrecovery\"]");

    // TODO: step3 define action methods
    public P03_ForgetPassword CheckForgetPasswordLink() throws InterruptedException {
        driver.findElement(this.FORGET_PASSWORD_TAB).click();
        Thread.sleep(1000);
        return this;
    }
}
