package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pageObjects.AveneProductsPage;
import pageObjects.HomePage;

import static hooks.GlobalHooks.driver;

public class NavigateUsingKeyboardStepDefinitions {
    @When("customer use tab key")
    public static void customerUseTabKey() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.TAB).build().perform();
    }

    @And("customer use enter key")
    public static void customerUseEnterKey() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).build().perform();
    }

    @When("customer add to cart one product")
    public static void customerAddToCartOneProduct() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.TAB).build().perform();
    }
}