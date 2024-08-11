package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\sharm\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\InstaJunit\\src\\test\\resources\\InstaSRpg\\Signup.feature"
,glue = "steps")

public class InstaRunner extends AbstractTestNGCucumberTests{

}
