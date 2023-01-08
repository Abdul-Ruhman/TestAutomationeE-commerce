package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    public static WebElement acceptTearms(WebDriver driver)
    {
        return driver.findElement(By.id("termsofservice"));
    }

    public static WebElement clickCheckOut(WebDriver driver)
    {
        return driver.findElement(By.id("checkout"));
    }
}
