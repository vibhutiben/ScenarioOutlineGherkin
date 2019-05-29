package abc;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends Utils {
LoadProp loadProp = new LoadProp();


public void browser(){
String browser = loadProp.getProperty("browser");
String setUpBrowser = System.getProperty("setUpBrowser");
if(browser.equalsIgnoreCase("chrome")){
    System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
     else{System.out.println("Browser name is Empty or typed wrong:"+browser);

}
}

}
