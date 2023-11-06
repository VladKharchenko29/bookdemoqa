package base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import setup.DriverManager;

import java.io.IOException;

public class BaseTest {

    /**
     * Setup a driver before each test
     */
    @BeforeTest
    public void setup() {
        DriverManager.getWebDriver();
    }

    /**
     * Close a driver after each test
     */
    @AfterTest
    public void teardown() throws IOException {
        setup.DriverManager.closeWebDriver();
    }
}
