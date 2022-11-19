package Tests;

import PageObjectLibraries.HomePage;
import PageObjectLibraries.LandingPage;
import PageObjectLibraries.RegistrationWindow;
import base.BasePage;
import org.testng.annotations.Test;

public class TestSearch extends BasePage {

    @Test
    public void testSearchFunctionality() throws InterruptedException {
        HomePage homePage=new HomePage();
        homePage.searchFunctionality();

    }
}
