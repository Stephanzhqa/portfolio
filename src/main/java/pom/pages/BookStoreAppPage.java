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
    private final HomePageSel HomePageSel = new HomePageSel();
    private final BookStoreAppPageSel BookStoreAppSel = new BookStoreAppPageSel();
    private final Header Header = new Header();
    private final Footer Footer = new Footer();


    public void openBookStoreAppPage() {
//        new HomePage().mainCardsShouldBeDisplayed();
//        assertions.isVisible(HomePageSel.bookStoreAppCard);
        actions.clickWithTimeout(HomePageSel.bookStoreAppCard);
    }

    public void mainPanelBookStoreAppIsDisplayed() {
        assertions.isVisible(BookStoreAppSel.mainBookStoreLeftPanel);
        assertions.isVisible(BookStoreAppSel.loginLeftPanel);
        assertions.isVisible(BookStoreAppSel.bookStoreLeftPanel);
        assertions.isVisible(BookStoreAppSel.profileLeftPanel);
        assertions.isVisible(BookStoreAppSel.bookStoreAPILeftPanel);
    }

    public void thruElementsIsDisplayed() {
        assertions.isVisible(Header.pageTitle);
        assertions.isVisible(Footer.allRightsReserved);
    }

}
