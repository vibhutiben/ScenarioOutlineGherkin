package abc;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(features = "src\\test\\Resources\\Feature", tags = "@login",
            format = {"pretty","html:target/cucumber-reports"})


    public class RunTest {

}
