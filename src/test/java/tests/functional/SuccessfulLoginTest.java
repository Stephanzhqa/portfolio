package tests.functional;

import com.codeborne.selenide.junit5.TextReportExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import config.BasePage;
import pom.pages.LoginPage;
import tests.config.BaseUITest;

@ExtendWith(TextReportExtension.class)

public class SuccessfulLoginTest extends BaseUITest {

    private final BasePage basePage = new BasePage();
    private final LoginPage loginPage = new LoginPage();

    @Test
    void userCanLogin() {
        basePage.openUrl("https://demoqa.com/login");
        loginPage.successfulLogin();
    }
}