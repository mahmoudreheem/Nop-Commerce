package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P09_AddToCart;
import pages.P10_ShoppingCart;

public class TC10_ShoppingCartPage extends Testbase{

        @Test(priority = 1, description = "Shopping Cart PAge")
        public  void ClickShoppingCart() throws InterruptedException {
            new P10_ShoppingCart(driver).clickShoppingButton();
            Thread.sleep(1000);
             Assert.assertTrue(new P10_ShoppingCart(driver).verifyShoppingTitleVisible("Shopping cart"));
            Thread.sleep(7000);
        }
}
