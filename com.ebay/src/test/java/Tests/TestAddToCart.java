package Tests;

import PageObjects.CustomizePage;
import PageObjects.HomePage;
import PageObjects.SearchItemPage;
import base.BasePage;
import org.testng.annotations.Test;

public class TestAddToCart extends BasePage {

    @Test
    public void addToCartFunctionality() throws InterruptedException {
        HomePage homePage=new HomePage();
        SearchItemPage searchItemPage=homePage.searchItems();
        CustomizePage customizePage=searchItemPage.choosingItemsFromList();
        customizePage.addToCart();




    }
}
