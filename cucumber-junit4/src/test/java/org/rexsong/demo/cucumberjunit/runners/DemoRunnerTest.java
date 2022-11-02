package org.rexsong.demo.cucumberjunit.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = {"classpath:features"},
                  glue = {"org.rexsong.demo.cucumberjunit.steps"},
                  plugin = { "html:target/results.html", "message:target/results.ndjson" })
public class DemoRunnerTest {
}
