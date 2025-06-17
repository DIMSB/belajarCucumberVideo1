package runner;

import io.cucumber.core.backend.Glue;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.plugin.Plugin;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/resources/feature",
            glue = "stepDefenition",
            plugin = {"pretty"},
            monochrome = false
    )
    public class cucumberRunner{}



