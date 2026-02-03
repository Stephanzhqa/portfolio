package pom.pages;

import helpers.Actions;
import helpers.Assertions;
import pom.selectors.pagesSelectors.LoginPageSel;
import pom.selectors.thruSelectors.Footer;
import pom.selectors.thruSelectors.Header;

import static com.codeborne.selenide.Selenide.sleep;


public class LoginPage {

    private final Actions actions = new Actions();
    private final Assertions assertions = new Assertions();
    private final LoginPageSel loginPageSel = new LoginPageSel();
    private final Header header = new Header();
    private final Footer footer = new Footer();


    public void mainElementsLoginIsDisplayed() {
        sleep(5000);
        assertions.isVisible(loginPageSel.inputUserName);
        assertions.isVisible(loginPageSel.inputPassword);
        assertions.isVisible(loginPageSel.buttonLogin);
        assertions.isVisible(loginPageSel.buttonNewUser);
        assertions.isVisible(header.pageTitle);
        assertions.isVisible(footer.allRightsReserved);
    }

    public void successfulLogin () {
        actions.click(loginPageSel.inputUserName);
        actions.setText(loginPageSel.inputUserName, "Vladimir");
        actions.click(loginPageSel.inputPassword);
        actions.setText(loginPageSel.inputPassword, "123123123Aa!");
        actions.click(loginPageSel.buttonLogin);
        //assertion needed
    }
}
