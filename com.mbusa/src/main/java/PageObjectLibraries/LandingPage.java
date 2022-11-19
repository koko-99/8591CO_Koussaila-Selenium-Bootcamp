package PageObjectLibraries;

import base.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LandingPage extends BasePage {
    public LandingPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//ul[@class = 'global-header__menu-l1-list global-header__menu-l1-list--secondary']/li/button")
    public List<WebElement> li;
    @FindBy(css = ".nav-profile__logout.nav-profile__link")
    public WebElement logoutBtn;

    @FindBy(xpath = "/html/body/div[1]/header/nav/ul/li[5]/div/div/ul/li[1]/section/div/div[1]/a[1]")
    public WebElement savedVehiclesBtn;

    @FindBy(css= "body > div:nth-child(2) > header:nth-child(1) > nav:nth-child(2) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > button:nth-child(1)")
    public WebElement inventoryBtn;

    @FindBy(className = "link link_in-text")
    public WebElement viewNewInventory;

    @FindBy(css = "//div[@class='content-loader__asset']//div[1]//div[1]//div[1]//div[1]//div[3]//div[1]//div[1]//button[1]")
    public WebElement saveBtn;

    @FindBy(xpath = "//button[normalize-space()='Shopping']")
    public WebElement shoppingBtn;

    @FindBy(css = "#ip-close")
    public WebElement popUpCloseButton;




    public void logoutFunctionality() throws InterruptedException {
        waitForElementToBeVisible(li.get(1));

        if(isElementVisible(popUpCloseButton)){
            clickOnElement(popUpCloseButton);
        }





        clickOnElement(li.get(1).findElement(By.xpath("")));
        /*clickOnElement(logoutBtn);*/

    }
    public void saveAndNavigateToSavedVehiclesPage() {
       /*String handleWindow= driver.getWindowHandle();
       driver.switchTo().window(handleWindow);*/

        isElementVisible(popUpCloseButton);
        clickOnElement(popUpCloseButton);
        clickOnElement(inventoryBtn);
        jsClickOnElement(inventoryBtn);
/*        clickOnElement(viewNewInventory);
        clickOnElement(saveBtn);
        clickOnElement(hiUsernameBtn);
        clickOnElement(savedVehiclesBtn);*/
    }

    @FindBy(css = ".global-header__menu-l1-list-button.global-header__menu-l1-list-button--icon-pin")
    public WebElement findADealerBtn;
    @FindBy(className = "global-header__menu-l1-list-button-label")
    public WebElement findElementClass;
    public void navigateToDealerMap() throws InterruptedException {

        if(isElementVisible(popUpCloseButton)){
            clickOnElement(popUpCloseButton);
        }

        waitForElementToBeVisible(findElementClass);
        jsClickOnElement(findADealerBtn);

    }






}
