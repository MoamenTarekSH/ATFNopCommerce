package Runner;

import Tests.TestBase;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/Features/RgisterAndCheckout.feature"}
,glue = {"Steps"}
,plugin = {"pretty","html:target/Out_report.html"})
public class CheckRunner extends TestBase
{

}
