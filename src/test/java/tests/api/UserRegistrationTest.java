package tests.api;

import io.restassured.specification.RequestSpecification;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class UserRegistrationTest {

    private static final String BASE_URL = "https://demoqa.com";
    private static final String REGISTER_ENDPOINT = "/Account/v1/User";

    @Test
    @DisplayName("POST /Successful user registration")
    void shouldRegisterNewUserSuccessfully() {
        //Test Data
        String username = "user_" + UUID.randomUUID(); //Prevents duplicate user errors, Makes test repeatable,UUID guarantees uniqueness
        String password = "Password123!";

        //Request
        Response response =
                given()
                        .baseUri(BASE_URL)
                        .contentType("application/json")
                        .body(("""
                              {
                                "userName": "%s",
                                "password": "%s"
                              }
                              """.formatted(username, password)))
                        .log().all()
                        .when()
                        .post(REGISTER_ENDPOINT)
                        .then()
                        .statusCode(201)
                        .body("userID", notNullValue())
                        .body("username", equalTo(username))
                        .body("books", empty())
                        .extract().response(); //extra Java assertions.

    Object userId = response.jsonPath().get("userID");

        assertNotNull(userId, "User ID should not be null");
        //assertFalse(userId.isEmpty(), "User ID should not be empty");
    }
}