package Helpers;


import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestSettings {
public WebDriver driver;
    public void waitForElementToBeClickable(WebElement element){
        new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(element));
    }

    public void implisityWaiter(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }



@Before



    public void setUp() {

    System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();

}
//    @After
//            public void close(){
//        driver.quit();
//}


}
