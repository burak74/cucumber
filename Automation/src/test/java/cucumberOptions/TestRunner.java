package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/Users/Burak/eclipse-workspace/Automation/src/test/java/features/Login.feature",
		glue = "stepDefinitions"		
		)
public class TestRunner {

	
	
}
