package stepDefinitions;

import Pages.ClickChoose;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagCategoriseStepDef {
    static WebDriver driver=null ;
    @Given("open the browser then website")
    public static void openBrowser() throws InterruptedException {

        // Navigate to E-Commerce Website
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

        Thread.sleep(6000);
    }

    @When("click on selected categorise \"Digital downloads\"")
    public static void clickSelectedCategorise(){
        ClickChoose.chooseCategories(driver).click();
    }

    @Then("click on \"awesome\" tag")
    public static void clickOnSpecificTag(){
        ClickChoose.selectSpecTag(driver).click();
    }

}
