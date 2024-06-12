package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;


public class TC11_Checkout extends Testbase {

    @Test(priority = 1, description = "selectCheckbox")
    public void selectCheckbox() throws InterruptedException {
        new P11_Checkout(driver).clickCheckBox();
        Thread.sleep(1000);
    }

    @Test(priority = 2, description = "Select Checkout ")
    public void SelectCheckoutButton() throws InterruptedException {
        new P11_Checkout(driver).clickCheckoutButton();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/onepagecheckout#opc-billing");
    }

}