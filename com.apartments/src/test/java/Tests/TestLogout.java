package Tests;

import PageObjectLibraries.HomePage;
import PageObjectLibraries.LandingPage;
import PageObjectLibraries.RegistrationWindow;
import base.BasePage;
import org.testng.annotations.Test;

public class TestLogout extends BasePage {

    @Test
    public void logoutTest() throws InterruptedException {
        HomePage homePage=new HomePage();
        RegistrationWindow registrationWindow=homePage.navigateToRegistrationPage();
        LandingPage landingPage=registrationWindow.fillRegistrationWindow();
        landingPage.logoutFunctionality();

    }
}
