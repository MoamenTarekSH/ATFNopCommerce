package Runner;

import Tests.TestBase;



@io.cucumber.testng.CucumberOptions(features = {"src/test/java/Features/UserRegisteration.feature"}
, glue = {"Steps"} 
, plugin = {"pretty","html:CucumberOut/cucumber-html-report.html"})
public class TestRunner extends TestBase 
{

}
