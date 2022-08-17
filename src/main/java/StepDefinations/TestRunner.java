package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(
	 //  features="src\\test\\java\\Features\\AutomationZone.feature",
      features="src\\test\\java\\Features\\Login.feature", 		
       glue= {"StepDefinations"},
     // plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
      monochrome = true,
      plugin={"pretty", "rerun:target/failedrerun.txt"}
    		  // plugin= {"pretty", "html:target/cucumber-report.html"}
    
        )
public class TestRunner {
}


