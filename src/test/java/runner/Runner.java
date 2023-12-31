package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:src/test/resources/reports/Reports.html"},
        features = "src/test/resources/features",
        glue ="stepdef",
        tags = "@API_TC11 and @TC02"

)
public class Runner {

}