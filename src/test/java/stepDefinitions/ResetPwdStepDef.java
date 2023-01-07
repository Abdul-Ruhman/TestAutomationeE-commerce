package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import Pages.ClickChoose;
import Pages.InsertData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ResetPwdStepDef {
    static WebDriver driver=null ;
    @Given("user open browser and website")
    public static void openBrowser() throws InterruptedException {

        // Navigate to E-Commerce Website
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

        Thread.sleep(6000);
    }

    @And("navigate to login page")
    public static void navigateLoginPage() throws InterruptedException {
        Thread.sleep(4000);
        ClickChoose.login(driver).click();;
    }

    @When("click on forget password")
    public static void clickForgetPassword(){
        ClickChoose.forgetPwd(driver).click();
    }

    @And("insert email")
    public static void insertEmail(){
        InsertData.emailForgetPwd(driver).sendKeys("testeng10@outlook.com");
    }

    @And("click on recover button")
    public static void clickRecoverButton(){
        ClickChoose.recoverButton(driver).click();
    }

    @Then("confirm send to mail message appears")
    public static void confirmMessage() throws InterruptedException {
        Thread.sleep(4000);
        String expectedResult = "Email with instructions has been sent to you.";
        String actualResult = driver.findElement(By.className("content")).getText();

        Assert.assertEquals(expectedResult, actualResult);
    }


}
