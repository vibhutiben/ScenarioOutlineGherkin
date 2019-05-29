package abc;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    By loginlink = By.linkText("Log in");

    public void clickOnLoginLink(){
        clickElementBy(loginlink);
    }
}

