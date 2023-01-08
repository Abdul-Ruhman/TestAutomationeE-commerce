package stepDefinitions;

import Pages.ProductPage;
import static HooksPkg.Hooks.driver;
import Pages.MainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FilterByColorStepDef {

    @When("hover on Apparel and click on Shoes")
    public static void clickCategorise() throws InterruptedException {
        MainPage.hoverClickShoesProduct(driver);
        Thread.sleep(6000);
    }

    @Then("filter by color")
    public static void filterByColor(){
            ProductPage.filterByColorGray(driver).click();
    }
}
