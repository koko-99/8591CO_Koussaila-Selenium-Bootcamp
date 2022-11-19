package Tests;

import PageObjectLibraries.AddPropertyPage;
import PageObjectLibraries.HomePage;
import PageObjectLibraries.LandingPage;
import PageObjectLibraries.RegistrationWindow;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestAddProperties extends BasePage {


@Test
public void addProperty() throws InterruptedException {
    HomePage homePage=new HomePage();
    RegistrationWindow registrationWindow=homePage.navigateToRegistrationPage();
    LandingPage landingPage=registrationWindow.fillRegistrationWindow();
    landingPage.addPropertiesFunctionality();
}

}
