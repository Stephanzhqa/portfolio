package pom.selectors.pagesSelectors;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;


public class FormsPageSel {

public final SelenideElement titlePleaseSelect = $x("//div[text()='Please select an item from left to start practice.' ]");
public final SelenideElement leftMenuPracticeForm = $x("(//li[@id = 'item-0'])[2]");

//Student registration Form
public final SelenideElement titlePracticeForm = $x("//h5[text() ='Student Registration Form']");
public final SelenideElement inputFirstNameReg = $x("//input[@id = 'firstName']");
public final SelenideElement inputLastNameReg = $x("//input[@id = 'lastName']");
public final SelenideElement inputUserEmailReg = $x("//input[@id = 'userEmail']");
public final SelenideElement radioBtnMaleReg = $x("//label[@for='gender-radio-1']");
public final SelenideElement radioBtnFemaleReg = $x("//label[@for='gender-radio-2']");
public final SelenideElement radioBtnOtherReg = $x("//label[@for='gender-radio-3']");
public final SelenideElement inputUserNumberReg = $x("//input[@id = 'userNumber']");
public final SelenideElement inputDateOfBirthReg = $x("//input[@id = 'dateOfBirthInput']");
public final SelenideElement inputSubjectsContainerReg = $x("//div[@id = 'subjectsContainer']");
public final SelenideElement checkBoxSportReg = $x("//label[@for = 'hobbies-checkbox-1']");
public final SelenideElement checkBoxReadingReg = $x("//label[@for = 'hobbies-checkbox-2']");
public final SelenideElement checkBoxMusicReg = $x("//label[@for = 'hobbies-checkbox-3']");
public final SelenideElement uploadPictureReg = $x("//input[@id = 'uploadPicture']");
public final SelenideElement inputCurrentAddressReg = $x("//textarea[@id = 'currentAddress']");
public final SelenideElement selectStateReg = $x("//div[@id = 'state'] ");
public final SelenideElement selectCityReg = $x("//div[@id = 'city'] ");

public final SelenideElement btnSubmitReg = $x("//button[@id = 'submit']");
}
