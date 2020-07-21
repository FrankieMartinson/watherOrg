package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {

    private WebDriver webDriver;

    public PageBase(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void waitToBeClickable(By by, int time){
        new WebDriverWait(webDriver, time).until(ExpectedConditions.elementToBeClickable(by));
    }

    public void waitToBeClickable(WebElement webElement, int time){
        new WebDriverWait(webDriver, time).until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public void waitToBeVisible(WebElement webElement, int time){
        new WebDriverWait(webDriver, time).until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitToBeVisible(By by, int time){
        new WebDriverWait(webDriver, time).until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}
