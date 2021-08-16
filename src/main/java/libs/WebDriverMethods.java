package libs;

import io.qameta.allure.Step;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriverMethods {

    private static Logger logger = Logger.getLogger(WebDriverMethods.class);

    /**
     * Method clickOnTheButton
     * @param buttonElement
     * */
    @Step("Click on the button")
    public static void clickOnTheButton(WebElement buttonElement){
        try{
            buttonElement.click();
            logger.info("Successful clicked on the button!");
        }catch (Exception e){
            logger.info("Enable to click on the button!");
            logger.info(e);
            Assert.fail("Enable to click on the button!");
        }
    }

    /***
     * Method inputDateToTheField
     * @param fieldElement
     * @param textElement
     */
    @Step("Input data to the field {textElement}")
    public static void inputDateToTheField(WebElement fieldElement, String textElement){
        try{
            fieldElement.sendKeys(textElement);
            logger.info("Successful input to the field - " + textElement);
        }catch (Exception e){
            logger.info("Enable to input to the field");
            logger.info(e);
            Assert.fail("Enable to input to the field");
        }
    }

    /**
     * Method getWebSiteTitle
     * @return title
     */

    @Step("get title of page")
    public static String getWebSiteTitle(WebDriver driver){
        String title = null;
        try{
            title = driver.getTitle();
            logger.info("Page title is " + title);
        }catch (Exception e){
            logger.info("Enable to take a Title");
            logger.info(e);
            Assert.fail("Enable to take a Title");
        }
        return title;
    }

    /**
     * Method getTextOfElement
     * @param pageElement
     * @return text
     */

    @Step("get testx of element")
    public static String getTextOfElement(WebElement pageElement){
        String text = null;
        try{
            text = pageElement.getText();
            logger.info("Text of element is " + text);
        }catch (Exception e){
            logger.info("Enable to take a Text");
            logger.info(e);
            Assert.fail("Enable to take a Text");
        }
        return text;
    }

    /**
     * Method clickOnTheRadioButton
     * @param radioElement
     */
    @Step("cick on the Radio Button")
    public static void clickOnTheRadioButton(WebElement radioElement){
        try{
            radioElement.click();
            logger.info("Successful clicked on the radio button!");
        }catch (Exception e){
            logger.info("Enable to click on the radio button!");
            logger.info(e);
            Assert.fail("Enable to click on the radio button!");
        }
    }

    /**
     * Method selectValueFromScrollDownList
     * @param scrollDownListElement
     * @param indexOfElement
     */

    @Step("Select value from scroll down list")
    public static void selectValueFromScrollDownList(WebElement scrollDownListElement, int indexOfElement){
        try {
            Select scrollElement = new Select(scrollDownListElement);
            scrollElement.selectByIndex(indexOfElement);
            logger.info("Successful selected element in scroll down list!");
        }catch (Exception e){;
            logger.error("Enable to selected element in scroll down list!");
            logger.info(e);
            Assert.fail("Enable to selected element in scroll down list!");
        }
    }

    /**
     * Method clearTheField
     * @param fieldElement
     */

    @Step("Clear the field")
    public static void clearTheField(WebElement fieldElement){
        try {
            fieldElement.clear();
            logger.info("Successful cleaned the field!");
        }catch (Exception e){;
            logger.error("Enable to clean the field!");
            logger.info(e);
            Assert.fail("Enable to clean the field!");
        }
    }

    /**
     * Method selectTextFromScrollDownList
     * @param scrollDownListElement
     * @param textOfElement
     */

    @Step("Select text from scroll down list")
    public static void selectTextFromScrollDownList(WebElement scrollDownListElement, String textOfElement){
        try {
            Select scrollElement = new Select(scrollDownListElement);
            scrollElement.selectByVisibleText(textOfElement);
            logger.info("Successful selected element in scroll down list!");
        }catch (Exception e){;
            logger.error("Enable to selected element in scroll down list!");
            logger.info(e);
            Assert.fail("Enable to selected element in scroll down list!");
        }
    }

}
