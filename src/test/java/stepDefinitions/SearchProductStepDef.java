package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import Pages.ClickChoose;
import Pages.InsertData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchProductStepDef {
    static WebDriver driver=null ;
    @Given("Open browser then website")
    public static void openBrowser() throws InterruptedException {

        // Navigate to E-Commerce Website
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

        Thread.sleep(6000);
    }
    @When("write product in search box")
    public static void writeClickSearchBut(){
        InsertData.searchForProduct(driver).sendKeys("Apple");
    }

    @Then("click search button")
    public static void validateProductAppear() {
        ClickChoose.clickSearchButton(driver).click();
    }

}
