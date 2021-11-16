package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageOfCreatedAccount extends BasePage {

    public PageOfCreatedAccount(WebDriver driver) {
        super(driver);
    }

    private static final String FIELD_NAME = "//*[text() = '%s']/ancestor::*[contains(@class, 'form-element')]//lightning-formatted-text";
    @FindBy(xpath = "//a[contains(text(), 'Details')]")
    WebElement detailTab;
    @FindBy(xpath = "//*[contains(@class,'field-value')]//lightning-formatted-phone//a")
    WebElement phoneOfCreatedAccount;
    @FindBy(xpath = "//*[contains(@class,'field-value')]//lightning-formatted-url//a")
    WebElement websiteOfCreatedAccount;

    public void clickOnDetailTab() {
        detailTab.click();
    }

    public String getContentOfField(String fieldLabel) {
        return driver.findElement(By.xpath(String.format(FIELD_NAME, fieldLabel))).getText();
    }

    public String getWebsiteOfCreatedAccount() {
        return websiteOfCreatedAccount.getText();
    }

    public String getPhoneOfCreatedAccount() {
        return phoneOfCreatedAccount.getText();
    }
}
