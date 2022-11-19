package Tests;

import PageObjects.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

public class TestSignIn extends BasePage {

    @Test
    public void testSigninFunctionality(){
        HomePage homePage=new HomePage();
        homePage.signinFunctionality();
    }
}
