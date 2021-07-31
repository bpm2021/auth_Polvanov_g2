package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.apache.log4j.Logger;

public class BasePage {

    private Logger    logger;
    private WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        logger = Logger.getLogger(getClass());
    }

    protected  void openURL(String URL){
        driver.get(URL);
    }
}
