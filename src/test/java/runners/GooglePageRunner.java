package runners;

import static org.junit.Assert.*;

import org.junit.Test;
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
//				 "rerun:target/failed_scenarios.txt",				 
	//			 html:target/reports/HtmlReport.html",
//				 "json:target/reports/Reports.json",
//				 "usage:target/reports/usagereport",
//				 "junit:target/reports/junitreports.xml",
//				 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

		 }
		   )

public class GooglePageRunner {
	

   

   
}
