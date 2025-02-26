package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {".//src/test/resources/feature/Login.feature",
       // ".//src/test/resources/feature/Registration.feature"
        },
        glue = {"hooks", "stepDefinitions"},
        plugin = {"pretty", "html:reports/myreport.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        // 1. Add dependency to pom.xml
        // 2. Add extent.properties file
        // 3. Add plugin attribute to CucumberOptions > TestRunner class
        // 4. Tests need to be run using : mvn test
        tags = "@Sanity"
)
public class TestRunner {
}
