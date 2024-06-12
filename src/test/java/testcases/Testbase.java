package testcases;

import common.MyScreenRecorder;
import drivers.DriverFactory;
import drivers.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Testbase {
    protected static WebDriver driver;

    @Parameters("browser")
    @BeforeTest
    public void setupDriver(@Optional("chrome") String browser) throws Exception {
// start recording
       // MyScreenRecorder.startRecording("sprint1");
        driver = DriverFactory.getNewInstance(browser);
        DriverHolder.setDriver(driver);
        driver.get("https://demo.nopcommerce.com/");
    }

    @AfterTest
    public void tearDown() throws Exception {
        if (driver != null) {
            driver.quit();
        }
       // MyScreenRecorder.stopRecording();
    }
}


