package Tests;

import PageObjects.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

public class TestRegister extends BasePage {


    @Test
    public void testRegisterFunctionality(){
        HomePage homePage=new HomePage();
        homePage.registerFunctionality();
    }

}
