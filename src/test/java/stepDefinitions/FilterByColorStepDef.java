package stepDefinitions;

import Pages.ClickChoose;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilterByColorStepDef {
    static WebDriver driver=null ;
    @Given("open browser and the website")
    public static void openBrowser() throws InterruptedException {

        // Navigate to E-Commerce Website
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

        Thread.sleep(6000);
    }

    @When("hover on Apparel and click on Shoes")
    public static void clickCategorise() {
        ClickChoose.hoverClickShoesProduct(driver);
    }

    @Then("filter by color")
    public static void filterByColor() throws InterruptedException {
            Thread.sleep(4000);
            ClickChoose.filterByColorGray(driver).click();
    }
}
