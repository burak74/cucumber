package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "C:/Users/Burak/eclipse-workspace/APIFramework/src/test/java/features",
		glue= {"stepDefinitions"}
		)
public class TestRunner {

	
}
