package PageObjectLibraries;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DataReader;

import java.awt.*;
import java.awt.event.KeyEvent;

public class HomePage extends BasePage {

    public HomePage (){
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//*[@id='loginPanel']/p[2]/a")
    public WebElement registerLink;

    @FindBy(xpath = "//*[@id=\"loginPanel\"]/form/div[1]/input")
    public WebElement username;

    @FindBy(xpath ="//*[@id=\"loginPanel\"]/form/div[2]/input")
    public WebElement password;
    @FindBy(xpath = "//*[@id=\"loginPanel\"]/form/div[3]/input")
    public WebElement submitBtn;

    public RegistrationPage navigateToRegistrationPage(){
        clickOnElement(registerLink);
        return new RegistrationPage();


    }
    public LandingPage login() throws AWTException, InterruptedException {
        sendKeysToElement(username, DataReader.readData().getProperty("userName"));
        sendKeysToElement(password, DataReader.readData().getProperty("password"));
        clickOnElement(submitBtn);
        Robot robot=new Robot();
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);


        /*fillAuthAlert();*/
        return new LandingPage();
    }

    public boolean validateLogoutFunctionality(){
        boolean logoutConfirmation=isElementVisible(registerLink);
        return logoutConfirmation;
    }
    /*public void fillAuthAlert() throws AWTException {
        Robot robot=new Robot();
        //Type username
        robot.keyPress(KeyEvent.VK_K);
        robot.keyRelease(KeyEvent.VK_K);
        robot.keyPress(KeyEvent.VK_O);
        robot.keyRelease(KeyEvent.VK_O);
        //Press Tab
        robot.keyPress(KeyEvent.VK_TAB);
        //Type password
        robot.keyPress(KeyEvent.VK_K);
        robot.keyRelease(KeyEvent.VK_K);
        robot.keyPress(KeyEvent.VK_O);
        robot.keyRelease(KeyEvent.VK_O);
        //Press enter
        robot.keyPress(KeyEvent.VK_ENTER);


    }*/



}
