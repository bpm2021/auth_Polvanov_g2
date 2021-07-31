package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage extends BasePage{

    private static final Logger logger = Logger.getLogger(RegistrationPage.class);

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[text()='Contact us']")
    private WebElement contactUsButton;

    @FindBy(id ="id_contact")
    private WebElement subjectHeadingField;

    @FindBy(xpath = "//input[@data-validate='isEmail']")
    private WebElement emailField;

    @FindBy(id ="id_order")
    private WebElement orderReferenceField;

    @FindBy(id = "message")
    private WebElement messageField;

    @FindBy(xpath = "//span[text()='Send']")
    private WebElement sendButton;

    @FindBy(xpath = "//div[@id='center_column']//p[1]")
    private WebElement successfulTest;

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
     * Method clickOnTheContactButton
     */

    public void clickOnTheContactButton(){
        try {
            contactUsButton.click();
            logger.info("Successful clicked on the button");
        }catch (Exception e) {
            logger.error("Enable to click on the ContactUs button!");
            Assert.fail("Enable to click on the ContactUs button!");
            e.printStackTrace();
            e.printStackTrace();
        }
    }

    /**
     * Method selectSubjectHeadingField
     * @param HEADING_NAME
     */

    public void selectSubjectHeadingField(String HEADING_NAME){
        try {
            Select sh = new Select(subjectHeadingField);
            sh.selectByIndex(Integer.parseInt(HEADING_NAME));
            logger.info("Successful select Subject Heading!");
        }catch (Exception e) {
            logger.error("Enable to select Subject Heading!");
            e.printStackTrace();
            Assert.fail("Enable to select Subject Heading!");
            e.printStackTrace();
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
     *Method inputOrderReference
     *@param ORDER_NAME
     * */

    public void inputOrderReference(String ORDER_NAME){
        try{
            orderReferenceField.sendKeys(ORDER_NAME);
            logger.info("Successful input the order name to field!");
        }catch (Exception e){
            logger.error("Enable to input the order name to field!");
            e.printStackTrace();
            Assert.fail("Enable to input the order name to field!");
        }
    }

    /**
     * Method inputMessageToField
     * @param MESSAGE
     */

    public void inputMessageToField(String MESSAGE){
        try{
            messageField.sendKeys(MESSAGE);
            logger.info("Successful input the message to field!");
        }catch (Exception e){
            logger.error("Enable to input the message to field!");
            e.printStackTrace();
            Assert.fail("Enable to input the message to field!");
        }
    }

    /**
     * Method clickOnTheContactButton
     */

    public void clickOnTheSendButton(){
        try {
            sendButton.click();
            logger.info("Successful clicked on the Send button");
        }catch (Exception e) {
            logger.error("Enable to click on the Send button!");
            Assert.fail("Enable to click on the Send button!");
            e.printStackTrace();
        }
    }

    /**
     * Method checkIfContactUsWasSuccessful
     */

    public void checkIfContactUsWasSuccessful(){
        try{
            Assert.assertEquals("Your message has been successfully sent to our team.", successfulTest.getText());
            logger.info("Successful contacted us!");
        }catch (Exception e){
            logger.error("Enable to contacted us!");
            e.printStackTrace();
            Assert.fail("Enable to contacted us!");
        }
    }

}
