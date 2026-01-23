package tests.ui;

import com.codeborne.selenide.junit5.TextReportExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import config.BasePage;
import pom.pages.HomePage;
import pom.pages.BookStoreAppPage;
import tests.config.BaseUITest;


@ExtendWith(TextReportExtension.class)

public class BookStoreAppPageTest extends BaseUITest {

    private final BasePage basePage = new BasePage();
    private final HomePage homePage = new HomePage();
    private final BookStoreAppPage bookStoreAppPage = new BookStoreAppPage();

    @Test
    void userCanOpenBookStoreAppPage() {
        basePage.openUrl("https://demoqa.com");
        homePage.mainCardsShouldBeDisplayed();
        bookStoreAppPage.openBookStoreAppPage();
        bookStoreAppPage.mainPanelBookStoreAppIsDisplayed();
        bookStoreAppPage.thruElementsIsDisplayed();
    }
}