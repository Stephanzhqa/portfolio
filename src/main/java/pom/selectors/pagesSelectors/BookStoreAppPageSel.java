package pom.selectors.pagesSelectors;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class BookStoreAppPageSel {

    // Left menu main locators
    public final SelenideElement mainBookStoreLeftPanel = $x("//span[@class='text' and text()='Book Store']");
    public final SelenideElement loginLeftPanel = $x("//span[@class='text' and text()='login']");
    public final SelenideElement bookStoreLeftPanel = $x("//span[@class='text' and text()='login']");
    public final SelenideElement profileLeftPanel = $x("//span[@class='text' and text()='profile']");
    public final SelenideElement bookStoreAPILeftPanel = $x("//span[@class='text' and text()='Book Store API']");

}
