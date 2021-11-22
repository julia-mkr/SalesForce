package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputField {

    WebDriver driver;
    String label;

    public InputField(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    private static final String INPUT_XPATH = "//*[contains(text(),'%s')]/ancestor::div[contains(@class,'uiInput')]//input";

    public void writeTextInInputField(String text) {
        waitForVisibilityOfElement(driver.findElement(By.xpath(String.format(INPUT_XPATH, label))), 10);
        driver.findElement(By.xpath(String.format(INPUT_XPATH, label))).sendKeys(text);
    }

    public void waitForVisibilityOfElement(WebElement element, int timeout) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, timeout);
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }
}

