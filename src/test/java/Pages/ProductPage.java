package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {

    // Filter By Color
    public static WebElement filterByColorGray(WebDriver driver)
    {
        return driver.findElement(By.xpath("//*[@id=\"attribute-option-14\"]"));
    }

    // Select awesome Tag
    public static WebElement selectSpecTag(WebDriver driver)
    {
        return driver.findElement(By.linkText("awesome"));
    }

    // Choose product and
    public static WebElement chooseProduct(WebDriver driver)
    {
        return driver.findElement(By.linkText("If You Wait (donation)"));
    }

    // Add To Cart
    public static WebElement addToCart(WebDriver driver)
    {
        return driver.findElement(By.id("add-to-cart-button-35"));
    }

    // Add To Wishlist
    public static WebElement clickWishCatBut(WebDriver driver)
    {
        return driver.findElement(By.id("add-to-wishlist-button-35"));
    }

    // Add To Comparelist
    public static WebElement addToComparelist(WebDriver driver)
    {
        return driver.findElement(By.xpath("//button[@class=\"button-2 add-to-compare-list-button\"]"));
    }
}
