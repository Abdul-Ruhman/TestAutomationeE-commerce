package stepDefinitions;

import Pages.MainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static HooksPkg.Hooks.driver;

public class SwitchCurrencyStepDef {

    @When("click on currency drop-list and choose Euro")
    public static void clickChooseCurrencyEU(){
        MainPage.selectCurrencyEU(driver);
    }

    @Then("click on currency drop-list and choose US Dollar")
    public static void clickChooseCurrencyUS(){
        MainPage.selectCurrencyUS(driver);
    }

}
