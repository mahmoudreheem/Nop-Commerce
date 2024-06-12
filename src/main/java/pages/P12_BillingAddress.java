package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class P12_BillingAddress {
    WebDriver driver;

    public P12_BillingAddress(WebDriver driver) {
        this.driver = driver;
    }

    private final By FIRST_NAME = By.xpath("(//input[@id=\"BillingNewAddress_FirstName\"])");
    private final By LAST_NAME = By.xpath("(//input[@id=\"BillingNewAddress_LastName\"])");
    private final By EMAIL = By.xpath("(//input[@id=\"BillingNewAddress_Email\"])");
    private final By COUNTRY = By.xpath("(//select[@id=\"BillingNewAddress_CountryId\"])");
    private final By CITY = By.xpath("(//input[@id=\"BillingNewAddress_City\"])");
    private final By ADDRESS = By.xpath("(//input[@id=\"BillingNewAddress_Address1\"])");
    private final By POSTAL_CODE = By.xpath("(//input[@id=\"BillingNewAddress_ZipPostalCode\"])");
    private final By PHONE_NUMBER = By.xpath("(//input[@id=\"BillingNewAddress_PhoneNumber\"])");
    private final By CONTINUE_BUTTON = By.xpath("(//button[@name=\"save\"])");
    private final By CONTINUE_BUTTON_SHIPPING = By.xpath("(//button[@class=\"button-1 shipping-method-next-step-button\"])");
    private final By CONTINUE_BUTTON_PAYMENT = By.xpath("(//button[@class=\"button-1 payment-method-next-step-button\"])");
    private final By CONTINUE_BUTTON_PAYMENT2= By.xpath("(//button[@class=\"button-1 payment-info-next-step-button\"])");
    private final By CONTINUE_BUTTON_CONFIRM= By.xpath("(//button[@class=\"button-1 confirm-order-next-step-button\"])");
    // TODO: step3 define action methods
    public P12_BillingAddress enterFirstname(String firstname) throws InterruptedException {
        driver.findElement(this.FIRST_NAME).sendKeys(firstname);
        Thread.sleep(3000);
        return this;
    }

    public P12_BillingAddress enterLastname(String lastname) throws InterruptedException {
        driver.findElement(this.LAST_NAME).sendKeys(lastname);
        Thread.sleep(2000);
        return this;
    }

    public P12_BillingAddress enterEmail(String email) throws InterruptedException {
        driver.findElement(this.EMAIL).sendKeys(email);
        Thread.sleep(2000);
        return this;
    }

    public P12_BillingAddress selectCountryByVisibleText(String countryName) throws InterruptedException {
        WebElement conuntry = driver.findElement(this.COUNTRY);
        conuntry.click();
        Select countrySelect = new Select(conuntry);
        countrySelect.selectByVisibleText(countryName);
        return this;
    }

    public P12_BillingAddress enterCity(String city) throws InterruptedException {
        driver.findElement(this.CITY).sendKeys(city);
        Thread.sleep(2000);
        return this;
    }

    public P12_BillingAddress enterAddress(String address) throws InterruptedException {
        driver.findElement(this.ADDRESS).sendKeys(address);
        Thread.sleep(2000);
        return this;
    }

    public P12_BillingAddress enterPostalCode(String code) throws InterruptedException {
        driver.findElement(this.POSTAL_CODE).sendKeys(code);
        Thread.sleep(2000);
        return this;
    }

    public P12_BillingAddress enterPhone(String phone) throws InterruptedException {
        driver.findElement(this.PHONE_NUMBER).sendKeys(phone);
        Thread.sleep(2000);
        return this;
    }

    public P12_BillingAddress pressContinou() throws InterruptedException {
        driver.findElement(this.CONTINUE_BUTTON).click();
        Thread.sleep(2000);
        return this;

    }

    public P12_BillingAddress completeOrder() throws InterruptedException {
        driver.findElement(this.CONTINUE_BUTTON_SHIPPING).click();
        Thread.sleep(1000);
        driver.findElement(this.CONTINUE_BUTTON_PAYMENT).click();
        Thread.sleep(1000);
        driver.findElement(this.CONTINUE_BUTTON_PAYMENT2).click();
        Thread.sleep(1000);
        driver.findElement(this.CONTINUE_BUTTON_CONFIRM).click();
        Thread.sleep(1000);
        Thread.sleep(2000);
        return this;

    }
}