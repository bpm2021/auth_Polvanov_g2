package DataProvider;

import com.github.javafaker.Faker;
import models.AccountBuilder;
import models.Currency;
import models.CurrencyBuilder;
import org.testng.annotations.DataProvider;

public class AccountDataProviderClass {
    protected static Faker faker = new Faker();

    @DataProvider(name = "account-provider")
    public static Object[][] dataProviderMethod() {
        return new Object[][]{{new AccountBuilder()
                .setEmail(faker.internet().emailAddress())
                .setGender("Mr.")
                .setFirstName(faker.name().firstName())
                .setLastName(faker.name().lastName())
                .setPassword("Qwerty!1234")
                .setBirthDay(1)
                .setBirthMonth(2)
                .setBirthYear(4)
                .setCompanyName("UPC")
                .setAddressName(faker.address().fullAddress())
                .setCityName(faker.address().city())
                .setStateName(1)
                .setZipCode("12345")
                .setCountryName(1)
                .setPhoneNumber("+380567345956")
                .setAlias("Some text").build()
        }};
    }

    @DataProvider(name = "currency-provider")
    public static Object[][] currencyProviderMethod() {return new Object[][]{
            {new Currency("1000", "USD", "НБУ")},
            {new Currency("2040", "EUR", "Укргазбанк")},
            {new Currency("3240", "PLN", "Пивденний")}};}
}