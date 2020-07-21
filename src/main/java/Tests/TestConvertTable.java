package Tests;

import Pages.PageContact;
import Pages.PageConvertTable;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestConvertTable extends TestBase {


    PageConvertTable TCT;
    @BeforeMethod
    public void initElement(){

        TCT = PageFactory.initElements(getWebDriver(), PageConvertTable.class);
    }

    @Test
    public void testConvert(){

        TCT.methodConvert();

        Assert.assertTrue(TCT.conversion("Result: 273.15 K"));
    }
}
