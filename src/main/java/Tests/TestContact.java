package Tests;

import Pages.PageContact;
import Pages.PageLineMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestContact extends TestBase {

    PageContact PC;

    @BeforeMethod
    public void initElement(){

        PC = PageFactory.initElements(getWebDriver(),PageContact.class);
    }

    @Test
    public void testContact(){
        
        PC.methodContact();

        Assert.assertTrue(PC.cap());
    }
}
