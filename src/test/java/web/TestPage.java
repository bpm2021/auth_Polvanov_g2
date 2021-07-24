package web;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestPage extends BaseTest {


    @Test
    @Description(" Base test for Web page")
    private void test(){

        System.setProperty("webdriver.chrome.driver", pathToChromeDriver);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.navigate().to("https://ecconnect.com.ua/");

        String titelPage = driver.getTitle();

        Assert.assertEquals(titelPage,"Зручні онлайн платежі для вашого сайту або мобільного застосунку");

        Assert.assertEquals( driver.findElement(By.xpath("//a[contains(text(),\"Рішення\")]")).getText(),"Рішення");

        driver.navigate().to("https://www.xbox.com/en-ca/?source=lp");

        driver.findElement(By.xpath("//button[@id='search']")).click();
        driver.findElement(By.xpath("//input[@id='cli_shellHeaderSearchInput']")).sendKeys("Fallout 76" + Keys.ENTER);

        Assert.assertEquals("Fallout 76 | Xbox",driver.findElement(By.xpath("//a[contains(text(),'Fallout 76 | Xbox')]")).getText());

    }
}
