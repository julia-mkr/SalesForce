package tests;

import objects.Accounts;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountTests extends BaseTest {

    private static final String ACCOUNT_NAME = "Automation Account";
    private static final String WEBSITE = "www.automation-test.com";
    private static final String PHONE = "375298923554";
    private static final String DESCRIPTION = "Some description";
    private static final String INDUSTRY_TYPE = "Apparel";

    @Test(description = "The creates a new account and fills in the following fields: Account Name, Website, Phone, and Description.")
    public void createAccountTest() {
        Accounts realAccount = new Accounts("Automation Account", "www.automation-test.com", "Apparel", "375298923554", "Some description");
        loginPage.openPage(URL);
        loginPage.login(LOGIN, PASSWORD);
        newAccountModalPage.createNewAccount(realAccount);
        pageOfCreatedAccount.clickOnDetailTab();
        Assert.assertEquals(pageOfCreatedAccount.getContentOfField("Account Name"), ACCOUNT_NAME);
        Assert.assertEquals(pageOfCreatedAccount.getWebsiteOfCreatedAccount(), WEBSITE);
        Assert.assertEquals(pageOfCreatedAccount.getContentOfField("Description"), DESCRIPTION);
        Assert.assertEquals(pageOfCreatedAccount.getPhoneOfCreatedAccount(), PHONE);
    }
}
