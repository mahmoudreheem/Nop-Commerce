package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_HomePage;
import pages.PageBase;

public class TC03_SearchFunction extends Testbase {

    @Test(priority = 1, description = "Search in Products")
    public void SearchProducts() throws InterruptedException {
         new PageBase(driver).searchFunction("Shoes").clickSearch();
         Thread.sleep(2000);
        Assert.assertTrue(new PageBase(driver).VerifySearchResultVisible());

    }
}