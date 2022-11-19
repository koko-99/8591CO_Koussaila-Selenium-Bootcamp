package PageObjects;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage {
    public CartPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[normalize-space()='Go to checkout']")
    public WebElement goToCheckOutBtn;
    @FindBy(xpath = "//button[@id='gxo-btn']")
    public WebElement guestBtn;
    @FindBy(css = "#gh-minicart-hover > div > a.gh-eb-li-a.gh-rvi-menu.gh-cart-count-1")
    public WebElement checkoutBtn;
    @FindBy(css = "#mainContent > form > div.vim.x-buybox > div > div.x-buybox__cta-section > ul > li:nth-child(2) > div > a")
    public WebElement viewInCartBtn;

    public CheckoutPage addToCartPageFlow() throws InterruptedException {
       clickOnElement(checkoutBtn);
       clickOnElement(goToCheckOutBtn);
        clickOnElement(guestBtn);
        return new CheckoutPage();
    }

    /*public boolean confirmAddToCart(){
        isElementVisible()
    }*/

}
