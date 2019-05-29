package abc;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepDefs {

    HomePage homePage= new HomePage();
    LoginPage loginPage = new LoginPage();


    @Given("^user is on Login Page$")
    public void userIsOnLoginPage() {
        homePage.clickOnLoginLink();
    }

    @When("^user enters invalid \"([^\"]*)\" and/or \"([^\"]*)\"$")
    public void userEntersInvalidAndOr(String Email, String Password) throws Throwable {
        loginPage.userEnterLoginDetails(Email,Password);

    }

    @Then("^user should able to see the \"([^\"]*)\"$")
    public void userShouldAbleToSeeThe(String errormessage) throws Throwable {
        boolean b;
        if(errormessage.contains("No customer account found")||(errormessage.contains("Please enter your email"))){
            b= true;
        }else {
            b= false;
        }
        Assert.assertTrue(b);

    }
}
