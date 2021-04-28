import Helpers.TestSettings;

import PageObject.BasketPageHelpers;
import PageObject.MainPageHelpers;

import PageObject.SearchPageHelpers;

import org.junit.Assert;
import org.junit.Test;



public class start extends TestSettings {
    @Test
    public void RozetkaShop() {
        MainPageHelpers rozetka = new MainPageHelpers(driver);
        rozetka.goTo();
        implisityWaiter();
        rozetka.SearchTupe("Удочка");

        SearchPageHelpers search = new SearchPageHelpers(driver);

        waitForElementToBeClickable(search.WishList(1));
        search.WishList(3).click();
        waitForElementToBeClickable(search.WishList(2));
        search.WishList(2).click();


        driver.navigate().refresh();
        waitForElementToBeClickable(rozetka.Basket());
        Assert.assertEquals("2", rozetka.Basket().getText());
        System.out.println(rozetka.Basket().getText());
        rozetka.Basket().click();

        BasketPageHelpers basket = new BasketPageHelpers(driver);

        waitForElementToBeClickable(basket.AddMoreProduct());
        Assert.assertEquals(basket.AddTestPrice(),basket.TotalPrise().getText());
        basket.TotalPrise().isDisplayed();
        basket.AddMoreProduct().click();

        driver.navigate().refresh();
       rozetka.Basket().click();
        Assert.assertEquals(basket.AddTestPrice(),basket.TotalPrise().getText());




    }
}
