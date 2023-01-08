package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    // Click Methods
    public static WebElement login(WebDriver driver)
    {
        return driver.findElement(By.className("ico-login"));
    }
    public static WebElement clickLoginButton(WebDriver driver)
    {
        return driver.findElement(By.linkText("Log in"));
    }

    // Insert Methods
    public static WebElement loginEmailinst(WebDriver driver)
    {
        return driver.findElement(By.className("ico-login"));
    }
    public static WebElement loginPwdinst(WebDriver driver)
    {
        return driver.findElement(By.id("Password"));
    }
}
