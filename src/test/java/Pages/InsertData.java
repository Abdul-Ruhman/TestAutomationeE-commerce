package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InsertData {

    // Registation
    public static WebElement insertFrstName(WebDriver driver)
    {
        return driver.findElement(By.id("FirstName"));
    }
    public static WebElement insertLasName(WebDriver driver)
    {
        return driver.findElement(By.id("LastName"));
    }
    public static WebElement email(WebDriver driver)
    {
        return driver.findElement(By.id("Email"));
    }
    public static WebElement insertPwd(WebDriver driver)
    {
        return driver.findElement(By.id("Password"));
    }
    public static WebElement insertPwdConf(WebDriver driver)
    {
        return driver.findElement(By.id("ConfirmPassword"));
    }

    // Login

    public static WebElement loginEmailinst(WebDriver driver)
    {
        return driver.findElement(By.className("ico-login"));
    }
    public static WebElement loginPwdinst(WebDriver driver)
    {
        return driver.findElement(By.id("Password"));
    }

    // Forget password
    public static WebElement emailForgetPwd(WebDriver driver)
    {
        return driver.findElement(By.id("Email"));
    }

    // Search for product
    public static WebElement searchForProduct(WebDriver driver)
    {
        return driver.findElement(By.id("small-searchterms"));
    }



}
