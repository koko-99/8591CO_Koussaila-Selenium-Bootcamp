package Tests;

import PageObjectLibraries.HomePage;
import PageObjectLibraries.RegistrationWindow;
import base.BasePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignupTest extends BasePage {
    public SignupTest(){
        PageFactory.initElements(driver,this);
    }

    @Test
    public void testSignupFunctionality() throws InterruptedException {
        HomePage homePage=new HomePage();
        RegistrationWindow registrationWindow=homePage.navigateToRegistrationPage();
        registrationWindow.fillRegistrationWindow();
    }
}
