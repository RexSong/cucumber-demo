package org.rexsong.demo.cucumber.sample.runner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features") // include all feature files under classpath: features folder
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "html:target/results.html,message:target/results.ndjson, pretty")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "org.rexsong.demo.cucumber.sample")
public class RunAllTest {
}
