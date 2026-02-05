package pom.pages;

import helpers.Actions;
import helpers.Assertions;
import pom.selectors.pagesSelectors.BookStoreAppPageSel;
import pom.selectors.pagesSelectors.HomePageSel;
import pom.selectors.thruSelectors.Header;
import pom.selectors.thruSelectors.Footer;

public class BookStoreAppPage {

    private final Actions actions = new Actions();
    private final Assertions assertions = new Assertions();
    private final HomePageSel homePageSel = new HomePageSel();
    private final BookStoreAppPageSel bookStoreAppPageSel = new BookStoreAppPageSel();
    private final Header header = new Header();
    private final Footer footer = new Footer();


    public void openBookStoreAppPage() {
        actions.clickWithTimeout(homePageSel.bookStoreAppCard);
    }

    public void mainPanelBookStoreAppIsDisplayed() {
        assertions.isVisible(bookStoreAppPageSel.loginLeftPanel);
        assertions.isVisible(bookStoreAppPageSel.bookStoreLeftPanel);
        assertions.isVisible(bookStoreAppPageSel.profileLeftPanel);
        assertions.isVisible(bookStoreAppPageSel.bookStoreAPILeftPanel);
    }

    public void thruElementsIsDisplayed() {
        assertions.isVisible(header.pageTitle);
        assertions.isVisible(footer.allRightsReserved);
    }

}
