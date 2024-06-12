package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P02_LoginPage;
//import pages.P01_LoginPage;

import static testcases.TC02_Registration.*;

public class TC01_Login extends Testbase{
    //Define Test Data

   // String Password="P@ssw0rd";

    @Test(priority = 1,description = "Check Login Page With Valid Data")
    public void LoginPageWithValidData_P() throws InterruptedException {
        new P02_LoginPage(driver).inputEmail(RandomEmail).inputPassword(password).inputLoginButton();
        Thread.sleep(2000);
        System.out.println(RandomEmail);
        System.out.println(password);
        Assert.assertTrue(new P02_LoginPage(driver).VerifyMyAccountVisible());


    }

}
