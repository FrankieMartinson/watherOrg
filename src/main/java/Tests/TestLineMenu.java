package Tests;

import Pages.PageLineMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLineMenu extends TestBase {

    PageLineMenu PLM;
    @BeforeMethod
    public void initElement(){

        PLM = PageFactory.initElements(getWebDriver(),PageLineMenu.class);
    }

    @Test
    public void testMenu(){

        Assert.assertEquals("Storm watch | Hurricane Tracking & Tropical Cyclone ForecastTravel " +
                "WeatherAgriculture WeatherClimate ChangeWeather History",PLM.checkLineMenu());
    }
}
