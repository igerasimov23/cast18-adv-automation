package cucumber;


import base.UITests;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "cucumber.stepdefs",
        features = "src/test/java/cucumber/features",
        plugin = "pretty"
)
public class CucumberTestActions {

    @BeforeClass
    public static void setUp() {
        UITests.launchApplication();
    }

    @AfterClass
    public static void tearDown() {
        UITests.tearDown();
    }


}
