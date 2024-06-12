package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_HomePage;

public class TC0_HomePage extends Testbase {
    //Define Test Data
    @Test(priority = 1,description = "Check Login Links ")
    public void CheckLoginLinks() throws InterruptedException {
        new P0_HomePage(driver).clickLoginTap();
        Thread.sleep(3000);
         Assert.assertTrue(new P0_HomePage(driver).verifyLoginButtonVisible());

    }
    @Test(priority = 2,description = "Check Register Links ")
    public void CheckRegisterLinks() throws InterruptedException {
        new P0_HomePage(driver).clickRegisterTap();
        Thread.sleep(3000);
        Assert.assertTrue(new P0_HomePage(driver).verifyRegisterButtonVisible());

    }
}
