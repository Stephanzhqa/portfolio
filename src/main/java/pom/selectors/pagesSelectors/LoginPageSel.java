package pom.selectors.pagesSelectors;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPageSel {

    //LoginPage selectors
    public final SelenideElement inputUserName = $x("//input[@id='userName']");
    public final SelenideElement inputPassword = $x("//input[@id='password']");
    public final SelenideElement buttonLogin = $x("//button[@id='login']");
    public final SelenideElement buttonNewUser = $x("//button[@id='login']");

}
