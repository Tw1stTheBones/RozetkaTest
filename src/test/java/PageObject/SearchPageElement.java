package PageObject;

import Helpers.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPageElement extends DriverHolder {
    public SearchPageElement(WebDriver driver){
        super(driver);
    }
    public WebElement WishList( int qty){
        return driver.findElements(By.xpath("(//div[@class='goods-tile__price price--red ng-star-inserted']/app-buy-button/button)")).get(qty);
    }

}
