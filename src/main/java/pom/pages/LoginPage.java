package pom.pages;

import config.CredentialsConfig;
import helpers.Actions;
import helpers.Assertions;
import pom.selectors.pagesSelectors.LoginPageSel;
import pom.selectors.thruSelectors.Footer;
import pom.selectors.thruSelectors.Header;


public class LoginPage {

    private final Actions actions = new Actions();
    private final Assertions assertions = new Assertions();
    private final LoginPageSel loginPageSel = new LoginPageSel();
    private final Header header = new Header();
    private final Footer footer = new Footer();


    public void mainElementsLoginIsDisplayed() {
        assertions.isVisible(loginPageSel.inputUserName);
        assertions.isVisible(loginPageSel.inputPassword);
        assertions.isVisible(loginPageSel.buttonLogin);
        assertions.isVisible(loginPageSel.buttonNewUser);
        assertions.isVisible(header.pageTitle);
        assertions.isVisible(footer.allRightsReserved);
    }

    public void successfulLogin () {
        actions.click(loginPageSel.inputUserName);
        actions.setText(loginPageSel.inputUserName, CredentialsConfig.demoQaUsername());
        actions.click(loginPageSel.inputPassword);
        actions.setText(loginPageSel.inputPassword, CredentialsConfig.demoQaPassword());
        actions.click(loginPageSel.buttonLogin);
        //assertion needed
    }
}
