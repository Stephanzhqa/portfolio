package tests.functional;

import com.codeborne.selenide.junit5.TextReportExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import helpers.Actions;
import org.junit.jupiter.api.Test;
import config.BasePage;

import pom.pages.FormsPage;
import tests.config.BaseUITest;

@ExtendWith(TextReportExtension.class)

public class submitRegFormTest extends BaseUITest {

    private final BasePage basePage = new BasePage();
    private final FormsPage formsPage = new FormsPage();
    private final Actions actions = new Actions();


    @Test
    void userCanSubmitRegistrationForm() {
        basePage.openUrl("https://demoqa.com/automation-practice-form");
        formsPage.mainFormsElementsIsDisplayed();

    }
}
