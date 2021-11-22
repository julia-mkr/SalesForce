package pages;

import elements.*;
import objects.Accounts;
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

    public void createNewAccount(Accounts accounts) {
        openPage(NEW_ACCOUNT_URL);
        new InputField(driver, "Account Name").writeTextInInputField(accounts.getAccountName());
        new InputField(driver, "Website").writeTextInInputField(accounts.getWebsite());
        new InputField(driver, "Phone").writeTextInInputField(accounts.getPhone());
        new TextAreaForm(driver, "Description").writeTextInTextAreaField(accounts.getDescription());
        new DropDown(driver, "Industry").selectOption(accounts.getIndustryType());
        clickSave();
    }

    public void clickSave() {
        saveButton.click();
    }
}

