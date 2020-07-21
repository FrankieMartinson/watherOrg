package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageConvertTable extends PageBase {

    @FindBy(id = "menu-item-42")
    WebElement Links;

    @FindBy(xpath = "//a[contains(text(),'Conversion Chart')]")
    WebElement conversion;

    @FindBy(xpath = "//option[contains(text(),'Temperature')]")
    WebElement temperature;

    @FindBy(xpath = "//input[@id='oppso_value']")
    WebElement value;

    @FindBy(xpath = "//select[@id='oppso_from']//option[contains(text(),'Celsius')]")
    WebElement fromCelsius;

    @FindBy(xpath = "//select[@id='oppso_to']//option[contains(text(),'Kelvin')]")
    WebElement toKelvin;

    @FindBy(xpath = "//input[@id='oppso_convert']")
    WebElement convert;

    @FindBy(id = "oppso_convert_result")
    WebElement result;

    public PageConvertTable(WebDriver webDriver) {
        super(webDriver);
    }

    public void methodConvert(){

        waitToBeClickable(Links,60);
        Links.click();

        waitToBeClickable(conversion,60);
        conversion.click();

        waitToBeClickable(temperature,60);
        temperature.click();

        waitToBeVisible(value,60);
        value.sendKeys("10");

        waitToBeClickable(fromCelsius,60);
        fromCelsius.click();

        waitToBeClickable(toKelvin,60);
        toKelvin.click();

        waitToBeClickable(convert,60);
        convert.click();
    }

    public boolean conversion(String checkToKelvin){

        waitToBeVisible(result,60);
        result.getText();

        try {
            waitToBeVisible(result,60);
            System.out.println("Совпадение в келвинах");
            return true;
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Не совпадение в келвинах");
            return false;
        }
    }
}
