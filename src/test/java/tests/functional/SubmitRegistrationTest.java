package tests.functional;

import com.codeborne.selenide.junit5.TextReportExtension;
import config.BasePage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pom.pages.LoginPage;
import tests.config.BaseUITest;
import pom.pages.RegistrationPage;
import logger.BaseLogger;

@ExtendWith(TextReportExtension.class)

public class SubmitRegistrationTest extends BaseUITest {

    private final BasePage basePage = new BasePage();
    private final LoginPage loginPage = new LoginPage();
    private final RegistrationPage registrationPage = new RegistrationPage();
    private final BaseLogger baseLogger = new BaseLogger();

    @Test
    void userCanRegister() {
        basePage.openUrl("https://demoqa.com/login");
        baseLogger.consoleLogInfo("Login page opened");
        loginPage.mainElementsLoginIsDisplayed();
        baseLogger.consoleLogInfo("Login page elements displayed");
        registrationPage.openRegistrationForm();
        baseLogger.consoleLogInfo("Registration page opened");
        registrationPage.mainElementsRegistrationIsDisplayed();
        baseLogger.consoleLogInfo("Registration page elements displayed");
//        registrationPage.createNewUser();
//        baseLogger.consoleLogInfo("User created");
    }
}