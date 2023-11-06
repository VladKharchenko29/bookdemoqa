package base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import setup.DriverManager;

import java.io.IOException;

public class BaseTest {


    @BeforeTest
    public void setup() {
        DriverManager.getWebDriver();
    }


    @AfterTest
    public void teardown() throws IOException {
//        setup.DriverManager.closeWebDriver();
    }
}
