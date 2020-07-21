package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageWorld extends PageBase {

    @FindBy(id = "menu-item-284")
    WebElement World;

    @FindBy(xpath = "//div[@class='entry-content']//a[contains(text(),'US Weather Forecast')]")
    WebElement USweather;

    @FindBy(xpath = "//div[@class='entry-content']//table//tbody//tr//td//div//span//span//a[contains(text(),'Hawaii')]")
    WebElement Hawaii;

    @FindBy(xpath = "//h3[contains(text(),'Hawaii Weather')]")
    WebElement res;

    public PageWorld(WebDriver webDriver) {
        super(webDriver);
    }

    public void methodWorld(){

        waitToBeClickable(World,60);
        World.click();

        waitToBeClickable(USweather,60);
        USweather.click();

        waitToBeClickable(Hawaii,60);
        Hawaii.click();
    }

    public boolean hawWe(String checkHawaii){

        waitToBeVisible(res,60);

        String result = res.getText();

        if (result.equals(checkHawaii)){
            System.out.println("Совпадение штатата");
            return true;
        }else {
            System.out.println("Не совпадение штата");
            return false;
        }

    }
}
