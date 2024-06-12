package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P06_ChangeCurrency;

import static org.testng.Assert.assertEquals;

public class TC06_ChangeCurrency extends Testbase{

    // define pages
    P06_ChangeCurrency changeCurrency;

    @Test(priority = 1, description = "Change Currency ")
    public void ChangeCurrency() throws InterruptedException {
        new P06_ChangeCurrency(driver).ChangeCurrency();
        Assert.assertEquals(new P06_ChangeCurrency(driver).VerifyEuroVisible(), "Euro");
        Thread.sleep(2000);
}}
