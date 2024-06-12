package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_LoginPage {
    WebDriver driver;

    //constructor
    public P02_LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //Locators
    private final By Email_Text = By.xpath("//input[@class=\"email\"]");
    private final By Password_Text = By.xpath("//input[@class=\"password\"]");
    private final By Login_Button = By.xpath("//button[@class=\"button-1 login-button\"]");
    private final By VERIFY_ACCOUNT_VISIBLE = By.xpath("(//a[@href=\"/customer/info\"])[1]");

    //Action Method
    public P02_LoginPage inputEmail(String email) {
        driver.findElement(this.Email_Text).sendKeys(email);
        return this;
    }

    public P02_LoginPage inputPassword(String password) {
        driver.findElement(this.Password_Text).sendKeys(password);
        return this;
    }

    public P02_LoginPage inputLoginButton() {
        driver.findElement(this.Login_Button).click();
        return this;
    }

    public Boolean VerifyMyAccountVisible() {
        return driver.findElement(this.VERIFY_ACCOUNT_VISIBLE).isDisplayed();
    }
}
