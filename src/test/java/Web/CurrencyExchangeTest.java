package Web;


import BaseTest.BaseTest;
import DataProvider.AccountDataProviderClass;
import io.qameta.allure.*;
import models.Currency;
import models.CurrencyBuilder;
import org.testng.annotations.Test;


public class CurrencyExchangeTest extends BaseTest {

    @Epic(value = "CurrencyExchange")
    @Story(value = "user can convert currency")
    @Description("test convert currency amount")
    @Issue("https://github.com/bpm2021/auth_Polvanov_g2")
    @TmsLink(value ="PLD-567")
    @Link(value ="link", url ="https://github.com/bpm2021/auth_Polvanov_g2")
    @Owner(value = "Bohdan")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test(dataProvider  = "currency-provider", dataProviderClass = AccountDataProviderClass.class)
    private void checkCurrencyConvert(Currency newCurrency){
        currencyExchangePage.openWebPage(currency_url);
        currencyExchangePage.convertCurrency(newCurrency);
    }
}
