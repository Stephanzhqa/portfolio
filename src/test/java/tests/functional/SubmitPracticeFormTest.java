package tests.functional;

import com.codeborne.selenide.junit5.TextReportExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.Test;
import config.BasePage;
import logger.BaseLogger;

import pom.pages.FormsPage;
import tests.config.BaseUITest;

@ExtendWith(TextReportExtension.class)

public class SubmitPracticeFormTest extends BaseUITest {

    private final BasePage basePage = new BasePage();
    private final FormsPage formsPage = new FormsPage();
    private final BaseLogger baseLogger = new BaseLogger();


    @Test
    void userCanSubmitPracticeForm() {
        basePage.openUrl("https://demoqa.com/automation-practice-form");
        baseLogger.consoleLogInfo("Practice form page opened");
        formsPage.mainElementsRegFormIsDisplayed();
        baseLogger.consoleLogInfo("Practice form page elements displayed");
//        formsPage.fillOutRequiredFields
//                ("firstName", "lastName","userEmail","userNumber");
//        baseLogger.consoleLogInfo("Practice form successfully submitted");

    }
}
