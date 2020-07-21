package Tests;

import Pages.PageWesHistory;
import Pages.PageWorld;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestWorld extends TestBase {

    PageWorld PW;
    @BeforeMethod
    public void initElement(){
        PW = PageFactory.initElements(getWebDriver(),PageWorld.class);

    }

    @Test
    public void testWorld(){

        PW.methodWorld();

        Assert.assertTrue(PW.hawWe("Hawaii Weather"));
    }
}
