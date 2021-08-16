package Web;


import models.Account;

import org.testng.annotations.Test;
import BaseTest.BaseTest;
import DataProvider.AccountDataProviderClass;

public class RegistrationTest extends BaseTest {

    
    @Epic(value = "CurrencyExchange")
    @Story(value = "user can convert currency")
    @Description("test convert currency amount")
    @Issue("https://github.com/bpm2021/auth_Polvanov_g2")
    @TmsLink(value ="PLD-567")
    @Link(value ="link", url ="https://github.com/bpm2021/auth_Polvanov_g2")
    @Owner(value = "Bohdan")
    @Severity(value = SeverityLevel.CRITICAL)
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
