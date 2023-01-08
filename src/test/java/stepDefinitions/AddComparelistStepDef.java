package stepDefinitions;

import static HooksPkg.Hooks.driver;
import Pages.MainPage;
import Pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddComparelistStepDef {

    @When("click on specific categorise")
    public static void clickCategorise(){
        MainPage.chooseCategories(driver).click();
    }

    @And("click on specific product")
    public static void clickOnChosenProduct(){
        ProductPage.chooseProduct(driver).click();
    }

    @Then("click on add to compare list icon to selected product")
    public static void clickAddComparelistProduct() throws InterruptedException {
        Thread.sleep(6000);
        ProductPage.addToComparelist(driver).click();
    }

}
