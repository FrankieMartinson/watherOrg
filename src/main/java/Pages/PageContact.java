package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageContact extends PageBase {

    @FindBy(id = "menu-item-131")
    WebElement contactField;

    @FindBy(id = "wpforms-2255-field_0")
    WebElement name;

    @FindBy(id = "wpforms-2255-field_0-last")
    WebElement last;

    @FindBy(id = "wpforms-2255-field_1")
    WebElement email;

    @FindBy(id = "wpforms-2255-field_2")
    WebElement comment;

    @FindBy(id = "wpforms-2255-field_2")
    WebElement robot;

    @FindBy(id = "wpforms-submit-2255")
    WebElement submit;

    @FindBy(id = "rc-imageselect")
    WebElement captcha;

    public PageContact(WebDriver webDriver) {
        super(webDriver);
    }

    public void methodContact(){

        waitToBeClickable(contactField,60);
        contactField.click();

        waitToBeVisible(name,60);
        name.sendKeys("Mike");

        waitToBeVisible(last,60);
        last.sendKeys("Jonson");

        waitToBeVisible(email,60);
        email.sendKeys("dinegef205@lexu4g.com");

        waitToBeVisible(comment,60);
        comment.sendKeys("This very good site");

        waitToBeClickable(robot,60);
        robot.click();

        waitToBeClickable(submit,60);
        submit.click();
    }

    public boolean cap(){
        try {
            waitToBeVisible(captcha,60);
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
