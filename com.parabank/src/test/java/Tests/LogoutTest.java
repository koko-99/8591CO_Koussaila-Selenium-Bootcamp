package Tests;

import PageObjectLibraries.HomePage;
import PageObjectLibraries.LandingPage;
import PageObjectLibraries.RegistrationPage;
import base.BasePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BasePage {
     public LogoutTest(){
         PageFactory.initElements(driver,this);
     }
     @Test
    public void testLogoutFunctionality(){
         HomePage homePage=new HomePage();
         RegistrationPage registrationPage=homePage.navigateToRegistrationPage();
        LandingPage landingPage= registrationPage.fillRegistrationPage();
        landingPage.logout();
         boolean match=homePage.validateLogoutFunctionality();
         Assert.assertTrue(match);







     }
}
