package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgetPasswordPage {
    public static WebElement forgetPwd(WebDriver driver)
    {
        return driver.findElement(By.linkText("Forgot password?"));
    }
    public static WebElement emailForgetPwd(WebDriver driver)
    {
        return driver.findElement(By.id("Email"));
    }

    public static WebElement recoverButton(WebDriver driver)
    {
        return driver.findElement(By.name("send-email"));
    }


}
