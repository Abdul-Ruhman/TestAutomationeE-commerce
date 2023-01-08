package stepDefinitions;

import HooksPkg.Hooks;
import Pages.ForgetPasswordPage;
import Pages.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ResetPwdStepDef {

    public static WebDriver driver = Hooks.driver;
    @When("navigate to login page")
    public static void navigateToLogin() throws InterruptedException {
        // Login steps
        Thread.sleep(5000);
        MainPage.login(driver).click();
        Thread.sleep(4000);
    }

    @And("click on forget password")
    public static void clickForgetPassword(){
        ForgetPasswordPage.forgetPwd(driver).click();
    }

    @And("insert email")
    public static void insertEmail(){
        ForgetPasswordPage.emailForgetPwd(driver).sendKeys("testeng10@outlook.com");
    }

    @And("click on recover button")
    public static void clickRecoverButton(){
        ForgetPasswordPage.recoverButton(driver).click();
    }

    @Then("confirm send to mail message appears")
    public static void confirmMessage() throws InterruptedException {
        Thread.sleep(4000);
        String expectedResult = "Email with instructions has been sent to you.";
        String actualResult = driver.findElement(By.className("content")).getText();

        Assert.assertEquals(expectedResult, actualResult);
    }


}
