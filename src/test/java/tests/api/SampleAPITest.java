package tests.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

public class SampleAPITest {

    @Test
    void getSampleUser() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        RestAssured
                .given()
                .when()
                .get("/users/1")
                .then()
                .statusCode(200)
                .body("username", equalTo("Bret"))
                .body("id", equalTo(1));
    }
}
