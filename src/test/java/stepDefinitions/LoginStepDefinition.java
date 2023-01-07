package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import Pages.ClickChoose;
import Pages.InsertData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinition {
    static WebDriver driver=null ;

    @Given("user open browser")
    public static void openBrowser() throws InterruptedException {

        // Navigate to E-Commerce Website
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
    }
    @And("user navigate to login page")
    public static void navigateToLogin() throws InterruptedException {
        // Login steps
        Thread.sleep(5000);
        ClickChoose.login(driver).click();;
        Thread.sleep(4000);
    }
    @When("user enter valid email and password")
    public static void insertValidUsernamePwd() throws InterruptedException {
        // Login steps
        Thread.sleep(4000);
        InsertData.loginEmailinst(driver).sendKeys("testeng10@outlook.com");
        InsertData.loginPwdinst(driver).sendKeys("Ab@94#22");
    }
    @Then("user click on login button")
    public static void clickLoginButton() throws InterruptedException {
        // Login steps
        Thread.sleep(4000);
        ClickChoose.clickLoginButton(driver).click();
    }
//    @Then("user could login successfully")
//    public static void validateLoginSucc() throws InterruptedException {
//        // Login steps
//        Thread.sleep(4000);
//        String expectedResult = "Login Successfully";
//        String actualResult = driver.findElement(By.className("content")).getText();
//
//        Assert.assertEquals(actualResult.equals(expectedResult), true);
//    }


}
