package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


public class DriverManager {

    public static WebDriver webDriver;

    public static WebDriver getWebDriver() {
        if (webDriver == null) {
            webDriver = new ChromeDriver(DriverUtils.configurationChromeOptions());
        }
        return webDriver;
    }

    public static void closeWebDriver() throws IOException {
        webDriver.close();
        if (webDriver != null) {
            webDriver.quit();
            webDriver = null;
        }
    }
}

