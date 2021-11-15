package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test(description = "The test logs in to the website with valid data")
    public void loginToWebsiteTest() {
        loginPage.openPage(URL);
        loginPage.login(LOGIN, PASSWORD);
        Assert.assertEquals(HOME_PAGE_URL, HOME_PAGE_URL);
    }
}
