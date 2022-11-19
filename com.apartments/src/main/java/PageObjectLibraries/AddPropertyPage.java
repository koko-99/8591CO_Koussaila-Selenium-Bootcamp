package PageObjectLibraries;

import base.BasePage;
import org.apache.commons.math3.analysis.function.Add;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DataReader;

import java.util.List;

public class AddPropertyPage extends BasePage {
    public AddPropertyPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "iframeAddProperty")
    public WebElement addPropertyFrame;
    @FindBy(xpath = "//input[@id='cpid1-address']")
    public WebElement address;
    @FindBy(css = "#mat-autocomplete-0 > mat-option")
    public List<WebElement> addressesList;
    @FindBy(xpath = "//mat-select[@id='cpid1-propertyType']")
    public WebElement selectBtn;
    @FindBy(css = "#cpid1-propertyType-panel")
    public WebElement propertyTypeSelection;
    @FindBy(css = "#cpid1-propertyType-panel > mat-option")
    List<WebElement> propertyType;

    public void addProperty() {
        waitForElementToBeVisible(addPropertyFrame);
        switchToFrameByElement(addPropertyFrame);
        sendKeysToElement(address, DataReader.readData().getProperty("address"));
        waitForElementToBeVisible(addressesList.get(3));
        clickOnElement(addressesList.get(3));
        clickOnElement(selectBtn);
        clickOnElement(propertyType.get(1));
    }


}
