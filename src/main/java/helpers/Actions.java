package helpers;

import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Selenide.sleep;

public class Actions {
    public void click(SelenideElement element){
        //todo реализоваь ожидание перед кликом
        //todo реализовать обработку ошибки и дейсвтвие в случаях ее появления
        //todo реализовать проверку видимости перед кликом
        element.click();
    }

    public void clickWithTimeout(SelenideElement element){
        System.out.println("clicked with 5sec timeout");
        sleep(5000);
        click(element);
    }

    public void uploadFile (SelenideElement selenideElement, String fileName) {
        File file = new File(fileName);
        selenideElement.uploadFile(file);
    }
}
