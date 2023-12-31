package base;

import org.openqa.selenium.support.PageFactory;
import setup.DriverManager;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class BasePage {

    /**
     * Here we are creating a Page Factory to use a @FindBy annotation
     */
    private final Logger logger = LogManager.getLogManager().getLogger(this.getClass().getName());

    public BasePage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public Logger log() {
        return logger;
    }

}