package Tests;

import PageObjectLibraries.HomePage;
import PageObjectLibraries.LandingPage;
import base.BasePage;
import org.testng.annotations.Test;

public class TestLogout1 extends BasePage {

    @Test
    public HomePage logout() throws InterruptedException {
        HomePage homePage=new HomePage();
        LandingPage landingPage=homePage.loginFunctionality();
        landingPage.logoutFunctionality();
        return new HomePage();
    }

}
