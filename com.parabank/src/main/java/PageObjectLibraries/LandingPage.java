package PageObjectLibraries;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BasePage {

    public LandingPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[8]/a")
    public WebElement logoutBtn;

    public boolean validateRegistrationAndLogin(){
        boolean confirmation=isElementVisible(logoutBtn);
        return confirmation;
    }
    public void logout(){
       clickOnElement(logoutBtn);

    }






}
