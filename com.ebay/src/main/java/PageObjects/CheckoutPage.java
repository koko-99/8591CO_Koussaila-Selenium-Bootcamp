package PageObjects;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends BasePage {
    public CheckoutPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "icon LOCK_INVERSE call-to-action--lock-icon")
    public WebElement confirmAndPay;

    public boolean confirmCheckoutFunctionality(){
        boolean saveAndPay=isElementVisible(confirmAndPay);
        return saveAndPay;

    }
}
