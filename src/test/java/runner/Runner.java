package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)


@CucumberOptions(
		features = "src/test/java/feature"
		,glue = "stepDefinations"
		,monochrome = true
		,publish= true
		,tags = "@incorrectusername"
		)

public class Runner {

}
