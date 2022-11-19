package Tests;

import PageObjects.CustomizePage;
import PageObjects.HomePage;

import PageObjects.SearchItemPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClickOnItemForList extends BasePage {

    @Test
    public void addItemToCart(){
        HomePage homePage=new HomePage();
        SearchItemPage searchItemPage=homePage.searchItems();
        CustomizePage customizePage=searchItemPage.choosingItemsFromList();
        /*boolean match=customizePage.validateAddToCart();
        Assert.assertTrue(match);*/







    }
}
