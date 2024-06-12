package testcases;

import org.testng.annotations.Test;
import pages.P0_HomePage;
import pages.P09_AddToCart;


public class TC09_AddToCart extends Testbase {

    @Test(priority = 1, description = "Add to cart")
    public  void AddToCard() throws InterruptedException {
         new P09_AddToCart(driver).AddToCart();
        Thread.sleep(3000);
    }
}
