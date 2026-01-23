package tests.ui;

import com.codeborne.selenide.junit5.TextReportExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import config.BasePage;
import pom.pages.HomePage;
import tests.config.BaseUITest;

@ExtendWith(TextReportExtension.class)

public class HomePageTest extends BaseUITest {

    private final BasePage basePage = new BasePage();
    private final HomePage homePage = new HomePage();

    @Test
    public void userCanOpenHomePage() {
        basePage.openUrl("https://demoqa.com");
        homePage.mainCardsShouldBeDisplayed();
    }
}