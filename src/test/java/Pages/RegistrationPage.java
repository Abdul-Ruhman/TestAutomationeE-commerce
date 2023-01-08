package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

    // Click & Select Methods
    public static WebElement gender(WebDriver driver)
    {
        return driver.findElement(By.id("gender-male"));
    }
    public static void dayDropDown(WebDriver driver)
    {
        WebElement dayDropDown = driver.findElement(By.name("DateOfBirthDay"));
        Select dayBirth = new Select(dayDropDown);
        dayBirth.selectByValue("2");
    }
    public static void monthDropDown(WebDriver driver)
    {
        WebElement monthDropDown = driver.findElement(By.name("DateOfBirthMonth"));
        Select monthBirth = new Select(monthDropDown);
        monthBirth.selectByValue("6");
    }
    public static void yearDropDown(WebDriver driver)
    {
        WebElement yearDropDown = driver.findElement(By.name("DateOfBirthYear"));
        Select yearBirth = new Select(yearDropDown);
        yearBirth.selectByValue("1994");
    }
    public static WebElement clickReg(WebDriver driver)
    {
        return driver.findElement(By.id("register-button"));
    }

    // Insert Data Methods

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

}
