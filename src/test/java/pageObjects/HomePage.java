package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "CybotCookiebotDialogBodyButtonDecline")
    WebElement Decline;

    public void clickDecline() {Decline.click();}

    @FindBy(xpath = "//*[@id=\"header-search\"]/div/div/div/div[2]/div[3]/a")
    WebElement MyAccount;

    public void clickMyAccount() {MyAccount.click();}

    @FindBy(id = "auth-email")
    WebElement EmailInput;

    public void EmailInput(String email)
    {
        EmailInput.sendKeys(email);
    }

    @FindBy(id = "auth-next-btn-txt")
    WebElement ContinueButton;

    public void clickContinueButton() {ContinueButton.click();}

    @FindBy(id = "auth-login-password")
    WebElement PasswordInput;

    public void PasswordInput(String password) {PasswordInput.sendKeys(password);}

    @FindBy(id = "auth-next-btn")
    WebElement ConnectButton;

    public void clickConnectButton() {ConnectButton.click();}

    @FindBy(xpath = "//*[@id=\"header-links-right\"]/a")
    WebElement LogoutButton;

    public void clickLogoutButton() {LogoutButton.click();}

    @FindBy(id = "desktop-search")
    WebElement SearchBar;

    public void SearchBar(String firstproduct)
    {
        SearchBar.sendKeys(firstproduct);
    }

    @FindBy(id = "submit-button")
    WebElement SubmitButton;

    public void clickSubmitButton() {SubmitButton.click();}

    @FindBy(xpath = "/html/body/header/div[3]/div[1]/div/div/nav/ul/li[1]/a")
    WebElement ProductsButton;

    public void clickProductsButton() {ProductsButton.click();}

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/div/a")
    WebElement PrescriptionDrugs;

    public void clickPrescriptionDrugs() {PrescriptionDrugs.click();}

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/ul/li[4]/div/a")
    WebElement Insulins;

    public void clickInsulins() {Insulins.click();}

}
