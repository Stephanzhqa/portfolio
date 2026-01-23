package pom.selectors.thruSelectors;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Header {
    public final SelenideElement pageTitle = $x("//a[@href='https://demoqa.com']");

}
