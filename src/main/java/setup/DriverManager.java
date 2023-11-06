package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


public class DriverManager {

    public static WebDriver webDriver;

    /**
     * Initializing a chromedriver with chrome options
     * @return the completed webdriver
     */
    public static WebDriver getWebDriver() {
        if (webDriver == null) {
            webDriver = new ChromeDriver(DriverUtils.configurationChromeOptions());
        }
        return webDriver;
    }

    /**
     * Closing a driver and quitting it
     */
    public static void closeWebDriver() {
        webDriver.close();
        if (webDriver != null) {
            webDriver.quit();
            webDriver = null;
        }
    }
}

