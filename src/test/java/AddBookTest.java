import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BooksPage;
import setup.DriverManager;

import static io.restassured.RestAssured.given;

public class AddBookTest {

    // Creating test to add a book to the profile
    @Test
    public void addBook() {
        DriverManager.getWebDriver().navigate().to("https://demoqa.com/books"); // opening a webpage
        new BooksPage() // uses Fluent Interface to use methods one by one
                .doLogin() // do a login to the website
                .selectAndAddBook(); // add book

    }

    @Test
    public void verifyBook() {
        String userId = getLoginValue("userId"); // extracting userId value from the response
        String token = getLoginValue("token"); // extracting token value from the response

        System.out.println("FOUND " + userId);

        String bookName = given().log().all()
                .contentType("application/json")
                .header("Authorization", "Bearer " + token) // using extracted Bearer token to authorize
                .when().get("https://demoqa.com/Account/v1/User/" + userId).then().log().all()
                .extract().response().getBody().jsonPath().getString("books[0].title"); // extracting books title

        Assert.assertEquals(bookName, "Git Pocket Guide"); // verifying books title
    }

    private static String getLoginValue(String value) {
        // creating a login string record
        String login = """
                {
                    "userName": "rio5",
                     "password": "rio55W7iii#"}
                """;
        // we are using the same method to extract two different values, because of that we've created a single method fot this
        return given().log().all()
                .body(login)
                .contentType("application/json")
                .when().post("https://demoqa.com/Account/v1/Login").then().log().all()
                .extract().response().getBody().jsonPath().getString(value);
    }

}
