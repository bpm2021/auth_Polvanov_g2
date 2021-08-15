package pages;

import libs.WebDriverMethods;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static libs.WebDriverMethods.*;


public class SignInPage extends  BasePage {

    public SignInPage(WebDriver driver) { super(driver); }

    @FindBy(className = "login")
    private WebElement signInButton;

    @FindBy(id = "email_create")
    private WebElement emailField;

    @FindBy(xpath = "//button[@id='SubmitCreate']//span")
    private WebElement createAccountButton;

    public void openWebPage(String URL){ openURL(URL);}

    public void clickOnSignInButton(){ clickOnTheButton(signInButton);}

    public void insertEmailToField(String email){inputDateToTheField(emailField,email);}

    public void clickOnCreateAccountButton(){clickOnTheButton(createAccountButton);}
}
