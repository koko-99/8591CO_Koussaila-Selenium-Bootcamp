package PageObjects;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchItemPage extends BasePage {
    public SearchItemPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css=".s-item__info > a")
    public List<WebElement> resultList;
    @FindBy(xpath = "//button[normalize-space()='Save this search']")
    public WebElement saveThisSearchBtn;

    public CustomizePage choosingItemsFromList(){

       clickOnElement(resultList.get(2));
       return new CustomizePage();


    }
    public boolean validateSearch(){
        boolean saveSearch = isElementVisible(saveThisSearchBtn);
        return saveSearch;
    }


}
