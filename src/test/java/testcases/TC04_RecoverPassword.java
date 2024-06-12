package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P04_RecoverPassword;

import static testcases.TC02_Registration.RandomEmail;

public class TC04_RecoverPassword extends Testbase {
    @Test(priority = 1, description = "Check Recover Email ")
    public void RecoverPassword() throws InterruptedException {
        new P04_RecoverPassword(driver).SetEmailToRecoverPassword(RandomEmail).ClickRecoverButton();
        Thread.sleep(1000);
        Assert.assertEquals(new P04_RecoverPassword(driver).VerifyRecoverEmailSuccessfully(), "Email with instructions has been sent to you.");
        Thread.sleep(1000);
    }
}
