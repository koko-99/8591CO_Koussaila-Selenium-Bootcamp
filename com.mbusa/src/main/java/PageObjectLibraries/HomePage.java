package PageObjectLibraries;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DataReader;

public class HomePage extends BasePage {

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

   @FindBy(css = ".nav-profile__login.nav-profile__button.button.button_primary.button--wide")
   public WebElement loginBtn;

    @FindBy(xpath = "//button[@class='global-header__menu-l1-list-button global-header__menu-l1-list-button--icon-profile global-header__menu-l1-list-button-utility']")
    public WebElement myAccountBtn;

    @FindBy(css = "#username")
    public WebElement emailInputField;

    @FindBy(css = "#continue")
    public WebElement continueBtn;

    @FindBy(css = "#password")
    public WebElement passwordInputField;

    @FindBy(css = "#rememberMe")
    public WebElement stayLoggedInSwitchBtn;

    @FindBy(css = "#confirm")
    public WebElement passwordNextBtn;

    public LandingPage loginFunctionality() {
        clickOnElement(myAccountBtn);
        clickOnElement(loginBtn);
        /*Thread.sleep(2000);*/
        sendKeysToElement(emailInputField, DataReader.readData().getProperty("email"));
        clickOnElement(continueBtn);
        getVisibleElement(By.cssSelector("div[class='ui custom-ui segment'] div[class='ui column'] div h4[class='custom-ui header']"));
        sendKeysToElement(passwordInputField,DataReader.readData().getProperty("password"));
        //uncheck the stay logged in button
        jsClickOnElement(stayLoggedInSwitchBtn);
        clickOnElement(passwordNextBtn);
        return new LandingPage();






    }



}
