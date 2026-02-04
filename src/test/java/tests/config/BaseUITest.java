package tests.config;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseUITest {

    @BeforeAll
    static void setUp() {

        System.out.println("Successful BaseUI setup");
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.timeout = 10_000; //Makes waits explicit and readable.

        //Prevents renderer timeouts, Speeds up tests, Reduces flakiness
        //Selenium considers the page “loaded” when:
        //HTML is loaded, DOM is ready, does NOT wait for: ads, analytics, fonts, trackers
        Configuration.pageLoadStrategy = "eager";

        //Runs Chrome without UI. Faster execution. Required for CI/CD. Works better with Docker / Selenoid
        Configuration.headless = true;

        Configuration.browserSize = "1920x1080";
        Configuration.browserCapabilities = new ChromeOptions()
                .addArguments("--disable-dev-shm-usage") //Prevents shared memory issues
                .addArguments("--no-sandbox") //Required in containerized environments. Avoids permission errors
                .addArguments("--disable-gpu"); //Prevents GPU-related freezes. Especially useful in headless mode
    }

    //Closes browser after all tests, Frees resources, Prevents hanging sessions, Avoids memory leaks
    @AfterAll
    static void tearDown() {
        closeWebDriver();
    }
}
