package Tests;

import PageObject.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

public class TestSignup extends BasePage {

    @Test
    public void signupFunctionality() throws InterruptedException {
        HomePage homepage=new HomePage();
        homepage.signupFunctionality();
    }
}
