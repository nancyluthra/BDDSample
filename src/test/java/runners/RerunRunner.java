package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		 dryRun = false,
		 publish = true,
		 monochrome = true,		 
		 features = "@target/failed_scenarios.txt",
		 glue = {"stepDefs"},
		 plugin = {"pretty"}
				 
		   )
public class RerunRunner {

}
