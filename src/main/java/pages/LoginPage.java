package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "username")
    WebElement username;
    @FindBy(id= "password")
    WebElement password;
    @FindBy(id = "Login")
    WebElement loginButton;
    @FindBy(xpath = "//*[@title='My Accounts']")
    WebElement myAccountsCart;

    public void login(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();
    }

    public String getCurrentUrl() {
        waitForVisibilityOfElement(myAccountsCart, 15);
        return driver.getCurrentUrl();
    }
}
