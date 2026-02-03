package helpers;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;

public class Assertions {

    public void isVisible(SelenideElement element){
        element.shouldBe(visible);
    }

    public void shouldHaveText(){}
}
