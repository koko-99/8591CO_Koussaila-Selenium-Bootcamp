package Tests;

import PageObjects.*;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCheckOut extends BasePage {

    @Test
    public void testCheckOutFunctionality() throws InterruptedException {
        HomePage homePage=new HomePage();
        SearchItemPage searchItemPage=homePage.searchItems();
        CustomizePage customizePage=searchItemPage.choosingItemsFromList();
        CartPage cartPage=customizePage.addToCart();
        CheckoutPage checkoutPage=cartPage.addToCartPageFlow();
        boolean match=checkoutPage.confirmCheckoutFunctionality();
        Assert.assertTrue(match);


    }


}
