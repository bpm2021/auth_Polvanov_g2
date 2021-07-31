package web;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.RegistrationPage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    private          Logger     logger     = Logger.getLogger(BaseTest.class);
    protected        Properties properties = new Properties();
    protected        WebDriver  driver;
    protected final  String     pathToChromeDriver = "chromedriver.exe";
    protected final  String     pathToregistrationPropersties = "src/main/resources/registration.properties";



    protected String EMAIL = createPropertiesObject().getProperty("email");
    protected String FIRST_NAME = createPropertiesObject().getProperty("FirstName");
    protected String LAST_NAME = createPropertiesObject().getProperty("lastName");
    protected String PASSWORD = createPropertiesObject().getProperty("passowrd");

    protected String BIRTH_DD = createPropertiesObject().getProperty("birthDD");
    protected String BIRTH_MM = createPropertiesObject().getProperty("birthMM");
    protected String BIRTH_YY = createPropertiesObject().getProperty("birthYY");
    protected String COMPANY_NAME = createPropertiesObject().getProperty("company");
    protected String ADDRES_NAME = createPropertiesObject().getProperty("addres");
    protected String CITY_NAME = createPropertiesObject().getProperty("city");
    protected String STATE_NAME = createPropertiesObject().getProperty("state");
    protected String ZIP_CODE = createPropertiesObject().getProperty("zipAddr");
    protected String COUNTRY_NAME = createPropertiesObject().getProperty("country");
    protected String MOBILE_NUMBER = createPropertiesObject().getProperty("MobNumber");
    protected String ALIAS_NAME = createPropertiesObject().getProperty("alias");




    protected Properties createPropertiesObject(){
        try{
            FileInputStream info = new FileInputStream(pathToregistrationPropersties);
            properties.load(info);
        }catch (Exception e){
            Assert.fail("Enable to load  properties");
        }
        return properties;
    }
    protected void setup(){
        System.setProperty("webdriver.chrome.driver",pathToChromeDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

}
