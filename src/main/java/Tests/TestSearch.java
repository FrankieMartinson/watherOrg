package Tests;

import Pages.PageLineMenu;
import Pages.PageSearch;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSearch extends TestBase {

    PageSearch PS;
    @BeforeMethod
    public void initElement(){

        PS = PageFactory.initElements(getWebDriver(),PageSearch.class);
    }

    @Test
    public void testSearch(){

        PS.MethodSearch();
        PS.checkCity();

        String check = PS.checkCity();
        Assert.assertEquals(check,"USA, California, San Diego");

    }
}
