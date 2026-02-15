
package tests.ui;

import com.codeborne.selenide.junit5.TextReportExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import config.BasePage;
import tests.config.BaseUITest;
import logger.BaseLogger;

    @ExtendWith(TextReportExtension.class)

    public class MainEndpointsTest extends BaseUITest {

        private final BasePage basePage = new BasePage();
        private final BaseLogger baseLogger = new BaseLogger();

        @Test
        void mainEndPointsAreAvailable() {
            basePage.openUrl("/elements");
            baseLogger.consoleLogInfo("/elements opened");
            basePage.openUrl("/forms");
            baseLogger.consoleLogInfo("/forms opened");
            basePage.openUrl("/alertsWindows");
            baseLogger.consoleLogInfo("/alertsWindows opened");
            basePage.openUrl("/widgets");
            baseLogger.consoleLogInfo("/widgets opened");
            basePage.openUrl("/interaction");
            baseLogger.consoleLogInfo("/interaction opened");
            basePage.openUrl("/books");
            baseLogger.consoleLogInfo("/books opened");
            basePage.openUrl("/login");
            baseLogger.consoleLogInfo("/login opened");
            basePage.openUrl("/register");
            baseLogger.consoleLogInfo("/register opened");
        }
    }