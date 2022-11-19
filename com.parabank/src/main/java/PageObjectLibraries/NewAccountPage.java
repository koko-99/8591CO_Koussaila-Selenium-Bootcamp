package PageObjectLibraries;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class NewAccountPage extends BasePage {

    public NewAccountPage(){
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[1]/a")
    public WebElement newAccountOption;
    public void createNewAccount() throws AWTException, InterruptedException {
        HomePage homePage=new HomePage();
        homePage.login();
        clickOnElement(newAccountOption);


    }

}
