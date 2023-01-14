package PageObject;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/featureFiles/Codingchallenge.feature"
		,glue={"amazonSteps"}
		)

public class Runner extends AbstractTestNGCucumberTests{
	
}