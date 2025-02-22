package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AveneProductsPage extends BasePage {
    public AveneProductsPage(WebDriver driver) { super(driver); }

    @FindBy(xpath = "//*[@id=\"server-products-grid\"]/div[4]/div[6]/div[2]/button")
    WebElement AddToCartConcentratAntiImperfectiuni;

    public void clickAddToCartConcentratAntiImperfectiuni() {AddToCartConcentratAntiImperfectiuni.click();}

    @FindBy(xpath = "//*[@id=\"server-products-grid\"]/div[4]/a[1]/img")
    WebElement AddToWishList;

    public void clickAddToWishList() {AddToWishList.click();}

    @FindBy(xpath = "//*[@id=\"server-products-grid\"]/div[4]/a[2]/picture/img")
    WebElement ProductDetails;

    public void clickProductDetails() {ProductDetails.click();}

    @FindBy(id = "top-cart-btn")
    WebElement CartButton;

    public void clickCartButton() {CartButton.click();}

    @FindBy(xpath = "//*[@id=\"cart-popup\"]/div/div[3]/div[3]/a")
    WebElement PurchaseButton;

    public void clickPurchaseButton() {PurchaseButton.click();}

    @FindBy(xpath = "//*[@id=\"server-products-grid\"]/div[4]/div[7]/ul/li[2]")
    WebElement ForMeList;

    public void clickForMeList() {ForMeList.click();}

    @FindBy(id = "top-wishlist")
    WebElement WishList;

    public void clickWishList() {WishList.click();}

}


