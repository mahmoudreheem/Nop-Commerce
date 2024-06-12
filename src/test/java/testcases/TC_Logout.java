package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P02_LoginPage;
import pages.P_LogoutPage;

import static testcases.TC02_Registration.RandomEmail;
import static testcases.Testbase.driver;

public class TC_Logout extends Testbase{


    @Test(priority = 1,description = "Check Logout Link")
    public void LogoutPage() throws InterruptedException {
        Thread.sleep(10000);
        new P_LogoutPage(driver).Logout();
        Assert.assertTrue(new P_LogoutPage(driver).VerifyLoginVisible());

    }
}
