package pom.pages;

import helpers.Actions;
import helpers.Assertions;
import pom.selectors.pagesSelectors.SearchPageSel;
import pom.selectors.thruSelectors.Footer;
import pom.selectors.thruSelectors.Header;

public class SearchPage {

    private final Actions actions = new Actions();
    private final Assertions assertions = new Assertions();
    private final SearchPageSel searchPageSel = new SearchPageSel();
    private final pom.selectors.thruSelectors.Header Header = new Header();
    private final pom.selectors.thruSelectors.Footer Footer = new Footer();


    public void mainElementsSearchIsDisplayed() {
        assertions.isVisible(searchPageSel.inputSearchBox);
        assertions.isVisible(searchPageSel.searchTableContent);
        assertions.isVisible(searchPageSel.searchPagination);
        assertions.isVisible(searchPageSel.searchLoginBtn);

        assertions.isVisible(Header.pageTitle);
        assertions.isVisible(Footer.allRightsReserved);
    }

    public void successfulSearchBook () {
        actions.click(searchPageSel.inputSearchBox);
        actions.setText(searchPageSel.inputSearchBox, "Eric");
        assertions.isVisible(searchPageSel.searchResult);
    }
}
