package pages;

import elements.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAccountModalPage extends BasePage {

    public NewAccountModalPage(WebDriver driver) {
        super(driver);
    }

    private static final String NEW_ACCOUNT_URL = "https://tms3.lightning.force.com/lightning/o/Account/new";

    @FindBy(xpath = "//*[contains(@class,'forceActionButton')]//*[text()='Save']")
    WebElement saveButton;

    public void createNewAccount(String accountName, String website, String phone, String description) {
        openPage(NEW_ACCOUNT_URL);
        new InputField(driver, "Account Name").writeTextInInputField(accountName);
        new InputField(driver, "Website").writeTextInInputField(website);
        new InputField(driver, "Phone").writeTextInInputField(phone);
        new TextAreaForm(driver, "Description").writeTextInTextAreaField(description);
        clickSave();
    }

    public void clickSave() {
        saveButton.click();
    }
}

