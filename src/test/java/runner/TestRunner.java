package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
(
		plugin = {"pretty","html:test-output","json:test-output/cucumber.json"},
    	
		features = {"src/test/java/features"},
		//tags= {"@F_Login"},
    	//tags= {"@Sanity"},
    	//tags= {"@Regression"},
    	tags= {"@API"},
    	glue = {"stepdef"}
    
    	
    		
		)

public class TestRunner {

}
