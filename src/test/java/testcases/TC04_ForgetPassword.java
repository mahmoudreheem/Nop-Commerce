package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P03_ForgetPassword;

public class TC04_ForgetPassword extends Testbase {

        @Test(priority = 1, description = "Check Forget Password Link ")
        public void CheckForgetPasswordLink() throws InterruptedException {
            new P03_ForgetPassword(driver).CheckForgetPasswordLink();
            Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/passwordrecovery");
            Thread.sleep(3000);
        }
}
