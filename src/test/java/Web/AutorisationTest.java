package Web;

import BaseTest.BaseTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AuthorizationPage;

public class AutorisationTest extends BaseTest {
    AuthorizationPage authorizationPage;

    private String url = "http://automationpractice.com/index.php";
//
//    @BeforeTest
//    private void openAuthorizationPage(){
//        authorizationPage = new AuthorizationPage(driver);
//        authorizationPage.openWebPage(url);
//        authorizationPage.cliclOnSignInButton();
//    };
//
//    @Test
//    private void checkAuthorizationPage(){
//        authorizationPage.inputEmailToField(EMAIL);
//        authorizationPage.inputPasswordToField(PASSWORD);
//        authorizationPage.clickOnTheSighInButton();
//        authorizationPage.checkIfAutorisationWasSuccessful();
//    }
//    @AfterTest
//    protected void exit(){
//        driver.quit();
//    }
}
