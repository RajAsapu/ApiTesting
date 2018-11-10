package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "json:out/cucumber-json-report.json", features = "src/test/resources/", glue = "classpath:", tags = {})
public class RunTest {
    @AfterClass
    public static void generateReport() {
        File reportOutputDirectory = new File("out");
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("out/cucumber-json-report.json");

        String projectName = "API Testing";

        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();
    }
}
