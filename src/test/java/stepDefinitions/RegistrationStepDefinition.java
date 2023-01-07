package stepDefinitions;

import Pages.ClickChoose;
import Pages.InsertData;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationStepDefinition {
    static WebDriver driver=null ;

    @Given("user open the browser and website")
    public static void openBrowser() throws InterruptedException {

        // Navigate to E-Commerce Website
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
    }
    @And("user navigate to register page")
    public static void navigateToRegisterPage() throws InterruptedException {
        Thread.sleep(5000);
        ClickChoose.resister(driver).click();
        Thread.sleep(4000);
    }


    @When("select gender, fill firstname and lastname")
    public static void fillGenderFNLS() throws InterruptedException {
        ClickChoose.gender(driver).click();
        InsertData.insertFrstName(driver).sendKeys("Abdulrahman");
        InsertData.insertLasName(driver).sendKeys("Amer");
    }

    @And("choose birthdate day, month, year")
    public static void chooseBirthDate() {
        ClickChoose.dayDropDown(driver);
        ClickChoose.monthDropDown(driver);
        ClickChoose.yearDropDown(driver);
    }

    @And("insert email, password and confirm password")
    public static void insertEmailPwConPw(){
        InsertData.email(driver).sendKeys("testeng10@outlook.com");
        InsertData.insertPwd(driver).sendKeys("Ab@94#22");
        InsertData.insertPwdConf(driver).sendKeys("Ab@94#22");
    }

    @And("click on register button")
    public static void clickRegButton(){
        ClickChoose.clickReg(driver).click();
    }

    @Then("successful register message appears")
    public static void confirmMessage() throws InterruptedException {

        Thread.sleep(4000);
        String expectedResult = "Your registration completed";
        String actualResult = driver.findElement(By.className("result")).getText();

        Assert.assertEquals(expectedResult, actualResult);
    }


}
