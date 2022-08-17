package StepDefinations;
import org.junit.runner.RunWith;
 
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(
        features= {"@target/failedrerun.txt"},
        glue= {"StepDefinations"},
        //tags= ("not @Smoke"),
        dryRun=false,//Need to check on that
        monochrome=true,
        //plugin= {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
        //plugin= {"pretty", "html:target/cucumber-report.html"}
//        plugin= {"pretty", "json:target/cucumber-report/Cucumber.json"}
        plugin={"pretty", "rerun:target/failedrerun.txt"} 
        )
 
 

public class Failedruntestcases {
 
}