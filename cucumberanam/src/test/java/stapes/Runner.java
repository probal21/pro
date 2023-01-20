package stapes;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "feature",
			glue = "stapes", 
			plugin = { 
					"pretty", "json:target/report/json/output.json",
					"html:target/report/html/index.html" },
			tags = ("@deposit"))

	public class Runner {

	}

