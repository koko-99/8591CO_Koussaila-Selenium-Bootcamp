package PageObjectLibraries;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;

public class RegistrationWindow extends BasePage {

    public RegistrationWindow(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath ="//input[@id='signupFirstName']")
    public WebElement firstNameField;

    @FindBy(xpath = "//input[@id='signupLastName']")
    public WebElement lastNameField;

    @FindBy(xpath = "//input[@id='signupEmail']")
    public WebElement emailAddressField;

    @FindBy(css = "#rc-anchor-alert+input")
    public WebElement recaptchaSelector;

    @FindBy(xpath = "//button[@id='signupBtn']")
    public WebElement signupBtn;

    @FindBy(xpath = "//iframe[@title='reCAPTCHA']")
    public WebElement iframeSelector;

    @FindBy(xpath = "//*[@id='newPw']")
    public WebElement passwordField;

    @FindBy(xpath = "//*[@id='NewPasswordConfirm']")
    public WebElement confirmPasswordField;

    @FindBy(xpath = "//*[@id='iFrameResizer0']")
    public WebElement passwordIframe;

    @FindBy(xpath = "//*[@id='setNewPassword']")
    public WebElement setPasswordBtn;

    String pPassword=GenerateData.password();
    public LandingPage fillRegistrationWindow() throws InterruptedException {
        waitForElementToBeVisible(firstNameField);
     sendKeysToElement(firstNameField, GenerateData.firstName());
     sendKeysToElement(lastNameField,GenerateData.lastName());
     sendKeysToElement(emailAddressField,GenerateData.email());

     Thread.sleep(2000);
     switchToFrameByElement(iframeSelector);
     jsClickOnElement(recaptchaSelector);
     switchToParentFrame();
     clickOnElement(signupBtn);
     switchToFrameByElement(passwordIframe);
     sendKeysToElement(passwordField,pPassword);
     sendKeysToElement(confirmPasswordField,pPassword);
     clickOnElement(setPasswordBtn);
     switchToParentFrame();
     return new LandingPage();




    }

    /*public void dealWithScaptcha(){
        switchToFrameByElement(recaptchaSelector);
    }*/



}
