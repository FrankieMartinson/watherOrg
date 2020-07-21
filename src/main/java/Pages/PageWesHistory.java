package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class PageWesHistory extends PageBase {

    @FindBy(id = "menu-item-128")
    WebElement WeatherHistory;

    @FindBy(id = "mylocationentry")
    WebElement searchCity;

    @FindBy(xpath = "//option[contains(text(),'Aug')]")
    WebElement monthAug;

    @FindBy(xpath = "//select[@id='edit-searchdate-day']//option[5]")
    WebElement day5;

    @FindBy(xpath = "//option[contains(text(),'1968')]")
    WebElement year1968;

    @FindBy(xpath = "//input[@id='edit-submit']")
    WebElement clickSearch;

    @FindBy(id = "main-content-header")
    WebElement nextPageHistory;

    public PageWesHistory(WebDriver webDriver) {
        super(webDriver);
    }

    public void LAmethod(){

        waitToBeClickable(WeatherHistory,60);
        WeatherHistory.click();

        waitToBeVisible(searchCity,60);
        searchCity.sendKeys("Los Angeles");

        waitToBeClickable(monthAug,60);
        monthAug.click();

        waitToBeClickable(day5,60);
        day5.click();

        waitToBeClickable(year1968,60);
        year1968.click();

        waitToBeClickable(clickSearch,60);
        clickSearch.click();
    }

    public String checkWesHistory(){

        ArrayList<String> arrayList = new ArrayList<String>(getWebDriver().getWindowHandles());

        getWebDriver().switchTo().window(arrayList.get(1));

        String txt = "";

        waitToBeVisible(nextPageHistory,60);
        txt = nextPageHistory.getText();


        return txt;
    }
}
