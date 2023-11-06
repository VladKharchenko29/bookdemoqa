import base.BaseTest;
import org.testng.annotations.Test;
import pages.BooksPage;
import setup.DriverManager;

public class DeleteBookTest extends BaseTest {

    /**
     * Test to delete an added book
     */
    @Test
    public void addBook() {
        DriverManager.getWebDriver().navigate().to("https://demoqa.com/profile");
        new BooksPage()
                .selectLoginBtn()
                .doLogin()
                .deleteBook();
    }
}
