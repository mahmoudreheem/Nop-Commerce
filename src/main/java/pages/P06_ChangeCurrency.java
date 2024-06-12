package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//import static util.Utility.getRandomIntFrom1to7;

public class P06_ChangeCurrency {
    WebDriver driver;

    public P06_ChangeCurrency(WebDriver driver) {
        this.driver = driver;
    }

    private final By VERIFY_CURRENCY_VISIBLE=By.xpath("(//select[@id=\"customerCurrency\"])/option[2]");

    public P06_ChangeCurrency ChangeCurrency() throws InterruptedException {

        WebElement Currency = driver.findElement(By.xpath("(//select[@id=\"customerCurrency\"])"));
        Select select = new Select(Currency);
        // Select the second item in the dropdown
        select.selectByIndex(1);
        return this;
    }
    public String VerifyEuroVisible() {
        return driver.findElement(this.VERIFY_CURRENCY_VISIBLE).getText();
    }
}


