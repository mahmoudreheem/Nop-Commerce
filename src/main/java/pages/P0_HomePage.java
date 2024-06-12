package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P0_HomePage {

    // constructor
    // Locators
    // Action Methods
    WebDriver driver;

    public P0_HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private final By LOGINTAB = By.xpath("//a[@href=\"/login?returnUrl=%2F\"]");
    private final By REGISTERTAB = By.xpath("//a[@href=\"/register?returnUrl=%2F\"]");
private final By LOGINBUTTON=By.xpath("(//button[@class=\"button-1 login-button\"])");
private final By REGISTERBUTTON=By.xpath("(//button[@class=\"button-1 register-next-step-button\"])");

    public P0_HomePage clickLoginTap() {
        driver.findElement(this.LOGINTAB).click();
        return this;
    }

    public P0_HomePage clickRegisterTap() {
        driver.findElement(this.REGISTERTAB).click();
        return this;
    }

    public boolean verifyLoginButtonVisible() {
        return driver.findElement(LOGINBUTTON).isDisplayed();
    }
    public boolean verifyRegisterButtonVisible() {
        return driver.findElement(REGISTERBUTTON).isDisplayed();
    }

}