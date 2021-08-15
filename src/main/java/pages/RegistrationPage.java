package pages;


import models.Account;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static libs.WebDriverMethods.*;
import static libs.WebDriverMethods.selectValueFromScrollDownList;


public class RegistrationPage  extends  BasePage {

    private static final Logger logger = Logger.getLogger(RegistrationPage.class);


    @FindBy(xpath = "//label[normalize-space()='Mr.']//input[@name='id_gender']")
    private WebElement maleRadioButton;
    @FindBy(xpath = "//label[normalize-space()='Mrs.']//input[@name='id_gender']")
    private WebElement femaleRadioButton;

    @FindBy(id = "customer_firstname")
    private  WebElement firstName;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "customer_lastname")
    private  WebElement lastName;

    @FindBy(id = "passwd")
    private WebElement passwordField;

    @FindBy(xpath = "//select[@id='days']")
    private WebElement selectBirthDay;

    @FindBy(xpath = "//select[@id='months']")
    private WebElement selectBirthMonth;

    @FindBy(xpath = "//select[@id='years']")
    private WebElement selectBirthYear;

    @FindBy(id = "company")
    private WebElement companyNamefield;

    @FindBy(xpath = "//p[4]/input")
    private WebElement addresField;

    @FindBy(id = "city")
    private  WebElement cityField;

    @FindBy(id = "id_state")
    private  WebElement selectState;

    @FindBy(id = "postcode")
    private WebElement zipField;

    @FindBy(id = "id_country")
    private WebElement selectCountry;

    @FindBy(id = "phone_mobile")
    private WebElement phoneNumberField;

    @FindBy(id = "alias")
    private WebElement aliasField;

    @FindBy(xpath = "//span[text()='Register']")
    private WebElement registeredButton;

    @FindBy(className = "page-heading")
    private WebElement successfulRegisteredText;


    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void selectGender(String gender){
        if(gender.equals("Mr."))
            clickOnTheRadioButton(maleRadioButton);
        else
            clickOnTheRadioButton(femaleRadioButton);
    }

    public void inputFirstNameToField(String FIRST_NAME){ inputDateToTheField(firstName,FIRST_NAME);}

    public void inputLastNameToField(String LAST_NAME){inputDateToTheField(lastName,LAST_NAME);}

    public void resetAndInputEmailToField(String emailAddress){ clearTheField(email); inputDateToTheField(email, emailAddress);}

    public void inputPasswordToField(String password){inputDateToTheField(passwordField, password);}

    public void selectBirthDate(int BIRTH_DD, int BIRTH_MM, int BIRTH_YY){
        selectValueFromScrollDownList(selectBirthDay,BIRTH_DD);
        selectValueFromScrollDownList(selectBirthMonth,BIRTH_MM);
        selectValueFromScrollDownList(selectBirthYear,BIRTH_YY);
    }

    public void inputCompanyNameToField(String COMPANY_NAME){ inputDateToTheField(companyNamefield,COMPANY_NAME);}

    public void inputAddressToField(String ADDRESS_NAME){ inputDateToTheField(addresField,ADDRESS_NAME);}

    public void inputCityNameToField(String CITY_NAME){ inputDateToTheField(cityField,CITY_NAME);}

    public void selectStateName(int STATE_NAME){selectValueFromScrollDownList(selectState, STATE_NAME);}

    public void inputZipCode(String ZIP_CODE){ inputDateToTheField(zipField,ZIP_CODE);}

    public void selectCountryName(int COUNTRY_NAME){ selectValueFromScrollDownList(selectCountry, COUNTRY_NAME);}

    public void inputMobileNumberToField(String MOBILE_NUMBER){ inputDateToTheField(phoneNumberField, MOBILE_NUMBER);}

    public void inputAliasToTheField(String ALIAS_NAME){ inputDateToTheField(aliasField,ALIAS_NAME);}

    public void clickOnTheRegisteredButton(){ clickOnTheButton(registeredButton);}

    public void checkTextOnThePage(String text){ Assert.assertEquals(text, getTextOfElement(successfulRegisteredText));}

    public void createNewUser(Account userAccount){
        selectGender(userAccount.getGender());
        inputFirstNameToField(userAccount.getFirstName());
        inputLastNameToField(userAccount.getLastName());
        resetAndInputEmailToField(userAccount.getEmail());
        inputPasswordToField(userAccount.getPassword());
        selectBirthDate(userAccount.getBirthDay(), userAccount.getBirthMonth(), userAccount.getBirthYear());
        inputCompanyNameToField(userAccount.getCompanyName());
        inputAddressToField(userAccount.getAddressName());
        inputCityNameToField(userAccount.getCityName());
        selectStateName(userAccount.getStateName());
        inputZipCode(userAccount.getZipCode());
        selectCountryName(userAccount.getCountryName());
        inputMobileNumberToField(userAccount.getPhoneNumber());
        inputAliasToTheField(userAccount.getAlias());
        clickOnTheRegisteredButton();
    }
}
