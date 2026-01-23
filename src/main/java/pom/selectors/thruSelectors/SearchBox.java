package pom.selectors.thruSelectors;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SearchBox {

    public final SelenideElement searchBox = $x("//input[@id='searchBox']");

}
