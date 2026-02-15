package tests.api;

import config.CredentialsConfig;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    private static final String BASE_URL = "https://demoqa.com";
    private static final String LOGIN_ENDPOINT = "/Account/v1/Login";

    @Test
    @DisplayName("POST / Login with valid credentials")
    void shouldLoginSuccessfully() {
        String username = CredentialsConfig.demoQaUsername();
        String password = CredentialsConfig.demoQaPassword();

        Response response =
                given()
                        .baseUri(BASE_URL)
                        .contentType("application/json")
                        .body("""
                                {
                                  "userName": "%s",
                                  "password": "%s"
                                }
                                """.formatted(username, password))
                        .log().all()
                        .when()
                        .post(LOGIN_ENDPOINT)
                        .then()
                        .statusCode(200)
                        .body("userId", notNullValue())
                        .body("username", equalTo(username))
                        .body("token", notNullValue())
                        .body("expires", notNullValue())
                        .body("isActive", notNullValue())
                        .log().all()
                        .extract().response();


        // Additional assertions
        String token = response.jsonPath().getString("token");
        String userId = response.jsonPath().getString("userId");

        assertNotNull(token, "Token should not be null");
        assertNotNull(userId, "User ID should not be null");
    }
}
