package Tests;

import PageObjectLibraries.HomePage;
import PageObjectLibraries.LandingPage;
import base.BasePage;
import org.testng.annotations.Test;

public class TestFindADealer extends BasePage {


    @Test
    public void findADealerFunctionality() throws InterruptedException {
        HomePage homePage=new HomePage();
        LandingPage landingPage=homePage.loginFunctionality();
        landingPage.navigateToDealerMap();


    }
}
