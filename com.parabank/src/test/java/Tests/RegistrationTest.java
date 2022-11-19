package Tests;

import PageObjectLibraries.HomePage;
import PageObjectLibraries.LandingPage;
import PageObjectLibraries.RegistrationPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BasePage {

    @Test
    public void testRegistrationButton(){
        HomePage homePage= new HomePage();
        RegistrationPage registration=homePage.navigateToRegistrationPage();
        LandingPage landingPage=registration.fillRegistrationPage();
        boolean match=landingPage.validateRegistrationAndLogin();
        Assert.assertTrue(match);

    }







}
