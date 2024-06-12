package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P08_SelectWishlist;
import pages.P0_HomePage;
import pages.P10_ShoppingCart;


public class TC08_AddToWishList extends Testbase {


    @Test(priority = 1, description = "Login to System with Valid Data")
    public  void checkAddWishList() throws InterruptedException {
        new P08_SelectWishlist(driver).clickAddWishlistButton();
        Thread.sleep(1000);
        Assert.assertTrue(new P08_SelectWishlist(driver).verifyAddWishListVisible("The product has been added to your "));

    }
}
