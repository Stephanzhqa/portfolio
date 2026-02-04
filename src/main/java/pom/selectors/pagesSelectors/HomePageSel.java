package pom.selectors.pagesSelectors;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class HomePageSel {

    public final SelenideElement elementsCard = $x("//h5[text() ='Elements']");
    public final SelenideElement formsCard = $x("//h5[text() ='Forms']");
    public final SelenideElement alertsFrameWindowsCard = $x("//h5[text() ='Alerts, Frame & Windows']");
    public final SelenideElement widgetsCard = $x("//h5[text() ='Widgets']");
    public final SelenideElement interactionsCard = $x("//h5[text() ='Interactions']");
    public final SelenideElement bookStoreAppCard = $x("//h5[text()='Book Store Application']");
}
