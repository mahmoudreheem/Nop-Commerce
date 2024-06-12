package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class P07_SelectCertainBook {
    Actions actions;
    WebDriver driver;

    public P07_SelectCertainBook(WebDriver driver) {
        this.driver = driver;
    }

    private final By FIRST_BOOK = By.xpath("(//div[@class=\"details\"])/h2[@class=\"product-title\"]/a[@href=\"/fahrenheit-451-by-ray-bradbury\"]");

private final By VERIFY_TITLE_VISIBLE=By.xpath("(//div[@class=\"product-name\"])");
    // TODO: step3 define action methods
    public P07_SelectCertainBook selectFirstBook() throws InterruptedException {
        driver.findElement(this.FIRST_BOOK).click();
        Thread.sleep(2000);
        return this;
    }
//    public Boolean Verify(){
//       return driver.findElement(this.VERIFY_TITLE_VISIBLE).isDisplayed();
//
//    }
}
