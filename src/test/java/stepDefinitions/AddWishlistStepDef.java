package stepDefinitions;

import Pages.ClickChoose;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddWishlistStepDef {
    static WebDriver driver=null ;

    @Given("Open browser and the website")
    public static void openBrowser() throws InterruptedException {

        // Navigate to E-Commerce Website
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

        Thread.sleep(6000);
    }

    @When("click on chosen categorise")
    public static void clickCategorise(){
        ClickChoose.chooseCategories(driver).click();
    }

    @And("click on chosen product")
    public static void clickOnChosenProduct(){
        ClickChoose.chooseProductWishlist(driver).click();
    }

    @Then("click on add to wishlist icon to selected product")
    public static void clickAddWishlistProduct() throws InterruptedException {
        Thread.sleep(6000);
        ClickChoose.clickWishCatBut(driver).click();
    }
}
