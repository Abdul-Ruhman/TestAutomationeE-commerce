package stepDefinitions;

import Pages.ClickChoose;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuccessfulOrderStepDef {
    static WebDriver driver=null ;

    @Given("opening browser and website")
    public static void openBrowser() throws InterruptedException {

        // Navigate to E-Commerce Website
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

        Thread.sleep(6000);
    }
    @When("choose and click on selected categorise")
    public static void clickCategorise(){
        ClickChoose.chooseCategories(driver).click();
    }

    @And("choose and click on selected product")
    public static void clickOnSelectedProduct(){
        ClickChoose.chooseProductAddCart(driver).click();
    }

    @And("choose and click on add to cart to selected product")
    public static void clickAddCartToProduct(){
        ClickChoose.addToCart(driver).click();
    }

    @And("click on shopping cart upper page")
    public static void clickShoppingCart(){
        ClickChoose.clickShoppingCart(driver).click();
    }

    @And("click on checkbox to agree terms")
    public static void checkOnAgreeTermsBox(){
        ClickChoose.acceptTearms(driver).click();
    }

    @Then("click on checkout button")
    public static void clickOnCheckout(){
        ClickChoose.clickCheckOut(driver).click();
    }

}
