package Tests;

import PageObjects.HomePage;

import PageObjects.SearchItemPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchFunctionality extends BasePage {

    @Test
    public void searchForElement(){
        HomePage homePage=new HomePage();
        SearchItemPage searchItemPage=homePage.searchItems();
        boolean match=searchItemPage.validateSearch();
        Assert.assertTrue(match);



    }




}
