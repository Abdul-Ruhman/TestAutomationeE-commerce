package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {

    // Login Button
    public static WebElement login(WebDriver driver)
    {
        return driver.findElement(By.className("ico-login"));
    }

    // Registration Button
    public static WebElement resister(WebDriver driver)
    {
        return driver.findElement(By.className("ico-register"));
    }

    // Switch Currency Methods
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

    // Search for product
    public static WebElement clickSearchButton(WebDriver driver)
    {
        return driver.findElement(By.linkText("Search"));
    }
    public static WebElement searchForProduct(WebDriver driver)
    {
        return driver.findElement(By.id("small-searchterms"));
    }

    // Click on Digital downloads Categorise

    public static WebElement chooseCategories(WebDriver driver)
    {
        return driver.findElement(By.linkText("Digital downloads"));
    }

    // Click on Shopping Cart
    public static WebElement clickShoppingCart(WebDriver driver)
    {
        return driver.findElement(By.className("cart-label"));
    }

    // Hover on Apparel and Click on Shoes
    public static void hoverClickShoesProduct(WebDriver driver) throws InterruptedException {


        Actions mouseHover = new Actions(driver);
        WebElement mainCat = driver.findElement(By.xpath("//div[6]/div[2]/ul[1]/li[3]/a[@href='/apparel']"));
        mouseHover.moveToElement(mainCat).build().perform();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[6]/div[2]/ul[1]/li[3]/ul/li[1]/a[@href='/shoes']")));

        WebElement subCat = driver.findElement(By.xpath("//div[6]/div[2]/ul[1]/li[3]/ul/li[1]/a[@href='/shoes']"));
        mouseHover.moveToElement(subCat);

        mouseHover.click().build().perform();

        System.out.println(driver.getCurrentUrl());

    }
}
