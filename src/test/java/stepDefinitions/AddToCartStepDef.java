package stepDefinitions;

import Pages.ClickChoose;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartStepDef {
    static WebDriver driver=null ;
    @Given("Open browser and website")
    public static void openBrowser() throws InterruptedException {

        // Navigate to E-Commerce Website
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

        Thread.sleep(6000);
    }

    @When("clicking on selected categorise")
    public static void clickCategorise(){
        ClickChoose.chooseCategories(driver).click();
    }

    @And("clicking on selected product")
    public static void clickOnSelectedProduct(){
        ClickChoose.chooseProductAddCart(driver).click();
    }

    @Then("click on add to cart to selected product")
    public static void clickAddCartToProduct() throws InterruptedException {
        Thread.sleep(6000);
        ClickChoose.addToCart(driver).click();
    }


}
