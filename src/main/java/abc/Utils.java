package abc;

import org.junit.Assert;
import org.openqa.selenium.By;

public class Utils extends BasePage {
    //Clicking Element
    public static void clickElementBy(By by) {
        driver.findElement(by).click();
    }


    //Enter Text in Input field
    public static void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

//Actual result - Getting Text From Web

    public static void assertTextMessage(By by,String expected){
        String actual =driver.findElement(by).getText();
        Assert.assertEquals(expected,actual);}


        //Click on Elements
    public static void clickElements(By by){
        driver.findElement(by).click();
    }

    //Enter Elements
    public static void enterElements(By by,String text){
        driver.findElement(by).sendKeys(text);

    }
    //Return text from element
    public String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }


}
