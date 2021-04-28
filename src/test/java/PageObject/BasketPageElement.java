package PageObject;

import Helpers.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasketPageElement extends DriverHolder {
    public BasketPageElement(WebDriver driver){
        super(driver);
    }
    public WebElement AddMoreProduct(){
        return driver.findElement(By.xpath("(//button[@class='button button_color_white button_size_medium cart-counter__button'])[2]"));
    }
    public WebElement Prise(){
        return driver.findElement(By.xpath("(//div[@class='cart-product__coast ng-star-inserted'])[1]"));
    }
    public WebElement Prise2(){
        return driver.findElement(By.xpath("(//div[@class='cart-product__coast ng-star-inserted'])[2]"));
    }
    public WebElement TotalPrise(){
        return driver.findElement(By.xpath("(//div[@class='cart-receipt__sum-price']/span)[1]"));
    }


}
