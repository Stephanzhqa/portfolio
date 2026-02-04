package tests.ui;

import com.codeborne.selenide.junit5.TextReportExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import config.BasePage;
import pom.pages.ElementsPage;
import pom.pages.HomePage;
import tests.config.BaseUITest;
import logger.BaseLogger;

@ExtendWith(TextReportExtension.class)

public class ElementsPageTest extends BaseUITest {

    private final BasePage basePage = new BasePage();
    private final HomePage homePage = new HomePage();
    private final ElementsPage elementsPage = new ElementsPage();
    private final BaseLogger baseLogger = new BaseLogger();

    @Test
    void userCanOpenElementsPage() {
        basePage.openUrl("https://demoqa.com");
        baseLogger.consoleLogInfo("Home page opened");
        homePage.mainCardsShouldBeDisplayed();
        baseLogger.consoleLogInfo("Home page elements displayed");
        elementsPage.openElementsPage();
        baseLogger.consoleLogInfo("Elements page opened");
        elementsPage.mainElementsElementsIsDisplayed();
        baseLogger.consoleLogInfo("Elements page elements displayed");
    }
}