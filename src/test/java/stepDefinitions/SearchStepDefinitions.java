package stepDefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.AveneProductsPage;
import pageObjects.HomePage;

import java.time.Duration;

import static hooks.GlobalHooks.driver;
import static sun.jvm.hotspot.oops.CellTypeState.top;

public class SearchStepDefinitions {
    @When("customer search in search bar a firstproduct {string}")
    public void customerSearchInSearchBarAFirstProduct(String firstproduct) {
        HomePage homePage = new HomePage(driver);
        homePage.clickDecline();
        homePage.SearchBar(firstproduct);
    }

    @And("click submit button")
    public void clickSubmitButton() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSubmitButton();
    }


    @And("Customer clicks products button")
    public void customerClicksProductsButton() {
        HomePage homePage = new HomePage(driver);
        homePage.clickProductsButton();
    }

    @And("customer click prescription drugs")
    public void customerClickPrescriptionDrugs() {
        HomePage homePage = new HomePage(driver);
        homePage.clickPrescriptionDrugs();
    }

    @And("customer click insulins button")
    public void customerClickInsulinsButton() {
        HomePage homePage = new HomePage(driver);
        homePage.clickInsulins();
    }

    @And("add to cart firstproduct")
    public void addToCartFirstproduct() {
        AveneProductsPage aveneProductsPage = new AveneProductsPage(driver);
        aveneProductsPage.clickAddToCartConcentratAntiImperfectiuni();

    }

    @And("add to wish list firstproduct")
    public void addToWishListFirstproduct() {
        AveneProductsPage aveneProductsPage = new AveneProductsPage(driver);
        aveneProductsPage.clickAddToWishList();

    }

    @And("user click on a specific firstproduct")
    public void userClickOnASpecificFirstproduct() {
        AveneProductsPage aveneProductsPage = new AveneProductsPage(driver);
        aveneProductsPage.clickProductDetails();

    }


    @Then("cart quantity changed to {string}")
    public void cartQuantityChangedToExpectedCartQuantity(String expectedCartQuantity) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement cartQuantityElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top-cart-btn-qty\"]")));
        String actualCartQuantity = cartQuantityElement.getText().trim();
        Assert.assertEquals("Cart quantity did not match", expectedCartQuantity, actualCartQuantity);
    }

    @And("click cart button")
    public void clickCartButton() {
        AveneProductsPage aveneProductsPage = new AveneProductsPage(driver);
        aveneProductsPage.clickCartButton();
    }

    @And("click purchase button")
    public void clickPurchaseButton() {
        AveneProductsPage aveneProductsPage = new AveneProductsPage(driver);
        aveneProductsPage.clickPurchaseButton();
    }

    @When("customer search in search bar again a firstproduct {string}")
    public void customerSearchInSearchBarAgainAFirstproduct(String firstproduct) {
        HomePage homePage = new HomePage(driver);
        homePage.SearchBar(firstproduct);
    }

    @And("select list")
    public void selectList() {
        AveneProductsPage aveneProductsPage = new AveneProductsPage(driver);
        aveneProductsPage.clickForMeList();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @And("click wish list")
    public void clickWishList() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        AveneProductsPage aveneProductsPage = new AveneProductsPage(driver);
        aveneProductsPage.clickWishList();
    }
}
