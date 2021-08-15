package pages;

import models.Currency;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static libs.WebDriverMethods.inputDateToTheField;
import static libs.WebDriverMethods.selectTextFromScrollDownList;

public class CurrencyExchangePage extends BasePage {

    public CurrencyExchangePage(WebDriver driver) { super(driver); }

    @FindBy(id = "currency_amount")
    private WebElement amountField;

    @FindBy(id = "converter_currency")
    private WebElement currencyScrollDownList;

    @FindBy(id = "converter_bank")
    private WebElement bankScrollDownList;

    @FindBy(xpath = "//p[@id='UAH']//input[@id='currency_exchange']")
    private WebElement resultInUAH;


    public void openWebPage(String URL){ openURL(URL);}

    public void inputAmountToTheField(String amount){ inputDateToTheField(amountField,amount);}

    public void selectCurrency(String currency){ selectTextFromScrollDownList(currencyScrollDownList, currency);}

    public void selectCBank(String bank){ selectTextFromScrollDownList(bankScrollDownList, bank);}

    public void checkConvertCurrency(){
        Assert.assertNotEquals("0.0", resultInUAH.getAttribute("value"));
    }

    public void convertCurrency(Currency newCurrency){
        inputAmountToTheField(newCurrency.getAmount());
        selectCurrency(newCurrency.getCurrency());
        selectCBank(newCurrency.getBank());
        checkConvertCurrency();

    }
}