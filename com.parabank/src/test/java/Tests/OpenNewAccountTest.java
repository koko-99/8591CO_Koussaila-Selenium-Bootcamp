package Tests;

import PageObjectLibraries.HomePage;
import PageObjectLibraries.NewAccountPage;
import base.BasePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.awt.*;

public class OpenNewAccountTest extends BasePage {

    public OpenNewAccountTest(){
        PageFactory.initElements(driver, this);
    }

    @Test
    public void testNewAccountFunctionality() throws AWTException, InterruptedException {
        NewAccountPage newAccountPage=new NewAccountPage();
        newAccountPage.createNewAccount();



    }

}
