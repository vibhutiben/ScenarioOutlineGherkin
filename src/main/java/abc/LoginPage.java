package abc;

import org.openqa.selenium.By;

public class LoginPage extends Utils {

    By emailField = By.id("Email");
    By passField = By.id("Password");
    By loginBtn = By.xpath("//input[@class='button-1 login-button']");
    By errorMessage = By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]");
   // By emailErrorMessage = By.cssSelector("#Email-error");




public void userEnterLoginDetails(String Email, String Password){
    enterElements(emailField,Email);
    enterElements(passField,Password);
    clickElementBy(loginBtn);
}



}