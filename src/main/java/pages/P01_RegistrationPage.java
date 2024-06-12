package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_RegistrationPage {
    WebDriver driver;

    public P01_RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    private final By GENDER = By.xpath("//input[@id=\"gender-male\"]");
    private final By FIRSTNAME = By.xpath("//input[@id=\"FirstName\"]");
    private final By LASTNAME = By.xpath("//input[@id=\"LastName\"]");
    private final By EMAIL = By.xpath("//input[@id=\"Email\"]");
    private final By COMPANY = By.xpath("//input[@id=\"Company\"]");
    private final By PASSWORD = By.xpath("//input[@id=\"Password\"]");
    private final By CONFIRM_PASSWORD = By.xpath("//input[@id=\"ConfirmPassword\"]");
    private final By REGISTER_BUTTON = By.xpath("//button[@id=\"register-button\"]");
    private final By REGISTERED_SUCCESSFULLY_TEXT=By.xpath("(//div[@class=\"result\"])");

    //Action Method
    public P01_RegistrationPage inputGender() {
        driver.findElement(this.GENDER).click();
        return this;
    }

    public P01_RegistrationPage inputFirstName(String firstname) {
        driver.findElement(this.FIRSTNAME).sendKeys(firstname);
        return this;
    }

    public P01_RegistrationPage inputLastName(String lastname) {
        driver.findElement(this.LASTNAME).sendKeys(lastname);
        return this;
    }
    public P01_RegistrationPage inputEmail(String email) {
        driver.findElement(this.EMAIL).sendKeys(email);
        return this;
    }
    public P01_RegistrationPage inputCompany(String company) {
        driver.findElement(this.COMPANY).sendKeys(company);
        return this;
    }

    public P01_RegistrationPage inputPassword(String password) {
        driver.findElement(this.PASSWORD).sendKeys(password);
        return this;
    }
    public P01_RegistrationPage inputConfirmPassword(String password) {
        driver.findElement(this.CONFIRM_PASSWORD).sendKeys(password);
        return this;
    }
    public P01_RegistrationPage RegisterButton() {
        driver.findElement(this.REGISTER_BUTTON).click();
        return this;
    }
    public Boolean VerifyRegisteredSuccessfully(){
 return  driver.findElement(this.REGISTERED_SUCCESSFULLY_TEXT).getText().contains("Your registration completed");
    }
}
