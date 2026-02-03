package config;

import static com.codeborne.selenide.Selenide.open;

public  class BasePage{
    public void openUrl(String url) {
        open(url);
    }
}
