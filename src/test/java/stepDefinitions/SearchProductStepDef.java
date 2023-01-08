package stepDefinitions;

import static HooksPkg.Hooks.driver;
import HooksPkg.Hooks;
import Pages.MainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class SearchProductStepDef {

    @When("write product in search box")
    public static void writeClickSearchBut(){
        MainPage.searchForProduct(driver).sendKeys("Apple");
    }

    @Then("click search button")
    public static void validateProductAppear() {
        MainPage.clickSearchButton(driver).click();
    }
}
