package testRunner ;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./Feature/lgn.feature",
		glue={"stepDefinition","application_Hooks"} ,  //name of package 
		tags="@reg"
		)
public class TestRunner {

}
