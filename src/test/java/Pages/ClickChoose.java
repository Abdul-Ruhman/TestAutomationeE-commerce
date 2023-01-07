package Pages;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ClickChoose {

    // Registration
    public static WebElement resister(WebDriver driver)
    {
        return driver.findElement(By.className("ico-register"));
    }
    public static WebElement gender(WebDriver driver)
    {
        return driver.findElement(By.id("gender-male"));
    }
    public static void dayDropDown(WebDriver driver)
    {
        WebElement dayDropDown = driver.findElement(By.name("DateOfBirthDay"));
        Select dayBirth = new Select(dayDropDown);
        dayBirth.selectByValue("2");
    }
    public static void monthDropDown(WebDriver driver)
    {
        WebElement monthDropDown = driver.findElement(By.name("DateOfBirthMonth"));
        Select monthBirth = new Select(monthDropDown);
        monthBirth.selectByValue("6");
    }
    public static void yearDropDown(WebDriver driver)
    {
        WebElement yearDropDown = driver.findElement(By.name("DateOfBirthYear"));
        Select yearBirth = new Select(yearDropDown);
        yearBirth.selectByValue("1994");
    }
    public static WebElement clickReg(WebDriver driver)
    {
        return driver.findElement(By.id("register-button"));
    }

    // Login

    public static WebElement login(WebDriver driver)
    {
        return driver.findElement(By.className("ico-login"));
    }
    public static WebElement clickLoginButton(WebDriver driver)
    {
        return driver.findElement(By.linkText("Log in"));
    }

    // Forget Password

    public static WebElement forgetPwd(WebDriver driver)
    {
        return driver.findElement(By.linkText("Forgot password?"));
    }
    public static WebElement recoverButton(WebDriver driver)
    {
        return driver.findElement(By.name("send-email"));
    }

    // Search for product
    public static WebElement clickSearchButton(WebDriver driver)
    {
        return driver.findElement(By.linkText("Search"));
    }

    // Switch between currencies US-Euro
    public static void selectCurrencyUS(WebDriver driver)
    {
        WebElement selectCurrencyUS = driver.findElement(By.id("customerCurrency"));
        Select chooseCurrencyUS = new Select(selectCurrencyUS);
        chooseCurrencyUS.selectByVisibleText("US Dollar");
    }
    public static void selectCurrencyEU(WebDriver driver)
    {
        WebElement selectCurrencyEU = driver.findElement(By.id("customerCurrency"));
        Select chooseCurrencyEU = new Select(selectCurrencyEU);
        chooseCurrencyEU.selectByVisibleText("Euro");
    }

    // Choose and click Categories
    public static WebElement chooseCategories(WebDriver driver)
    {
        return driver.findElement(By.linkText("Digital downloads"));
    }

    // Filter by color
    public static WebElement filterByColorGray(WebDriver driver)
    {
        return driver.findElement(By.id("attribute-option-14"));
    }

    public static void hoverClickShoesProduct(WebDriver driver) {

        Actions mouseHover = new Actions(driver);

        WebElement mainCategorise = driver.findElement(By.xpath("//div[6]/div[2]/ul[1]/li[3]/a[@href='/apparel']"));
        mouseHover.moveToElement(mainCategorise).perform();

        WebElement subMainCategorise = driver.findElement(By.xpath("//div[6]/div[2]/ul[1]/li[3]/a[@href='/apparel']"));
        subMainCategorise.click();

    }

    // Add to cart
    public static WebElement addToCart(WebDriver driver)
    {
        return driver.findElement(By.id("add-to-cart-button-35"));
    }

    // Select different tag
    public static WebElement selectSpecTag(WebDriver driver)
    {
        return driver.findElement(By.linkText("awesome"));
    }

    // Add to wishlist
    public static WebElement chooseProductWishlist(WebDriver driver)
    {
        return driver.findElement(By.linkText("If You Wait (donation)"));
    }
    public static WebElement chooseProductAddCart(WebDriver driver)
    {
        return driver.findElement(By.linkText("If You Wait (donation)"));
    }
    public static WebElement chooseProductComparelist(WebDriver driver) {
        return driver.findElement(By.linkText("If You Wait (donation)"));
    }
    public static WebElement clickWishCatBut(WebDriver driver)
    {
        return driver.findElement(By.id("add-to-wishlist-button-35"));
    }


    // Add to compare
    public static WebElement addToComparelist(WebDriver driver)
    {
        return driver.findElement(By.xpath("//button[@class=\"button-2 add-to-compare-list-button\"]"));
    }

    // Create successful Order
    public static WebElement clickShoppingCart(WebDriver driver)
    {
        return driver.findElement(By.className("cart-label"));
    }
    public static WebElement acceptTearms(WebDriver driver)
    {
        return driver.findElement(By.id("termsofservice"));
    }

    public static WebElement clickCheckOut(WebDriver driver)
    {
        return driver.findElement(By.id("checkout"));
    }










}
