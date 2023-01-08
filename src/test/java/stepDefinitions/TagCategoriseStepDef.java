package stepDefinitions;

import static HooksPkg.Hooks.driver;
import Pages.MainPage;
import Pages.ProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagCategoriseStepDef {

    @When("click on selected categorise \"Digital downloads\"")
    public static void clickSelectedCategorise(){
        MainPage.chooseCategories(driver).click();
    }

    @Then("click on \"awesome\" tag")
    public static void clickOnSpecificTag(){
        ProductPage.selectSpecTag(driver).click();
    }

}
