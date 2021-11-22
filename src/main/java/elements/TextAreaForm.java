package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextAreaForm {

    WebDriver driver;
    String label;

    public TextAreaForm(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    private static final String TEXT_AREA_XPATH = "//*[contains(text(), '%s')]/ancestor::div[contains(@class,'uiInputTextArea')]//textarea";

    public void writeTextInTextAreaField(String text) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(String.format(TEXT_AREA_XPATH, label)))));
        driver.findElement(By.xpath(String.format(TEXT_AREA_XPATH, label))).sendKeys(text);
    }

}
