package pom.selectors.pagesSelectors;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class RegisterPageSel {
    //New user page selectors
    public final SelenideElement inputFirstNameReg = $("input[placeholder='First Name']");
    public final SelenideElement inputLastNameReg = $x("//input[@id='lastname']");
    public final SelenideElement inputUserNameReg = $x("//input[@id='userName']");
    public final SelenideElement inputPasswordReg = $x("//input[@id='password']");
//    public final SelenideElement reCaptcha = $x("//span[@id='recaptcha-anchor']");
    public final SelenideElement registerBtn = $x("//button[@id='register']");
    public final SelenideElement backToLoginBtn = $x("//button[@id='gotologin']");
}
