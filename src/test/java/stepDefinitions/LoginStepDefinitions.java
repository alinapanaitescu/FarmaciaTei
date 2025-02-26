package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.HomePage;

import java.time.Duration;

import static hooks.GlobalHooks.driver;

public class LoginStepDefinitions {
    @Given("access link")
    public void accessLink() {
        HomePage homePage = new HomePage(driver);
    }

    @When("click my account button")
    public void clickMyAccountButton() {
        HomePage homePage = new HomePage(driver);
        homePage.clickDecline();
        homePage.clickMyAccount();
    }

    @And("Customer enters {string}")
    public void customerEnters(String email) {
        HomePage homePage = new HomePage(driver);
        homePage.EmailInput(email);
    }

    @And("Customer clicks continue button")
    public void customerClicksContinueButton() {
        HomePage homePage = new HomePage(driver);
        homePage.clickContinueButton();
    }

    @And("Customer enters password {string}")
    public void customerEntersPassword(String password) {
        HomePage homePage = new HomePage(driver);
        homePage.PasswordInput(password);
    }

    @And("Customer clicks connect button")
    public void customerClicksConnectButton() {
        HomePage homePage = new HomePage(driver);
        homePage.clickConnectButton();
    }

    @Then("current URL contains {string}")
    public void currentURLContains(String expectedPartialLink) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        boolean isURLUpdated = wait.until(ExpectedConditions.urlContains(expectedPartialLink));
        Assert.assertTrue("The URL does not contain the expected partial link", isURLUpdated);
    }

    @And("Customer click logout button")
    public void customerClickLogoutButton() {
        HomePage homePage = new HomePage(driver);
        homePage.clickLogoutButton();
    }


    @Then("an error message is displayed {string}")
    public void anErrorMessageIsDisplayed(String expected) {
        String actualErrorMessage;
        String expectedErrorMessage;

        switch (expected.toLowerCase()) {
            case "invalid password":
                actualErrorMessage = driver.findElement(By.id("auth-login-password-error")).getText();
                expectedErrorMessage = "Parola nu este validă";
                org.junit.Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
                break;

            case "invalid email":
                actualErrorMessage = driver.findElement(By.id("step-register-txt")).getText();
                expectedErrorMessage = "Introduceți restul de date pentru a vă putea crea un ";
                org.junit.Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
                break;

            default:
                org.junit.Assert.fail("Unexpected behavior specified: " + expected);
        }

    }
}
