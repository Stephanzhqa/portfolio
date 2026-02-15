package tests.functional;

import com.codeborne.selenide.junit5.TextReportExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.Test;
import config.BasePage;
import pom.pages.SearchPage;
import tests.config.BaseUITest;
import logger.BaseLogger;
import com.codeborne.selenide.junit5.ScreenShooterExtension;


@ExtendWith(TextReportExtension.class)
@ExtendWith(ScreenShooterExtension.class)

public class SearchBookTest extends BaseUITest {

    BasePage basePage = new BasePage();
    SearchPage searchPage = new SearchPage();
    BaseLogger baseLogger = new BaseLogger();


    @Test
    public void userCanSearchBook() {
        basePage.openUrl("https://demoqa.com/books");
        baseLogger.consoleLogInfo("Book page opened");
        searchPage.mainElementsSearchIsDisplayed();
        baseLogger.consoleLogInfo("Search page elements displayed");
        searchPage.successfulSearchBook();
        baseLogger.consoleLogInfo("Book successfully found");
    }
}