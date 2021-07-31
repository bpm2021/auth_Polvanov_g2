package pages;

import org.apache.http.util.Asserts;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class RegistrationPage  extends  BasePage {

    private static final Logger logger = Logger.getLogger(RegistrationPage.class);

    @FindBy(className = "login")
    private WebElement signInButton;

    @FindBy(id = "email_create")
    private WebElement insertEmail;

    @FindBy(xpath = "//button[@id='SubmitCreate']//span")
    private WebElement creatAnAccountButton;

    @FindBy(id = "customer_firstname")
    private  WebElement insertFirstName;

    @FindBy(id = "email")
    private WebElement resetEmail;

    @FindBy(id = "customer_lastname")
    private  WebElement insertLastName;

    @FindBy(id = "passwd")
    private WebElement insertPassword;

    @FindBy(xpath = "//select[@id='days']")
    private WebElement selectBirthDay;

    @FindBy(xpath = "//select[@id='months']")
    private WebElement selectBirthMonth;

    @FindBy(xpath = "//select[@id='years']")
    private WebElement selectBirthYear;

    @FindBy(id = "company")
    private WebElement insertCompanyName;

    @FindBy(xpath = "//p[4]/input")
    private WebElement insertAddres;

    @FindBy(id = "city")
    private  WebElement insertCity;

    @FindBy(id = "id_state")
    private  WebElement selectState;

    @FindBy(id = "postcode")
    private WebElement insertZIP;

    @FindBy(id = "id_country")
    private WebElement selectCountry;

    @FindBy(id = "phone_mobile")
    private WebElement insertPhoneNumber;

    @FindBy(id = "alias")
    private WebElement insertAlias;

    @FindBy(xpath = "//span[text()='Register']")
    private WebElement registeredButton;

    @FindBy(className = "info-account")
    private WebElement successfulRegisteredText;


    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Method openWebPage
     * @param URL
     * */

    public void openWebPage(String URL){
        try {
            openURL(URL);
            logger.info("Successful opened page!");
        }catch (Exception e) {
            logger.error("Unsuccessful opened page!");
            Assert.fail("Unsuccessful opened page!");
        }

    }

    /**
     *
     * Method cliclOnSignInButton
     * */

    public void cliclOnSignInButton(){
        try{
            signInButton.click();
            logger.info("Successful click on the button!");
        }catch (Exception e){
            logger.error("Enable to click on the button");
            Assert.fail("Enable to click on the button");
        }

    }

    /**
     *Method inputEmailToField
     *@param email
     * */

    public void inputEmailToField(String email){
        try{
            insertEmail.sendKeys(email);
            logger.info("Successful input the email to field!");
        }catch (Exception e){
            logger.error("Enable to input the email to field!");
            Assert.fail("Enable to input the email to field!");
        }
    }

    /**
     * Method creatAnAccountButton
     * */

    public void creatAnAccountButton(){
        try{
            creatAnAccountButton.click();
            logger.info("Successful clicked on the button!");
        }catch (Exception e){
            logger.error("Enable clicked on the button!");
            Assert.fail("Enable clicked on the button!");
        }
    }

    /**
     * Method inputFirstNameToField
     * @param FIRST_NAME
     */

    public void inputFirstNameToField(String FIRST_NAME){
        try{
            insertFirstName.sendKeys(FIRST_NAME);
            logger.info("Successful input the first name to field!");
        }catch (Exception e){
            logger.error("Enable to input the first name to field!");
            Assert.fail("Enable to input the first name to field!");
        }
    }

    /**
     * inputLastNameToField
     * @param LAST_NAME
     * */

    public void inputLastNameToField(String LAST_NAME){
        try{
            insertLastName.sendKeys(LAST_NAME);
            logger.info("Successful input the last name to field!");
        }catch (Exception e){
            logger.error("Enable to input the last name to field!");
            Assert.fail("Enable to input the last name to field!");
        }
    }

    /**
     *Method resetEmailToField
     *@param email
     * */

    public void resetEmailToField(String email){
        try{
            resetEmail.clear();
            resetEmail.sendKeys(email);
            logger.info("Successful reset the email to field!");
        }catch (Exception e){
            logger.error("Enable to reset the email to field!");
            Assert.fail("Enable to reset the email to field!");
        }
    }


    /**
     * Method inputPasswordToField
     * @param   PASSWORD
     * */

    public void inputPasswordToField(String PASSWORD){
        try{
            insertPassword.sendKeys(PASSWORD);
            logger.info("Successful input the password to field!");
        }catch (Exception e){
            logger.error("Enable to input the password to field!");
            Assert.fail("Enable to input the password to field!");
        }
    }

    /**
     * Method selectBirthDate
     * @param BIRTH_DD,
     * @param BIRTH_MM,
     * @param BIRTH_YY
     * */

    public void selectBirthDate(String BIRTH_DD, String BIRTH_MM, String BIRTH_YY){
        try {
            Select dd = new Select(selectBirthDay);
            dd.selectByIndex(Integer.parseInt(BIRTH_DD));

            Select mm = new Select(selectBirthMonth);
            mm.selectByIndex(Integer.parseInt(BIRTH_MM));

            Select yy = new Select(selectBirthYear);
            yy.selectByIndex(Integer.parseInt(BIRTH_YY));

            logger.info("Successful selected the birth date!");
        }catch (Exception e){;
            logger.error("Enable to selected the birth date!");
            Assert.fail("Enable to selected the birth date!");
        }
    }

    /**
     * Method inputCopanyNameToField
     * @param COMPANY_NAME
     * */

    public void inputCopanyNameToField(String COMPANY_NAME){
        try{
            insertCompanyName.sendKeys(COMPANY_NAME);
            logger.info("Successful input the company name to field!");
        }catch (Exception e){
            logger.error("Enable to input the company name to field!");
            Assert.fail("Enable to input the company name to field!");
        }
    }

    /**
     * Method inputAddresToField
     * @param ADDRRES_NAME
     * */

    public void inputAddresToField(String ADDRRES_NAME){
        try{
            insertAddres.sendKeys(ADDRRES_NAME);
            logger.info("Successful input the addres anme name to field!");
        }catch (Exception e){
            logger.error("Enable to input the addres anme to field!");
            Assert.fail("Enable to input the addres anme to field!");
        }
    }

    /**
     * Method inputCatyNameToField
     * @param CITY_NAME
     * */

    public void inputCatyNameToField(String CITY_NAME){
        try{
            insertCity.sendKeys(CITY_NAME);
            logger.info("Successful input the address name name to field!");
        }catch (Exception e){
            logger.error("Enable to input the address name to field!");
            Assert.fail("Enable to input the address name to field!");
        }
    }

    /**
     * Method selectStateName
     * @param STATE_NAME
     * */

    public void selectStateName(String STATE_NAME){
        try {
            Select ss = new Select(selectState);
            ss.selectByIndex(Integer.parseInt(STATE_NAME));
            logger.info("Successful selected the the state name!");
        }catch (Exception e){;
            logger.error("Enable to selected the the state name!");
            Assert.fail("Enable to selected the state name!");
        }
    }

    /**
     * method insertZipCode
     * @param ZIP_CODE
     * */

    public void insertZipCode(String ZIP_CODE){
        try{
            insertZIP.sendKeys(ZIP_CODE);
            logger.info("Successful input the zip code  to field!");
        }catch (Exception e){
            logger.error("Enable to input the zip code to field!");
            Assert.fail("Enable to input the zip code to field!");
        }
    }

    /**
     *Method selectCountryName
     * @param COUNTRY_NAME
     */

    public void selectCountryName(String COUNTRY_NAME){
        try {
            Select cc = new Select(selectCountry);
            cc.selectByIndex(Integer.parseInt(COUNTRY_NAME));
            logger.info("Successful selected the the country name!");
        }catch (Exception e){;
            logger.error("Enable to selected the the country name!");
            Assert.fail("Enable to selected the country name!");
        }
    }

    /**
     * Method inputMobileNumberToField
     * @param MOBILE_NUMBER
     * */

    public void inputMobileNumberToField(String MOBILE_NUMBER){
        try{
            insertPhoneNumber.sendKeys(MOBILE_NUMBER);
            logger.info("Successful input the phone number  to field!");
        }catch (Exception e){
            logger.error("Enable to input the phone number to field!");
            Assert.fail("Enable to input the phone number to field!");
        }
    }

    /**
     * Method inputAliasToTheField
     * @param ALIAS_NAME
     */

    public void inputAliasToTheField(String ALIAS_NAME){
        try{
            insertAlias.sendKeys(ALIAS_NAME);
            logger.info("Successful input the alias number  to field!");
        }catch (Exception e){
            logger.error("Enable to input the phone number to field!");
            Assert.fail("Enable to input the alias number to field!");
        }
    }

    /**
     * Method clickOnTheRegisteredButton
     */

    public void clickOnTheRegisteredButton(){
        try{
            registeredButton.click();
            logger.info("Successful clicked!");
        }catch (Exception e){
            logger.error("Enable to click!");
            Assert.fail("Enable to click!");
        }
    }

    /**
     * Method checkIfRegistrationWasSuccessful
     */

    public void checkIfRegistrationWasSuccessful(){
        try{
            Assert.assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.", successfulRegisteredText.getText());
            logger.info("Successful created account!");
        }catch (Exception e){
            logger.error("Enable to create account!");
            e.printStackTrace();
            Assert.fail("Enable to create account!");
        }
    }
}
