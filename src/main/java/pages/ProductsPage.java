package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {

    private WebDriver driver;
    private By addToCartButton = By.id("add-to-cart-sauce-labs-bike-light");
    private By sortDropdown = By.cssSelector(".product_sort_container");
    private By cartButton = By.cssSelector(".shopping_cart_link");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }


    public void addFirstProductToCart() {
        WebElement firstAddToCartBtn = driver.findElement(addToCartButton);
        firstAddToCartBtn.click();
    }

    public void addProductToCart(int productIndex) {
        WebElement addToCartBtn = driver.findElements(addToCartButton).get(productIndex);
        addToCartBtn.click();
    }

    public void sortProducts(String sortByOption) {
        WebElement sortDropdownElement = driver.findElement(sortDropdown);
        Select dropdown = new Select(sortDropdownElement);
        dropdown.selectByVisibleText(sortByOption);
    }

    public void goToCart() {
        WebElement cartBtn = driver.findElement(cartButton);
        cartBtn.click();
    }
}
