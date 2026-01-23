package pom.selectors.thruSelectors;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ButtonLogin {

    public final SelenideElement buttonLogin = $x("//button[@id='login']");
}
