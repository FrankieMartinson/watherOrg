package Pages;

import Tests.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class PageLineMenu extends PageBase {

    @FindBy(id = "menu-item-16")
    WebElement stormWatch;

    @FindBy(id = "menu-item-15")
    WebElement travel;

    @FindBy(id = "menu-item-118")
    WebElement marine;

    @FindBy(id = "menu-item-134")
    WebElement aviation;

    @FindBy(id = "menu-item-929")
    WebElement agriculture;

    @FindBy(id = "menu-item-125")
    WebElement climate;

    @FindBy(id = "menu-item-128")
    WebElement weatherHistory;

    @FindBy(id = "menu-item-284")
    WebElement world;

    @FindBy(id = "menu-item-42")
    WebElement links;

    @FindBy(id = "menu-item-131")
    WebElement contact;

    @FindBy(xpath = "//h3[contains(text(),'Weather.org  |  World Weather')]")
    WebElement WorldWeather;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/table[1]/tbody[1]/tr[1]")
    WebElement StormWatch;

    @FindBy(xpath = "//h3[contains(text(),'Travel Weather')]")
    WebElement TravelWeather;

    @FindBy(xpath = "//h3[contains(text(),'Agriculture Weather')]")
    WebElement AgricultureWeather;

    @FindBy(xpath = "//span[contains(text(),'Climate Change')]")
    WebElement ClimateChange;

    @FindBy(xpath = "//span[contains(text(),'Weather History')]")
    WebElement WeatherHistory;

    public PageLineMenu(WebDriver webDriver) {
        super(webDriver);
    }

    public String checkLineMenu(){

        ArrayList<String> allText = new ArrayList<String>();

       /* waitToBeVisible(WorldWeather,60);
        allText.add(WorldWeather.getText());*/

        waitToBeClickable(stormWatch,60);
        stormWatch.click();

        waitToBeVisible(StormWatch,60);
        allText.add( StormWatch.getText());

        waitToBeClickable(travel,60);
        travel.click();

        waitToBeVisible(TravelWeather,60);
        allText.add(TravelWeather.getText());

        waitToBeClickable(agriculture,60);
        agriculture.click();

        waitToBeVisible(AgricultureWeather,60);
        allText.add(AgricultureWeather.getText());

        waitToBeClickable(climate,60);
        climate.click();

        waitToBeVisible(ClimateChange,60);
        allText.add(ClimateChange.getText());

        waitToBeClickable(weatherHistory,60);
        weatherHistory.click();

        waitToBeVisible(WeatherHistory,60);
        allText.add(WeatherHistory.getText());


        String txt = "";
        for (int j = 0; j < allText.size(); j ++){
            txt = txt + allText.get(j);
            System.out.println(txt);
        }


       return txt;
    }
}
