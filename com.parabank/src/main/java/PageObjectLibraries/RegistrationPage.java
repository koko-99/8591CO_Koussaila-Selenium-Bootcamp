package PageObjectLibraries;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DataReader;
import utils.GenerateData;

public class RegistrationPage extends BasePage {

    public RegistrationPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "customer.firstName")
    public WebElement firstNameField;

    @FindBy(id = "customer.lastName")
    public WebElement lastNameField;

    @FindBy(id = "customer.address.street")
    public WebElement streetAddressField;

    @FindBy(id="customer.address.city")
    public WebElement cityField;

    @FindBy(id="customer.address.state")
    public WebElement stateField;

    @FindBy(id="customer.address.zipCode")
    public WebElement zipCodeField;

    @FindBy(id="customer.phoneNumber")
    public WebElement phoneNumberField;

    @FindBy(id="customer.ssn")
    public WebElement ssnField;

    @FindBy(id="customer.username")
    public WebElement userNameField;

    @FindBy(id="customer.password")
    public WebElement passwordField;

    @FindBy(id="repeatedPassword")
    public WebElement confirmPasswordField;

    @FindBy(xpath = "//input[@value='Register']")
    public WebElement submitButton;

    String userName="ko";/*GenerateData.firstName()+ "-" +GenerateData.lastName();*/
    String password="KO";/* GenerateData.password();*/
    public LandingPage fillRegistrationPage(){
        sendKeysToElement(firstNameField,GenerateData.firstName());
        sendKeysToElement(lastNameField,GenerateData.lastName());
        sendKeysToElement(streetAddressField,GenerateData.streetAddress());
        sendKeysToElement(cityField,GenerateData.city());
        sendKeysToElement(stateField,GenerateData.state());
        sendKeysToElement(zipCodeField,GenerateData.zipCode());
        sendKeysToElement(phoneNumberField,GenerateData.mobilePhone());
        sendKeysToElement(ssnField, DataReader.readData().getProperty("ssn"));
        sendKeysToElement(userNameField,userName);
        sendKeysToElement(passwordField,password);
        sendKeysToElement(confirmPasswordField,password);
        clickOnElement(submitButton);
        return new LandingPage();




    }


}
