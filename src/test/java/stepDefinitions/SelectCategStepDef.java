package stepDefinitions;

import Pages.ClickChoose;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SelectCategStepDef {
    static WebDriver driver=null ;
    @Given("open browser, website")
    public static void openBrowser() throws InterruptedException {

        // Navigate to E-Commerce Website
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

        Thread.sleep(6000);
    }

    @When("click on selected categorise")
    public static void clickCategorise(){
        ClickChoose.chooseCategories(driver).click();
    }

    @Then("selected categorise page will open")
    public static void validateSelectedCatPageOpen() throws InterruptedException {
        Thread.sleep(4000);
        String expectedResult = "If You Wait (donation)";
        String actualResult = driver.findElement(By.className("product-title")).getText();

        Assert.assertEquals(expectedResult, actualResult);

    }

}
