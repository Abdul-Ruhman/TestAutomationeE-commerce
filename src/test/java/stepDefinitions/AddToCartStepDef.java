package stepDefinitions;

import static HooksPkg.Hooks.driver;
import Pages.MainPage;
import Pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartStepDef {

    @When("clicking on selected categorise")
    public static void clickCategorise(){
        MainPage.chooseCategories(driver).click();
    }

    @And("clicking on selected product")
    public static void clickOnSelectedProduct(){
        ProductPage.chooseProduct(driver).click();
    }

    @Then("click on add to cart to selected product")
    public static void clickAddCartToProduct() throws InterruptedException {
        Thread.sleep(6000);
        ProductPage.addToCart(driver).click();
    }

}
