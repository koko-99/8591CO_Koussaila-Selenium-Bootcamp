package Tests;

import PageObjectLibraries.HomePage;
import base.BasePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTest1 extends BasePage {




    @Test
    public void testLogin() {
        HomePage homePage=new HomePage();
        homePage.loginFunctionality();
    }
}
