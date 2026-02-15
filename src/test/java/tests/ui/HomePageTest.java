package tests.ui;

import com.codeborne.selenide.junit5.TextReportExtension;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import config.BasePage;
import pom.pages.HomePage;
import tests.config.BaseUITest;
import logger.BaseLogger;

@ExtendWith(TextReportExtension.class)

@Epic("UI")
@Severity(SeverityLevel.CRITICAL)

public class HomePageTest extends BaseUITest {

    private final BasePage basePage = new BasePage();
    private final HomePage homePage = new HomePage();
    private final BaseLogger baseLogger = new BaseLogger();


    @Test
    @Tag("UI")
    @Story("User can open Home Page")
    @Feature("all main elements are displayed")
    @Description("The test verifies that the user opens the home page and all main elements are displayed")

    public void userCanOpenHomePage() {
        basePage.openUrl("https://demoqa.com");
        baseLogger.consoleLogInfo("Home page opened");
        homePage.mainCardsShouldBeDisplayed();
        baseLogger.consoleLogInfo("Home page elements displayed");
    }
}