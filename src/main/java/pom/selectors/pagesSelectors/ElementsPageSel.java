package pom.selectors.pagesSelectors;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ElementsPageSel {

    public final SelenideElement elementsLeftPanel= $x("//div[contains(text(),'Elements')]");

    public final SelenideElement textBoxLeftPanel= $x("//span[@class='text' and text()='Text Box']");
    public final SelenideElement checkBoxLeftPanel = $x("//span[@class='text' and text()='Check Box']");
    public final SelenideElement radioButtonLeftPanel = $x("//span[@class='text' and text()='Radio Button']");
    public final SelenideElement webTablesLeftPanel = $x("//span[@class='text' and text()='Web Tables']");
    public final SelenideElement buttonsLeftPanel = $x("//span[@class='text' and text()='Buttons']");
    public final SelenideElement linksLeftPanel = $x("//span[@class='text' and text()='Links']");
    public final SelenideElement brokenLinksLeftPanel = $x("//span[@class='text' and text()='Broken Links - Images']");
    public final SelenideElement uploadDownloadLinksLeftPanel = $x("//span[@class='text' and text()='Upload and Download']");
    public final SelenideElement dynamicPropertiesLeftPanel = $x("//span[@class='text' and text()='Dynamic Properties']");
}
