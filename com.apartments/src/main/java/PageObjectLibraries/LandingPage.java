package PageObjectLibraries;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DataReader;

public class LandingPage extends BasePage {
    public LandingPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id='username']/button/span")
    public WebElement usernameBtn;
    @FindBy(id = "headerSignOut")
    public WebElement signoutBtn;

    public void logoutFunctionality() throws InterruptedException {
        Thread.sleep(2000);
    hoverOverElement(usernameBtn);
    clickOnElement(usernameBtn);
    clickOnElement(signoutBtn);
    }

    @FindBy(id = "headerAddProperty")
    public WebElement addPropertyBtn;

    public AddPropertyPage addPropertiesFunctionality(){
        clickOnElement(addPropertyBtn);
        return new AddPropertyPage();

    }


}
