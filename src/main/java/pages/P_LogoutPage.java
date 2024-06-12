package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P_LogoutPage {
    WebDriver driver;

    //constructor
    public P_LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    private final By LOGOUT_TAB = By.xpath("(//a[@href=\"/logout\"])");
    private final By VERIFY_LOGIN_VISIBLE= By.xpath("(//a[@href=\"/login?returnUrl=%2F\"])");
    //Action Method

    public P_LogoutPage Logout() {
        driver.findElement(LOGOUT_TAB).click();
        return this;
    }
    public Boolean VerifyLoginVisible(){
        return driver.findElement(this.VERIFY_LOGIN_VISIBLE).isDisplayed();
    }
    }

