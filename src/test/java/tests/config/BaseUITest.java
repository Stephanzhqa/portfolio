package tests.config;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseUITest {

    @BeforeAll
    static void setUp() {
        System.out.println("Successful BaseUI setup");
        Configuration.browser = "chrome";
        Configuration.headless = true;
        Configuration.browserSize = "1920x1080";
    }

    @AfterAll
    static void tearDown() {
        closeWebDriver();

    }
}
