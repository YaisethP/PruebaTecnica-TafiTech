package saucedemo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "saucedemo.stepdefinitions",
        tags = "@ui",
        plugin = {"pretty"}
)
public class SaucedemoRunner {
}
