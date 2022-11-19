package PageObjects;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomizePage extends BasePage {
    public CustomizePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='qtyTextBox']")
    public WebElement quantityField;
    @FindBy(css = ".x-msku__label-text")
    public WebElement color;
    @FindBy(xpath = "//*[@id='x-msku__select-box-1000']")
    public WebElement colorOption;
    @FindBy(xpath = "//*[@id=\"mainContent\"]/form/div[1]/div[2]/div[2]/div/label/span[1]")
    public WebElement form;
    @FindBy(css = ".x-msku__select-box")
    public WebElement formOption;

    @FindBy(xpath = "//*[@id='mainContent']/form/div[2]/div/div[2]/ul/li[2]/div")
    public WebElement addToCartBtn;

    @FindBy(xpath = "//*[@id='mainContent']/form/div[2]/div/div[2]/ul/li[2]/div/div/div[2]/div[3]/div/div/div[1]/div/div/button")
    public WebElement closeAddToCartWindowBtn;


    public CartPage addToCart() throws InterruptedException {
        switchToTab();
       clearSendKeysToElement(quantityField,"2");
       if(isElementVisible(color)){
           selectFromDropdownByIndex(colorOption,2);

       }
       if(isElementVisible(form)){
        selectFromDropdownByIndex(formOption,1);}
      /* waitForElementToBeVisible(addToCartBtn);*/
       clickOnElement(addToCartBtn);
       clickOnElement(closeAddToCartWindowBtn);

       return new CartPage();
    }
    /*public boolean validateAddToCart() {
        boolean addToCartConfirmation = isElementVisible(addToCartBtn);
        return addToCartConfirmation;
    }*/
}
