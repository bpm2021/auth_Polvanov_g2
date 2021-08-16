package BaseTest;

import com.github.javafaker.Faker;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import pages.CurrencyExchangePage;
import pages.RegistrationPage;
import pages.SignInPage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import libs.CustomListener;


@Listeners(CustomListener.class)
public class BaseTest {

    protected        Properties properties = new Properties();
    protected        Faker      faker      = new Faker();
    protected        WebDriver  driver;
    protected final  String     pathToChromeDriver  = "chromedriver.exe";
    protected final  String     pathToFirefoxDriver = "geckodriver.exe";


    protected String          url = "http://automationpractice.com/index.php";
    protected String currency_url = "https://finance.i.ua/converter/";
    protected SignInPage signInPage;
    protected RegistrationPage registrationPage;
    protected CurrencyExchangePage currencyExchangePage;


    @Parameters("browser")
    @BeforeClass(alwaysRun = true)
    public  void setUP(@Optional("chrome") String browser){
        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver",pathToChromeDriver);
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", pathToFirefoxDriver);
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        signInPage = new SignInPage(driver);
        registrationPage = new RegistrationPage(driver);
        currencyExchangePage = new CurrencyExchangePage(driver);
    };

    @AfterClass
    public void exit(){
        driver.quit();
    }

}
