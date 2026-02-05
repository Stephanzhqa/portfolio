package pom.pages;

import helpers.Actions;
import helpers.Assertions;
import pom.selectors.pagesSelectors.FormsPageSel;
import pom.selectors.pagesSelectors.HomePageSel;
import pom.selectors.thruSelectors.Header;
import pom.selectors.thruSelectors.Footer;

public class PracticeFormPage {

    private final Actions actions = new Actions();
    private final Assertions assertions = new Assertions();
    private final FormsPageSel formsPageSel = new FormsPageSel();
    private final HomePageSel homePageSel = new HomePageSel();
    private final Header header = new Header();
    private final Footer footer = new Footer();


    public void openFormsPage() {
        actions.clickWithTimeout(homePageSel.formsCard);
    }

    public void mainFormsElementsIsDisplayed() {
        assertions.isVisible(formsPageSel.leftMenuPracticeForm);
        assertions.isVisible(formsPageSel.titlePleaseSelect);
        assertions.isVisible(header.pageTitle);
        assertions.isVisible(footer.allRightsReserved);
    }

    public void openPracticeFormPage() {
        actions.clickWithTimeout(formsPageSel.leftMenuPracticeForm);
    }

    public void mainElementsRegFormIsDisplayed(){
        assertions.isVisible(formsPageSel.titlePracticeForm);

        assertions.isVisible(formsPageSel.inputFirstNameReg);
        assertions.isVisible(formsPageSel.inputLastNameReg);
        assertions.isVisible(formsPageSel.inputUserEmailReg);
        assertions.isVisible(formsPageSel.radioBtnMaleReg);
        assertions.isVisible(formsPageSel.radioBtnFemaleReg);
        assertions.isVisible(formsPageSel.radioBtnOtherReg);
        assertions.isVisible(formsPageSel.inputUserNumberReg);
        assertions.isVisible(formsPageSel.inputDateOfBirthReg);
        assertions.isVisible(formsPageSel.inputSubjectsContainerReg);
        assertions.isVisible(formsPageSel.checkBoxSportReg);
        assertions.isVisible(formsPageSel.checkBoxReadingReg);
        assertions.isVisible(formsPageSel.checkBoxMusicReg);
        assertions.isVisible(formsPageSel.uploadPictureReg);
        assertions.isVisible(formsPageSel.inputCurrentAddressReg);
        assertions.isVisible(formsPageSel.selectStateReg);
        assertions.isVisible(formsPageSel.selectCityReg);
        assertions.isVisible(formsPageSel.btnSubmitReg);

        assertions.isVisible(header.pageTitle);
        assertions.isVisible(footer.allRightsReserved);
    }

    public void uploadPictureFile(){
        actions.uploadFile(formsPageSel.uploadPictureReg, "2025-08-30 11.11.21.jpg");

    }

    public void fillOutRequiredFields(
            String firstName, String lastName, String userEmail, String userNumber) {

        actions.click(formsPageSel.inputFirstNameReg);
        actions.setText(formsPageSel.inputFirstNameReg, firstName);

        actions.click(formsPageSel.inputLastNameReg);
        actions.setText(formsPageSel.inputLastNameReg, lastName);

        actions.click(formsPageSel.inputUserEmailReg);
        actions.setText(formsPageSel.inputUserEmailReg, userEmail);

        actions.click(formsPageSel.radioBtnMaleReg);

        actions.click(formsPageSel.inputUserNumberReg);
        actions.setText(formsPageSel.inputUserNumberReg, userNumber);

//        actions.click(formsPageSel.inputDateOfBirthReg);
//        actions.click(formsPageSel.inputSubjectsContainerReg);
//        actions.click(formsPageSel.checkBoxSportReg);
//        actions.click(formsPageSel.checkBoxReadingReg);
//        actions.click(formsPageSel.checkBoxMusicReg);
//        actions.uploadFile(formsPageSel.uploadPictureReg, "2025-08-30 11.11.21.jpg");
//        actions.setText(formsPageSel.inputCurrentAddressReg, currentAddress);
//        actions.click(formsPageSel.selectStateReg);
//        actions.click(formsPageSel.selectCityReg);
//        actions.click(formsPageSel.btnSubmitReg);
    }
}
