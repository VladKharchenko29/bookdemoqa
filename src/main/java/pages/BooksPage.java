package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import setup.DriverManager;

import java.time.Duration;
import java.time.temporal.ChronoUnit;


public class BooksPage extends BasePage {

    /**
     * Creating locators and assigning them to the private variables
     */
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

    /**
     * Wait method in case page will load too long
     */
    private void waitFor() {
        DriverManager.getWebDriver().manage().timeouts().implicitlyWait(Duration.of(2, ChronoUnit.SECONDS));
    }

    /**
     * Do a login
     * @return the same page to use Fluent Interface
     */
    public BooksPage doLogin() {
        loginBtn.click();
        waitFor();
        userName.sendKeys("rio5");
        password.sendKeys("rio55W7iii#");
        loginBtn.click();
        return this;
    }

    /**
     * Selecting a book and adding to the collection
     */
    public void selectAndAddBook() {
        book.click();
        addToCollectionBtn.click();
    }

    /**
     * Deleting a book
     */
    public void deleteBook() {
        deleteIcon.click();
        okBtn.click();
    }

    /**
     * Clicks on the login button if the user opens a profile while unauthorized
     * @return the same page to use Fluent Interface
     */
    public BooksPage selectLoginBtn() {
        loginSmallBtn.click();
        return this;
    }
}
