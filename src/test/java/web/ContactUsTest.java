package web;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.ContactUsPage;

public class ContactUsTest  extends  BaseTest{

    ContactUsPage contactUsPage;

    private String url = "http://automationpractice.com/index.php";

    @BeforeTest
    private void openContactUsPage(){
        setup();
        contactUsPage = new ContactUsPage(driver);
        contactUsPage.openWebPage(url);
        contactUsPage.clickOnTheContactButton();
    };



    @Test
    private void checkContactUsForm(){
        contactUsPage.selectSubjectHeadingField(HEADING_NAME);
        contactUsPage.inputEmailToField(EMAIL);
        contactUsPage.inputOrderReference(ORDER_NAME);
        contactUsPage.inputMessageToField(MESSAGE);
        contactUsPage.clickOnTheSendButton();
        contactUsPage.checkIfContactUsWasSuccessful();
    }

    @AfterTest
    private void exit(){
        driver.quit();
    }

}
