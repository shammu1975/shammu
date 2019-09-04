package mybdcrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\training_b6b.01.07\\eclipse\\java-2019-06\\eclipse\\Desktop\\sham\\cucumberproj\\Features99\\demo1.feature",glue = "BDCstepdefinations",tags= {"@Sanity,@Regression"},plugin= {"pretty","html:target/cucumber-html-report","json:target/shammudemo-JSON-report"})
public class BDCRunner {

}
