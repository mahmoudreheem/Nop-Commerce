package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P04_RecoverPassword {
    WebDriver driver;

    // TODO: Step1: Constructor
    public P04_RecoverPassword(WebDriver driver) {
        this.driver = driver;
    }

    // TODO step2: define locators
    private final By INPUTEMAIL = By.xpath("(//input[@id=\"Email\"])");
    private final By RECOVER_BUTTON = By.xpath("(//button[@type=\"submit\"])[2]");
    private final By RECOVERY_MESSAGE_VISIBLE = By.xpath("(//p[@class=\"content\"])");

    // TODO: step3 define action methods
    public P04_RecoverPassword SetEmailToRecoverPassword(String email) throws InterruptedException {
        driver.findElement(this.INPUTEMAIL).sendKeys(email);
        Thread.sleep(1000);
        return this;
    }

    public P04_RecoverPassword ClickRecoverButton() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(this.RECOVER_BUTTON).click();

        return this;
    }

    public String VerifyRecoverEmailSuccessfully() throws InterruptedException {
        return driver.findElement(this.RECOVERY_MESSAGE_VISIBLE).getText();
    }
}
