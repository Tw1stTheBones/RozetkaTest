package PageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BasketPageHelpers extends BasketPageElement {
    public BasketPageHelpers(WebDriver driver){super(driver);}

    public int TestPrice(){
        WebElement testPrice = Prise();
        String str =testPrice.getText().replaceAll("[^0-9]", "");
        int a = Integer.parseInt(str);
        return a;
    }
    public int TestPrice2(){
        WebElement testPrice2 = Prise2();
        String str2 =testPrice2.getText().replaceAll("[^0-9]", "");
        int  b = Integer.parseInt(str2.trim());

        return b;


    }
    public String AddTestPrice(){
        int test = TestPrice2();
        int te = TestPrice();
        int a = test+te;
        String tests = new String(String.valueOf(a));
        return tests;
    }




}
