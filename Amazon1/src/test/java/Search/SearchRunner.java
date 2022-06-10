package Search;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Search.feature",
glue= {"Search"},
//tags = "@SmokeTest", 
//dryRun = true,
monochrome = true,
plugin={"pretty","junit:target/JunitReports/report2.xml",
		"json:target/JSONReports/report2.json",
		"html:target/HTMLreports2"},
tags=""
)
public class SearchRunner {

}
