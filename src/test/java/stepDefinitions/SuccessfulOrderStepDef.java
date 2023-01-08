package stepDefinitions;

import Pages.CartPage;
import static HooksPkg.Hooks.driver;
import Pages.MainPage;
import Pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SuccessfulOrderStepDef {

    @When("choose and click on selected categorise")
    public static void clickCategorise(){
        MainPage.chooseCategories(driver).click();
    }

    @And("choose and click on selected product")
    public static void clickOnSelectedProduct(){
        ProductPage.chooseProduct(driver).click();
    }

    @And("choose and click on add to cart to selected product")
    public static void clickAddCartToProduct(){
        ProductPage.addToCart(driver).click();
    }

    @And("click on shopping cart upper page")
    public static void clickShoppingCart(){
        MainPage.clickShoppingCart(driver).click();
    }

    @And("click on checkbox to agree terms")
    public static void checkOnAgreeTermsBox(){
        CartPage.acceptTearms(driver).click();
    }

    @Then("click on checkout button")
    public static void clickOnCheckout(){
        CartPage.clickCheckOut(driver).click();
    }
}
