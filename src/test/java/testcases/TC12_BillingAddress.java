package testcases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import static util.Utility.*;


public class TC12_BillingAddress extends Testbase {

    @Test(priority = 1, description = "Fill Billing Data")
    public void enterBillingData() throws InterruptedException {
        WebElement Country ;
        new P12_BillingAddress(driver).enterFirstname("").enterLastname("").enterEmail("").selectCountryByVisibleText( "Egypt")
                .enterCity("Cairo").enterAddress("Maadi").enterPostalCode("A1233").enterPhone("1001001").pressContinou();
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/onepagecheckout#opc-shipping_method");
    }

    @Test(priority = 2, description = "Success Order")
    public void successOrder() throws InterruptedException {
        WebElement Country ;
        new P12_BillingAddress(driver).completeOrder();
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/checkout/completed");
    }
}
