package Web;

import BaseTest.BaseTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.RegistrationPage;

public class UnseccessfulRegistration extends BaseTest {

    RegistrationPage registrationPage;

    private String url = "http://automationpractice.com/index.php";

    @BeforeTest
    private void openRegistrationPage(){

        registrationPage = new RegistrationPage(driver);
//        registrationPage.openWebPage(url);
//        registrationPage.cliclOnSignInButton();
    };


    @Test
    private void checkRegistrationForm(){
//        registrationPage.inputEmailToField(SECOND_EMAIl);
//        registrationPage.creatAnAccountButton();
//        registrationPage.inputFirstNameToField(FIRST_NAME);
//        registrationPage.inputLastNameToField(LAST_NAME);
////        registrationPage.resetEmailToField(EMAIL);
//        registrationPage.inputPasswordToField(PASSWORD);
//        registrationPage.inputCopanyNameToField(COMPANY_NAME);
//        registrationPage.inputAddresToField(ADDRES_NAME);
//        registrationPage.inputCatyNameToField(CITY_NAME);
//        registrationPage.insertZipCode(ZIP_CODE);
//        registrationPage.inputMobileNumberToField(MOBILE_NUMBER);
//        registrationPage.inputAliasToTheField(ALIAS_NAME);
//        registrationPage.clickOnTheRegisteredButton();
//        registrationPage.checkIfRegistrationWasUnSuccessful();
    }

    @AfterTest
    public void exit(){
        driver.quit();
    }
}
