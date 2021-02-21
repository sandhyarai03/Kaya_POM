package testRunners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepDefination", "appHooks"},
        tags = {"~@Ignore"},
       /* format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "html:target/cucumber-reports/CucumberTestReport.html",
                "rerun:target/cucumber-reports/rerun.txt"}*/
        plugin = {"pretty","html:target/cucumber-reports/CucumberTestReport"},
        
	/*plugin= {"html:target/cucumber-html-report",
	"json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
	"usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml" },
*/	
        monochrome = true)
public class TestRunnerTest{
    private TestNGCucumberRunner testNGCucumberRunner;
 
    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
 
    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }
 
    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }
 
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testNGCucumberRunner.finish();
    }
}
