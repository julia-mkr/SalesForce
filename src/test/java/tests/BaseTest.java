package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    ChromeOptions options;
    LoginPage loginPage;
    NewAccountModalPage newAccountModalPage;
    PageOfCreatedAccount pageOfCreatedAccount;

    public static final String LOGIN = "jtest2011-7knz@force.com";
    public static final String PASSWORD = "Gq2KPsXekAb*ySd%";
    public static final String URL = "https://tms3.my.salesforce.com";
    public static final String HOME_PAGE_URL = URL + "/lightning/page/home";

    @BeforeMethod
    public void initTest() {
        WebDriverManager.chromedriver().setup();
        options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        newAccountModalPage = new NewAccountModalPage(driver);
        pageOfCreatedAccount = new PageOfCreatedAccount(driver);
    }

    @AfterMethod
    public void closeDriver() {
        driver.quit();
    }
}
