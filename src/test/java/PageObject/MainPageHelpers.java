package PageObject;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPageHelpers extends MainPageElement {
    public MainPageHelpers(WebDriver driver){super(driver);}

    public void goTo(){
        driver.get("https://rozetka.com.ua/");
    }

    public void  SearchTupe(String search){
        WebElement SearchTupe = Search();
        SearchTupe.sendKeys(search, Keys.ENTER);
    }


}
