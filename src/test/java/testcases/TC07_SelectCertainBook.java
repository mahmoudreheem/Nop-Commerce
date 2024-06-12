package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P07_SelectCertainBook;


public class TC07_SelectCertainBook extends Testbase{


    @Test(priority = 1, description = "Select Book ")
    public void selectBook() throws InterruptedException {
        new P07_SelectCertainBook(driver).selectFirstBook();
       // Assert.assertTrue(new P07_SelectCertainBook(driver).Verify());
        Thread.sleep(2000);
}}
