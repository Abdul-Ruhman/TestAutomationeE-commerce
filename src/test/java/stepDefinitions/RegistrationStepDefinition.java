package stepDefinitions;

import static HooksPkg.Hooks.driver;
import HooksPkg.Hooks;
import Pages.MainPage;
import Pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegistrationStepDefinition {

    @When("user navigate to register page")
    public static void navigateToRegisterPage() {
        MainPage.resister(driver).click();
    }


    @And("select gender, fill firstname and lastname")
    public static void fillGenderFNLS(){
        RegistrationPage.gender(driver).click();
        RegistrationPage.insertFrstName(driver).sendKeys("Abdulrahman");
        RegistrationPage.insertLasName(driver).sendKeys("Amer");
    }

    @And("choose birthdate day, month, year")
    public static void chooseBirthDate() {
        RegistrationPage.dayDropDown(driver);
        RegistrationPage.monthDropDown(driver);
        RegistrationPage.yearDropDown(driver);
    }

    @And("insert email, password and confirm password")
    public static void insertEmailPwConPw(){
        RegistrationPage.email(driver).sendKeys("testeng10@outlook.com");
        RegistrationPage.insertPwd(driver).sendKeys("Ab@94#22");
        RegistrationPage.insertPwdConf(driver).sendKeys("Ab@94#22");
    }

    @And("click on register button")
    public static void clickRegButton(){
        RegistrationPage.clickReg(driver).click();
    }

    @Then("successful register message appears")
    public static void confirmMessage() throws InterruptedException {

        Thread.sleep(4000);
        String expectedResult = "Your registration completed";
        String actualResult = driver.findElement(By.className("result")).getText();

        Assert.assertEquals(expectedResult, actualResult);
    }

}
