package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthorizationPage extends BasePage{
    private static final Logger logger = Logger.getLogger(RegistrationPage.class);

    public AuthorizationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "login")
    private WebElement signInButton;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "passwd")
    private WebElement passworfField;

    @FindBy(id = "SubmitLogin")
    private WebElement signInField;

    @FindBy(xpath = "//div[@id='center_column']//p[1]")
    private WebElement successfulAutorisationText;

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
     * Method openWebPage
     * @param URL
     * */

    public void openWebPage(String URL){
        try {
            openURL(URL);
            logger.info("Successful opened page!");
        }catch (Exception e) {
            logger.error("Unsuccessful opened page!");
            e.printStackTrace();
            Assert.fail("Unsuccessful opened page!");
        }

    }

    /**
     *Method inputEmailToField
     *@param EMAIL
     * */

    public void inputEmailToField(String EMAIL){
        try{
            emailField.sendKeys(EMAIL);
            logger.info("Successful input the email to field!");
        }catch (Exception e){
            logger.error("Enable to input the email to field!");
            e.printStackTrace();
            Assert.fail("Enable to input the email to field!");
        }
    }

    /**
     * Method inputPasswordToField
     * @param   PASSWORD
     * */

    public void inputPasswordToField(String PASSWORD){
        try{
            passworfField.sendKeys(PASSWORD);
            logger.info("Successful input the password to field!");
        }catch (Exception e){
            logger.error("Enable to input the password to field!");
            Assert.fail("Enable to input the password to field!");
        }
    }

    /**
     * Method clickOnTheSighInButton
     */

    public void clickOnTheSighInButton(){
        try{
            signInField.click();
            logger.info("Successful clicked!");
        }catch (Exception e){
            logger.error("Enable to click!");
            Assert.fail("Enable to click!");
        }
    }

    /**
     * Method checkIfAutorisationWasSuccessful
     */

    public void checkIfAutorisationWasSuccessful(){
        try{
            Assert.assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.", successfulAutorisationText.getText());
            logger.info("Successful sign in account!");
        }catch (Exception e){
            logger.error("Enable to sign in account!");
            e.printStackTrace();
            Assert.fail("Enable to sign in account!");
        }
    }


}
