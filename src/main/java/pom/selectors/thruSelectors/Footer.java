package pom.selectors.thruSelectors;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class Footer {

    public final SelenideElement allRightsReserved = $x("//span[contains(text(),'© 2013-2020 TOOLSQA.COM | ALL RIGHTS RESERVED.')]");
}
