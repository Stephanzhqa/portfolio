package tests.api;

import config.CredentialsConfig;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

public class GenerateTokenTest {

    private static final String BASE_URL = "https://demoqa.com";
    private static final String TOKEN_ENDPOINT = "/Account/v1/GenerateToken";

    @Test
    @DisplayName("POST / Generate token for valid user")
    void shouldGenerateTokenSuccessfully() {
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
                        .post(TOKEN_ENDPOINT)
                        .then()
                        .statusCode(200)
                        .body("token", notNullValue())
                        .body("status", equalTo("Success"))
                        .body("result", equalTo("User authorized successfully."))
                        .body("expires", notNullValue())
                        .extract().response();

        // Additional assertions
        String token = response.jsonPath().getString("token");

        assertNotNull(token, "Token should not be null");
        assertFalse(token.isEmpty(), "Token should not be empty");
    }
}
