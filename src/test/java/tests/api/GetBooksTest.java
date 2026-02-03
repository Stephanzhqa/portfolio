package tests.api;

import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;


public class GetBooksTest {

    private static final String BASE_URL = "https://demoqa.com";
    private static final String BOOKS_ENDPOINT = "/BookStore/v1/Books";

    @Test
    @DisplayName("GET /Books returns valid list of books")
    void shouldReturnListOfBooks() {
        Response response =
                given() // Prepare request, Base URI set
                        .log().all()
                        .baseUri(BASE_URL)
                        .when() // Execute HTTP call
                        .get(BOOKS_ENDPOINT) // Sends GET request to:
                        .then() //Assertions start here
                        .statusCode(200)
                        .body("books", not(empty()))
                        .extract().response(); //Only happens if previous steps passed

        List<Map<String, Object>> books = response.jsonPath().getList("books"); //Converts JSON into Java structures, Each book = Map<String, Object>, books = list of maps

        assertFalse(books.isEmpty(), "Books list should not be empty"); //Clear failure message

        // Validate structure of each book, schema-like structure
        for (Map<String, Object> book : books) {
            assertNotNull(book.get("isbn"));
            assertNotNull(book.get("title"));
            assertNotNull(book.get("author"));
            assertNotNull(book.get("publish_date"));
            assertNotNull(book.get("publisher"));
            assertTrue((Integer) book.get("pages") > 0);
        }
    }
    }