package stepDefinitions;

import static HooksPkg.Hooks.driver;
import Pages.MainPage;
import Pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddWishlistStepDef {

    @When("click on chosen categorise")
    public static void clickCategorise(){
        MainPage.chooseCategories(driver).click();
    }

    @And("click on chosen product")
    public static void clickOnChosenProduct(){
        ProductPage.chooseProduct(driver).click();
    }

    @Then("click on add to wishlist icon to selected product")
    public static void clickAddWishlistProduct() throws InterruptedException {
        Thread.sleep(6000);
        ProductPage.clickWishCatBut(driver).click();
    }
}
