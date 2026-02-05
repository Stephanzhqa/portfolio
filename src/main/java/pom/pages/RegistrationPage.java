package pom.pages;

import helpers.Actions;
import helpers.Assertions;
import pom.selectors.pagesSelectors.LoginPageSel;
import pom.selectors.pagesSelectors.RegisterPageSel;

import static com.codeborne.selenide.Selenide.sleep;

public class RegistrationPage {
    private final Actions actions = new Actions();
    private final Assertions assertions = new Assertions();
    private final RegisterPageSel registerPageSel = new RegisterPageSel();
    private final LoginPageSel loginPageSel = new LoginPageSel();

    public void openRegistrationForm() {
        actions.clickWithTimeout(loginPageSel.buttonNewUser);
    }

    public void mainElementsRegistrationIsDisplayed() {
        sleep(5000);
        assertions.isVisible(registerPageSel.inputFirstNameReg);
        assertions.isVisible(registerPageSel.inputLastNameReg);
        assertions.isVisible(registerPageSel.inputUserNameReg);
        assertions.isVisible(registerPageSel.inputPasswordReg);
        assertions.isVisible(registerPageSel.backToLoginBtn);
        assertions.isVisible(registerPageSel.registerBtn);
    }
    public void createNewUser () {
        sleep(5000);
        actions.setText(registerPageSel.inputFirstNameReg, "Ivan");
        actions.setText(registerPageSel.inputLastNameReg, "Ivanov");
        actions.setText(registerPageSel.inputUserNameReg, "ivanov");
        actions.setText(registerPageSel.inputPasswordReg, "Password123!");
//        actions.clickWithTimeout(registerPageSel.reCaptcha);
        actions.clickWithTimeout(registerPageSel.registerBtn);
//        // Verify alert text
//        Selenide.switchTo().alert()
//                .shouldHave(text("User Register Successfully."));
//        // Accept alert
//        Selenide.switchTo().alert().accept();
    }
}
