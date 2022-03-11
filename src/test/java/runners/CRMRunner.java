package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		 dryRun = false,
		 publish = true,
		 monochrome = true,
		 
		 features = "src//test//resources//taggedFeatures//",
		 glue = {"stepDefs"},
		 plugin= {"html:target/reports/HtmlReport.html"},
//		 tags="@RegressionTest"
		 //tags="@RegressionTest and @SmokeTest"
		 //tags="@RegressionTest or @SmokeTest"
		 //tags = "not @IntegrationTest"
		 //tags= "@RegressionTest and not @SmokeTest"
		 tags = "@PhaseOne and @RegressionTest"
//		 tags = "@PhaseOne and not @RegressionTest"
//		 tags = "@PhaseOne and @SmokeTest"
//		 tags ="not @RegressionTest and not @SmokeTest and not @IntegrationTest"
		 
		 

		   )
public class CRMRunner {

}
