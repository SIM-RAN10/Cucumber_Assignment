package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\sharm\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\CucumberPROJECT\\src\\test\\resources\\Assign\\Form.feature",
glue = "steps")

public class FormRunner extends AbstractTestNGCucumberTests {

}
