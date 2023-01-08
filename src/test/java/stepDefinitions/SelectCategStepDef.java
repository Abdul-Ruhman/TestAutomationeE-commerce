package stepDefinitions;

import static HooksPkg.Hooks.driver;
import Pages.MainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SelectCategStepDef {

    @When("click on selected categorise")
    public static void clickCategorise(){
        MainPage.chooseCategories(driver).click();
    }

    @Then("selected categorise page will open")
    public static void validateSelectedCatPageOpen() throws InterruptedException {
        Thread.sleep(4000);
        String expectedResult = "If You Wait (donation)";
        String actualResult = driver.findElement(By.className("product-title")).getText();

        Assert.assertEquals(expectedResult, actualResult);

    }
}
