package Tests;

import PageObjectLibraries.HomePage;
import PageObjectLibraries.LandingPage;
import base.BasePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class LoginTest extends BasePage {

    public LoginTest(){
        PageFactory.initElements(driver, this);
    }

    @Test
    public void testLoginFunctionality() throws AWTException, InterruptedException {
        HomePage homePage=new HomePage();
        LandingPage landingPage=homePage.login();

        boolean match =landingPage.validateRegistrationAndLogin();
        Assert.assertTrue(match);
    }


}
