package pageObjectModelTest.FilterFelderTest;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageObjectModel.FilterFelder.FilterReporter;
import pageObjectModelTest.login.LoginPageTest;
import webdriver.Driver;
import org.junit.Assert;

public class FilterReporterTest extends  Driver {

    WebDriver driver;
    LoginPageTest loginPageTest = new LoginPageTest();
    FilterReporter filter = new FilterReporter();

    @Test
    public void clickFilterFelderReporter() throws Throwable {
        loginPageTest.login_Website();
        filter.btnEintrageAnzeigen();
        filter.clickbtnReporter();
        filter.typebtnReporterId();
        //filter.choseReporter();
        filter.clickbtnfiltersearch();
        filter.clickbtnzurucksetzen();

    }
    @After
    public void closeconnection(){
        quitDriver();
    }
}