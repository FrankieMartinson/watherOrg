package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class PageSearch extends PageBase {

    @FindBy(id = "wcquery")
    WebElement searchText;

    @FindBy(xpath = "//button[@class='picker-city__button']")
    WebElement searchClick;

    @FindBy(xpath = "//a[contains(text(),'USA, California, San Diego')]")
    WebElement SanDiego;

    public PageSearch(WebDriver webDriver) {
        super(webDriver);
    }

    public void MethodSearch(){

        waitToBeVisible(searchText,60);
        searchText.sendKeys("San Diego");

        waitToBeClickable(searchClick,60);
        searchClick.click();
    }

    public String checkCity(){

        ArrayList<String> arrayList = new ArrayList<String>(getWebDriver().getWindowHandles());

        getWebDriver().switchTo().window(arrayList.get(1));

        waitToBeVisible(SanDiego,60);

        System.out.println("City text: " + SanDiego.getText());

        return SanDiego.getText();
    }
}
