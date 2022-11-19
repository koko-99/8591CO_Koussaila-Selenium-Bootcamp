package PageObjectLibraries;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DataReader;

public class HomePage extends BasePage {

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"headerLoginSection\"]/a[2]")
    public WebElement signUpBt;


    public RegistrationWindow navigateToRegistrationPage(){
        clickOnElement(signUpBt);
        return new RegistrationWindow();
    }
    @FindBy(id = "quickSearchLookup")
    WebElement searchInputField;
    @FindBy(xpath = "//a[@title='Search apartments for rent']")
    WebElement searchBtn;
    public void searchFunctionality() {
        clearSendKeysToElement(searchInputField,DataReader.readData().getProperty("address"));
        jsClickOnElement(searchBtn);

    }

}
