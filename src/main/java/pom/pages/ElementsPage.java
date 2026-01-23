package pom.pages;

import helpers.Actions;
import helpers.Assertions;
import pom.selectors.pagesSelectors.ElementsPageSel;
import pom.selectors.pagesSelectors.HomePageSel;
import pom.selectors.thruSelectors.Header;
import pom.selectors.thruSelectors.Footer;

public class ElementsPage {

    private final Actions actions = new Actions();
    private final Assertions assertions = new Assertions();
    private final HomePageSel homePageSel = new HomePageSel();
    private final ElementsPageSel elementsPageSel = new ElementsPageSel();
    private final Header header = new Header();
    private final Footer footer = new Footer();


    public void openElementsPage() {

        actions.clickWithTimeout(homePageSel.elementsCard);
    }

    public void mainElementsElementsIsDisplayed() {

        assertions.isVisible(elementsPageSel.textBoxLeftPanel);
        assertions.isVisible(elementsPageSel.checkBoxLeftPanel);
        assertions.isVisible(elementsPageSel.radioButtonLeftPanel);
        assertions.isVisible(elementsPageSel.webTablesLeftPanel);
        assertions.isVisible(elementsPageSel.buttonsLeftPanel);
        assertions.isVisible(elementsPageSel.linksLeftPanel);
        assertions.isVisible(elementsPageSel.brokenLinksLeftPanel);
        assertions.isVisible(elementsPageSel.uploadDownloadLinksLeftPanel);
        assertions.isVisible(elementsPageSel.dynamicPropertiesLeftPanel);

        assertions.isVisible(header.pageTitle);
        assertions.isVisible(footer.allRightsReserved);
    }
}
