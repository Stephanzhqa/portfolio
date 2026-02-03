package tests.ui;

import com.codeborne.selenide.junit5.TextReportExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import config.BasePage;
import pom.pages.FormsPage;
import pom.pages.HomePage;
import tests.config.BaseUITest;
import logger.BaseLogger;

@ExtendWith(TextReportExtension.class)

public class FormsPageTest extends BaseUITest {

    private final BasePage basePage = new BasePage();
    private final HomePage homePage = new HomePage();
    private final FormsPage formsPage = new FormsPage();
    private final BaseLogger baseLogger = new BaseLogger();


    @Test
    void userCanOpenFormsPage() {
        basePage.openUrl("https://demoqa.com"); baseLogger.consoleLogInfo("Home page opened");
        homePage.mainCardsShouldBeDisplayed(); baseLogger.consoleLogInfo("Home page main elements displayed");
        formsPage.openFormsPage(); baseLogger.consoleLogInfo("Forms page opened");
        formsPage.mainFormsElementsIsDisplayed(); baseLogger.consoleLogInfo("Forms page main elements displayed");
    }
}