package PageObject;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DataReader;
import utils.GenerateData;

import java.util.List;

public class HomePage extends BasePage {
    public HomePage (){
        PageFactory.initElements(driver,this);
    }


    @FindBy(className = "user")
    public WebElement profileSign;
    @FindBy(xpath = "//*[@id=\"global-user-trigger\"]")
    public List<WebElement> profileSignEle;
    @FindBy(css = "#global-user-trigger")
    public WebElement signinBtn;
    @FindBy(className = "btn-group btn-group-create-account ng-scope")
    public WebElement signupBtn;




    public void signupFunctionality() throws InterruptedException {
        hoverOverElement(profileSign);
        clickOnElement(signinBtn);
        clickOnElement(signupBtn);


    }

}
