package org.jai.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html:test-output", "junit:junit_xml/cucumber.xml", "pretty"},
features = {"src/test/resources/features/"},
tags = {"@friday"})
public class RunCucumberTest {
}
