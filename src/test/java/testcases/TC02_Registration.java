package testcases;

//import com.github.javafaker.Faker;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_RegistrationPage;

import static util.Utility.*;

public class TC02_Registration extends Testbase {

    // define test data
    static String RandomFirstName=getRandomFirstName();
   static String RandomSecondName =getRandomLastName();
    static String RandomEmail =generateRandomEmail();
    String RandomCompany =generateRandomCompanyTitle();
    static String password = "P@ssw0rd123";

    @Test(priority = 1, description = "Register New User With Valid Data")
    public void registerNewUserWithValidData_P() throws InterruptedException {
        new P01_RegistrationPage(driver).inputGender().inputFirstName(RandomFirstName).inputLastName(RandomSecondName).inputEmail(RandomEmail).inputCompany(RandomCompany).inputPassword(password).inputConfirmPassword(password).RegisterButton();
        Assert.assertTrue(new P01_RegistrationPage(driver).VerifyRegisteredSuccessfully());
        Thread.sleep(2000);
        System.out.println(RandomEmail);
        System.out.println(RandomFirstName);
        System.out.println(RandomSecondName);
        System.out.println(RandomCompany);
    }
    }
