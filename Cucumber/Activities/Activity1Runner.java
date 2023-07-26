import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "features",
        glue= {"stepDefinitions"},
        plugin = { "html:target/cucumber-reports/reports.html" },
        monochrome = true
)


public class Activity1Runner {
}
