package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageOfCreatedAccount extends BasePage {

    public PageOfCreatedAccount(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(), 'Details')]")
    WebElement detailTab;
    @FindBy(xpath = "(//*[contains(@class,'field-value')]//lightning-formatted-text)[1]")
    WebElement nameOfCreatedAccount;
    @FindBy(xpath = "//*[contains(@class,'field-value')]//lightning-formatted-phone//a")
    WebElement phoneOfCreatedAccount;
    @FindBy(xpath = "//*[contains(@class,'field-value')]//lightning-formatted-url//a")
    WebElement websiteOfCreatedAccount;
    @FindBy(xpath = "(//*[contains(@class,'field-value')]//lightning-formatted-text)[3]")
    WebElement descriptionOfCreatedAccount;

    public void clickOnDetailTab() {
        detailTab.click();
    }

    public String getNameOfCreatedAccount() {
        return nameOfCreatedAccount.getText();
    }

    public String getWebsiteOfCreatedAccount() {
        return websiteOfCreatedAccount.getText();
    }

    public String getDescriptionOfCreatedAccount() {
        return descriptionOfCreatedAccount.getText();
    }

    public String getPhoneOfCreatedAccount() {
        return phoneOfCreatedAccount.getText();
    }
}
