package pom.selectors.pagesSelectors;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SearchPageSel {

    public final SelenideElement inputSearchBox = $x("//input[@id='searchBox']");
    public final SelenideElement searchTableContent = $x("//div[@class = 'rt-table']");
    public final SelenideElement searchPagination = $x("//div[@class = 'pagination-bottom']");
    public final SelenideElement searchLoginBtn = $x("//button[@id='login']");
    public final SelenideElement searchResult = $x("//div[contains(text(), 'Eric Elliott')]");
}
