package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.apache.log4j.Logger;

public class BasePage {

    protected Logger    logger;
    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        logger = Logger.getLogger(getClass());
    }

    /**
     * Method openWebPage
     * @param URL
     * */

    protected  void openURL(String URL){
        try {
            driver.get(URL);
            logger.info("Successful opened page!");
        }catch (Exception e) {
            logger.error("Unsuccessful opened page!");
            Assert.fail("Unsuccessful opened page!");
        }
    }
}
