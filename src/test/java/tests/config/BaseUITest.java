package tests.config;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.closeWebDriver;

// This class exists only to be extended. It only provides shared setup and teardown logic for real test classes.
public class BaseUITest {

    @BeforeAll
    static void setup() {
        System.out.println("Successful BaseUI setup");
        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.browserSize = "1920x1080";
    }
    // Tests must not depend on each other
    @AfterEach
    void tearDown() {     // Each test starts clean / Parallel-safe / CI-safe
        closeWebDriver(); // Kills WebDriver session & Frees memory
    }
}
