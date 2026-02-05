package tests.ui;

import com.codeborne.selenide.junit5.TextReportExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import config.BasePage;
import pom.pages.PracticeFormPage;
import pom.pages.HomePage;
import tests.config.BaseUITest;
import logger.BaseLogger;

@ExtendWith(TextReportExtension.class)

public class PracticeFormPageTest extends BaseUITest {

    private final BasePage basePage = new BasePage();
    private final HomePage homePage = new HomePage();
    private final PracticeFormPage formsPage = new PracticeFormPage();
    private final BaseLogger baseLogger = new BaseLogger();


    @Test
    void userCanOpenFormsPage() {

        basePage.openUrl("https://demoqa.com");
        baseLogger.consoleLogInfo("Home page is opened");
        homePage.mainCardsShouldBeDisplayed();
        baseLogger.consoleLogInfo("Home page elements displayed");
        formsPage.openFormsPage();
        baseLogger.consoleLogInfo("Forms page opened");
        formsPage.mainFormsElementsIsDisplayed();
        baseLogger.consoleLogInfo("Forms page elements displayed");
        formsPage.openPracticeFormPage();
        baseLogger.consoleLogInfo("Practice form page opened");
        formsPage.mainElementsRegFormIsDisplayed();
        baseLogger.consoleLogInfo("Forms page elements displayed");
    }
}