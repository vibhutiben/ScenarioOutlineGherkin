package abc;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static com.sun.deploy.cache.Cache.copyFile;

public class Hook extends BasePage{

BrowserSelector browserSelector = new BrowserSelector();
    static String timeStamp = new SimpleDateFormat("dd.MM.yy.HH.mm.ss").format(new Date());

@Before
public void setUpBrowser(){

    browserSelector.browser();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
    driver.manage().window().maximize();
    driver.get("https://demo.nopcommerce.com/");

}
@After
    public void closeBrowser(Scenario scenario){

        if(scenario.isFailed()){

            TakesScreenshot ts = (TakesScreenshot) driver;//Create object
            File source = ts.getScreenshotAs(OutputType.FILE);//call get method and take a screenshot and keep in a memory(file)

            try {
                FileHandler.copy(source, new File("./Screenshots/"+scenario.getName()+".png"));
                System.out.println("Screenshot Taken");


            } catch (IOException e) {

            }
        }
        driver.quit();
    }}



