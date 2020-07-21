package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

    private WebDriver webDriver = new ChromeDriver();


    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @BeforeTest
    public void beforeTest(){

        webDriver.get("https://www.weather.org/");
    }

   /* @AfterTest
    public void closeMethod() throws InterruptedException {
        Thread.sleep(10000);
       webDriver.quit();
    }*/
}
