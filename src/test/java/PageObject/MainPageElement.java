package PageObject;

import Helpers.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPageElement extends DriverHolder {
    public MainPageElement(WebDriver driver){super(driver);}

    public WebElement Search(){
        return driver.findElement(By.xpath("//input[@name='search']"));

    }
    public WebElement Basket(){
        return driver.findElement(By.xpath("//span[@class='counter counter--green ng-star-inserted']"));
    }
}
