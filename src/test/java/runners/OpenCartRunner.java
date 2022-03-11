package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		 dryRun = false,
		 publish = true,
		 monochrome = true,
		 
		 features = "src//test//resources//features//OpenCartLogin.feature",
		 glue = {"stepDefs"},
		 plugin = {"pretty"		 
			      //,"html:target/reports/HtmlReport.html"


		 }
		   )
public class OpenCartRunner {

}
