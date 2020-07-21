package Tests;

import Pages.PageSearch;
import Pages.PageWesHistory;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestWesHistory extends TestBase {

    PageWesHistory PWH;
    @BeforeMethod
    public void initElement(){
        PWH = PageFactory.initElements(getWebDriver(),PageWesHistory.class);

    }

    @Test
    public void testWethHistory(){

        PWH.LAmethod();

        //System.out.println("res: " + PWH.checkWesHistory());
       Assert.assertEquals(PWH.checkWesHistory(),"WEATHER HISTORY ARCHIVE");
    }
}
