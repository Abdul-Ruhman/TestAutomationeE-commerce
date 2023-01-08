package stepDefinitions;

import HooksPkg.Hooks;
import Pages.LoginPage;
import Pages.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class LoginStepDefinition {

    public static WebDriver driver = Hooks.driver;

    @And("user navigate to login page")
    public static void navigateToLogin() throws InterruptedException {
        // Login steps
        Thread.sleep(5000);
        MainPage.login(driver).click();
        Thread.sleep(4000);
    }
    @When("user enter valid email and password")
    public static void insertValidUsernamePwd() throws InterruptedException {
        // Login steps
        Thread.sleep(4000);
        LoginPage.loginEmailinst(driver).sendKeys("testeng10@outlook.com");
        LoginPage.loginPwdinst(driver).sendKeys("Ab@94#22");
    }
    @Then("user click on login button")
    public static void clickLoginButton() throws InterruptedException {
        // Login steps
        Thread.sleep(4000);
        LoginPage.clickLoginButton(driver).click();
    }

}
