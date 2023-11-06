package setup;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverUtils {


    /**
     * Creating chrome options with arguments. Adding a chromedriver path to the .exe binary file.
     * @return completed options
     */
    public static ChromeOptions configurationChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vladm\\OneDrive\\Desktop\\BookDemoQA\\src\\main\\resources\\chromedriver.exe");

        options.addArguments("start-maximized");
        options.addArguments("--remote-allow-origins=*");
        return options;
    }
}
