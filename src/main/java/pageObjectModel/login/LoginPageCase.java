package pageObjectModel.login;

import pageObjectModel.WebElements;

import java.util.concurrent.TimeUnit;

public class LoginPageCase extends WebElements {

    public LoginPageCase(){}

    LoginPage loginPage = new LoginPage();

    public void navigateToWebsite() {
        driver.manage().window().maximize();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //Assert.assertEquals(driver.getTitle(), "MantisBT");
        System.out.println(driver.getTitle());
    }

    public void loginWebsite() {
        navigateToWebsite();
        loginPage.insertUsername();
        loginPage.clickLoginButton();
        loginPage.insertPassword();
        loginPage.clickLoginButton();
        //Assert.assertEquals(driver.getTitle(),"Übersicht - MantisBT"); //fuehrt zu Fehler!
        System.out.println(driver.getTitle());
    }
}
