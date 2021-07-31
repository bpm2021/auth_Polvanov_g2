package web;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.RegistrationPage;


public class RegistratinTest  extends  BaseTest{

    RegistrationPage registrationPage;

    private String url = "http://automationpractice.com/index.php";

    @BeforeTest
    private void openRegistrationPage(){
        setup();
        registrationPage = new RegistrationPage(driver);
        registrationPage.openWebPage(url);
        registrationPage.cliclOnSignInButton();
    };


    @Test
    private void checkRegistrationForm(){
        registrationPage.inputEmailToField(EMAIL);
        registrationPage.creatAnAccountButton();
        registrationPage.inputFirstNameToField(FIRST_NAME);
        registrationPage.inputLastNameToField(LAST_NAME);
        registrationPage.resetEmailToField(EMAIL);
        registrationPage.inputPasswordToField(PASSWORD);
        registrationPage.selectBirthDate(BIRTH_DD, BIRTH_MM,BIRTH_YY);
        registrationPage.inputCopanyNameToField(COMPANY_NAME);
        registrationPage.inputAddresToField(ADDRES_NAME);
        registrationPage.inputCatyNameToField(CITY_NAME);
        registrationPage.selectStateName(STATE_NAME);
        registrationPage.insertZipCode(ZIP_CODE);
        registrationPage.inputMobileNumberToField(MOBILE_NUMBER);
        registrationPage.inputAliasToTheField(ALIAS_NAME);
        registrationPage.clickOnTheRegisteredButton();
        registrationPage.checkIfRegistrationWasSuccessful();
    }

    @AfterTest
    private void exit(){
        driver.quit();
    }
}
