package tests.ui;

import com.codeborne.selenide.junit5.TextReportExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import config.BasePage;
import pom.pages.HomePage;
import pom.pages.BookStoreAppPage;
import tests.config.BaseUITest;
import logger.BaseLogger;


@ExtendWith(TextReportExtension.class)

public class BookStoreAppPageTest extends BaseUITest {

    private final BasePage basePage = new BasePage();
    private final HomePage homePage = new HomePage();
    private final BookStoreAppPage bookStoreAppPage = new BookStoreAppPage();
    private final BaseLogger baseLogger = new BaseLogger();

    @Test
    void userCanOpenBookStoreAppPage() {
        basePage.openUrl("https://demoqa.com"); baseLogger.consoleLogInfo("Home page opened");
        homePage.mainCardsShouldBeDisplayed(); baseLogger.consoleLogInfo("Home page elements displayed");
        bookStoreAppPage.openBookStoreAppPage(); baseLogger.consoleLogInfo("Book store app page opened");
        bookStoreAppPage.mainPanelBookStoreAppIsDisplayed(); baseLogger.consoleLogInfo("Book Store elements displayed");
        bookStoreAppPage.thruElementsIsDisplayed(); baseLogger.consoleLogInfo("Thru elements displayed");
    }
}