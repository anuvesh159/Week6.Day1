package runner;

import io.cucumber.testng.CucumberOptions.SnippetType;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/features/CreateLead1.feature", glue="steps",

 monochrome = true, dryRun = false, snippets = SnippetType.CAMELCASE, publish = true )


public class RunnerCL extends AbstractTestNGCucumberTests {
	
}
