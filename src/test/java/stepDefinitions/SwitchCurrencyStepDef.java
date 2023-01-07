package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import Pages.ClickChoose;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchCurrencyStepDef {
    static WebDriver driver=null ;

    @Given("Open browser, and website")
    public static void openBrowser() throws InterruptedException {

        // Navigate to E-Commerce Website
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

        Thread.sleep(6000);
    }

    @When("click on currency drop-list and choose Euro")
    public static void clickChooseCurrencyEU(){
        ClickChoose.selectCurrencyEU(driver);
    }

    @Then("click on currency drop-list and choose US Dollar")
    public static void clickChooseCurrencyUS(){
        ClickChoose.selectCurrencyUS(driver);
    }

}
