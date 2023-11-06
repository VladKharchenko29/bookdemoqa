package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import setup.DriverManager;

import java.time.Duration;
import java.time.temporal.ChronoUnit;


public class BooksPage extends BasePage {

    @FindBy(id = "login")
    private WebElement loginBtn;
    @FindBy(id = "userName")
    private WebElement userName;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(id = "see-book-Git Pocket Guide")
    private WebElement book;
    @FindBy(css = ".text-right.fullButton .btn-primary")
    private WebElement addToCollectionBtn;
    @FindBy(css = "span#delete-record-undefined  path")
    private WebElement deleteIcon;
    @FindBy(id = "closeSmallModal-ok")
    private WebElement okBtn;
    @FindBy(css = "label#notLoggin-label > a:nth-of-type(1)")
    private WebElement loginSmallBtn;

    private void waitFor() {
        DriverManager.getWebDriver().manage().timeouts().implicitlyWait(Duration.of(2, ChronoUnit.SECONDS));
    }

    public BooksPage doLogin() {
        loginBtn.click();
        waitFor();
        userName.sendKeys("rio5");
        password.sendKeys("rio55W7iii#");
        loginBtn.click();
        return this;
    }

    public void selectAndAddBook() {
        book.click();
        addToCollectionBtn.click();
    }

    public void deleteBook() {
        deleteIcon.click();
        okBtn.click();
    }

    public BooksPage selectLoginBtn() {
        loginSmallBtn.click();
        return this;
    }
}
