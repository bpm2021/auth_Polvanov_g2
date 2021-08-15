package Web;


import models.Account;

import org.testng.annotations.Test;
import BaseTest.BaseTest;
import DataProvider.AccountDataProviderClass;

public class RegistrationTest extends BaseTest {

    @Test(dataProvider  = "account-provider", dataProviderClass = AccountDataProviderClass.class)
    private void checkRegistrationForm(Account userAccount){
        signInPage.openWebPage(url);
        signInPage.clickOnSignInButton();
        signInPage.insertEmailToField(userAccount.getEmail());
        signInPage.clickOnCreateAccountButton();
        registrationPage.createNewUser(userAccount);
        registrationPage.checkTextOnThePage("MY ACCOUNT");
    }
}
