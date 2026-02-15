package helpers;

import com.codeborne.selenide.SelenideElement;

import java.io.File;
import java.time.Duration;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;

public class Actions {
    public void click(SelenideElement element){
        element.shouldBe(visible, Duration.ofSeconds(10))
                .shouldBe(enabled, Duration.ofSeconds(10))
                .click();
    }

    public void clickWithTimeout(SelenideElement element){
        System.out.println("clicked with explicit wait");
        click(element);
    }

    public void uploadFile (SelenideElement selenideElement, String fileName) {
        File file = new File(fileName);
        selenideElement.uploadFile(file);
    }

    public void setText(SelenideElement element, String text) {
        element.setValue(text);
    }

}
