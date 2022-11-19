package PageObjects;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DataReader;

public class HomePage extends BasePage {

        public HomePage(){
            PageFactory.initElements(driver,this);
        }
        @FindBy(css = "a[href='https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F']")
        public WebElement registerBtn;
        public void registerFunctionality(){
            clickOnElement(registerBtn);
/////////////////////
        }

        @FindBy(css = "a[href='https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F']")
        public WebElement signinBtn;
        public void signinFunctionality(){
            clickOnElement(signinBtn);

        }
    @FindBy(css = "#gh-ac")
    public WebElement searchInputField;
    @FindBy(css = "#gh-btn")
    public WebElement searchBtn;
    @FindBy(css = "body > main:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > h2:nth-child(1) > span:nth-child(1)")
    public WebElement searchPageElement;


    public SearchItemPage searchItems() {
        sendKeysToElement(searchInputField, DataReader.readData().getProperty("searchforelement"));
        clickOnElement(searchBtn);
        return new SearchItemPage();
    }






    }



