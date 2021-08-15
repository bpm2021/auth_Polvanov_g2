package Web;


import BaseTest.BaseTest;
import DataProvider.AccountDataProviderClass;
import models.Currency;
import models.CurrencyBuilder;
import org.testng.annotations.Test;


public class CurrencyExchangeTest extends BaseTest {

    @Test(dataProvider  = "currency-provider", dataProviderClass = AccountDataProviderClass.class)
    private void checkCurrencyConvert(Currency newCurrency){
        currencyExchangePage.openWebPage(currency_url);
        currencyExchangePage.convertCurrency(newCurrency);
    }
}
