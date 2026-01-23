package pom.pages;

import helpers.Assertions;
import pom.selectors.pagesSelectors.HomePageSel;
import pom.selectors.thruSelectors.Footer;


public class HomePage {

    private final Assertions assertions = new Assertions();
    private final HomePageSel homePageSel = new HomePageSel();
    private final Footer footer = new Footer();

    public void mainCardsShouldBeDisplayed() {

        assertions.isVisible(homePageSel.elementsCard);
        assertions.isVisible(homePageSel.formsCard);
        assertions.isVisible(homePageSel.alertsFrameWindowsCard);
        assertions.isVisible(homePageSel.widgetsCard);
        assertions.isVisible(homePageSel.interactionsCard);
        assertions.isVisible(homePageSel.bookStoreAppCard);

        assertions.isVisible(footer.allRightsReserved);
    }
}
