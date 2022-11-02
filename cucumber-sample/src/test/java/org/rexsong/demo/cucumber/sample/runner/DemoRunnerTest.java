package org.rexsong.demo.cucumber.sample.runner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features") // include all feature files under classpath: features folder
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "html:target/results.html,message:target/results.ndjson, pretty")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "org.rexsong.demo.cucumber.sample")
// @ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@Regression") // filter by tags
public class DemoRunnerTest {
}
