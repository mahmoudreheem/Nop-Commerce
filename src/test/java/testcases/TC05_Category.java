package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P05_Category;

public class TC05_Category extends Testbase{

    @Test(priority = 1,description = "Select Book Category")
    public void ChooseCategory() throws InterruptedException {
        new P05_Category(driver).SelectBookCategory();
        Assert.assertTrue(new P05_Category(driver).VerifyCategoryVisible());;
        Thread.sleep(2000);

    }
}

